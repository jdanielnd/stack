package state

import (
	"context"
	"sync"
	"time"

	"github.com/formancehq/ledger/pkg/core"
	"github.com/formancehq/ledger/pkg/storage"
	"github.com/formancehq/stack/libs/go-libs/errorsutil"
	"github.com/pkg/errors"
)

type ReserveRequest struct {
	Timestamp core.Time
	Reference string
}

type Store interface {
	ReadLogWithReference(ctx context.Context, reference string) (*core.Log, error)
}
type StoreFn func(ctx context.Context, reference string) (*core.Log, error)

func (fn StoreFn) ReadLogWithReference(ctx context.Context, reference string) (*core.Log, error) {
	return fn(ctx, reference)
}

var NoOpStore StoreFn = func(ctx context.Context, reference string) (*core.Log, error) {
	return nil, nil
}

// State store in flight transactions
type State struct {
	mu                 sync.Mutex
	store              Store
	moreRecentInFlight *inFlight
	// inFlights container in flight transactions
	inFlights            map[*inFlight]struct{}
	inFlightsByReference map[string]*inFlight
	// lastTransactionDate store the more recent processed transactions
	// the matching log could be written or not
	lastTransactionDate core.Time
	// allowPastTimestamps allow to insert transactions in the past
	allowPastTimestamps bool
}

func (s *State) checkConstraints(ctx context.Context, r ReserveRequest) error {
	if !s.allowPastTimestamps {
		if s.moreRecentInFlight != nil && s.moreRecentInFlight.timestamp.After(r.Timestamp) {
			return errorsutil.NewError(ErrPastTransaction,
				errors.Errorf("%s (passed) is %s before %s (last)", r.Timestamp.Format(time.RFC3339Nano),
					s.moreRecentInFlight.timestamp.Sub(r.Timestamp),
					s.moreRecentInFlight.timestamp.Format(time.RFC3339Nano)))
		}
	}

	if r.Reference != "" {
		if _, ok := s.inFlightsByReference[r.Reference]; ok {
			return errorsutil.NewError(ErrConflictError, errors.New("reference already used, in flight occurring"))
		}
		_, err := s.store.ReadLogWithReference(ctx, r.Reference)
		if err == nil {
			// Log found
			return errorsutil.NewError(ErrConflictError, errors.New("reference already used, log found in storage"))
		}

		if !storage.IsNotFoundError(err) {
			return errors.Wrap(err, "failed to read log with reference")
		}
	}

	return nil
}

func (s *State) Reserve(ctx context.Context, r ReserveRequest) (*Reserve, *core.Time, error) {
	s.mu.Lock()
	defer s.mu.Unlock()

	if err := s.checkConstraints(ctx, r); err != nil {
		return nil, nil, err
	}

	ts := r.Timestamp
	if ts.IsZero() {
		ts = core.Now()
	}

	ret := &inFlight{
		reference: r.Reference,
		timestamp: ts,
	}
	s.inFlights[ret] = struct{}{}
	if r.Reference != "" {
		s.inFlightsByReference[r.Reference] = ret
	}

	// Link to previous in flight in the nominal case where transaction are properly handled in order
	if s.moreRecentInFlight != nil && !r.Timestamp.Before(s.moreRecentInFlight.timestamp) {
		ret.previous = s.moreRecentInFlight
		ret.previous.next = ret
	}
	if s.moreRecentInFlight == nil || !r.Timestamp.Before(s.moreRecentInFlight.timestamp) {
		s.moreRecentInFlight = ret
	}

	return &Reserve{
		inFlight: ret,
		state:    s,
	}, &ts, nil
}

func (s *State) GetMoreRecentTransactionDate() core.Time {
	return s.lastTransactionDate
}

func New(store Store, allowPastTimestamps bool, lastTransactionDate core.Time) *State {
	return &State{
		mu:                   sync.Mutex{},
		store:                store,
		moreRecentInFlight:   nil,
		inFlights:            map[*inFlight]struct{}{},
		inFlightsByReference: map[string]*inFlight{},
		lastTransactionDate:  lastTransactionDate,
		allowPastTimestamps:  allowPastTimestamps,
	}
}