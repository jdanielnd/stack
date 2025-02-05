package nats

import (
	"github.com/formancehq/operator/apis/stack/v1beta3"
	"github.com/nats-io/nats.go"
	"github.com/pkg/errors"
)

func NewClient(natsConfig *v1beta3.NatsConfig, clientId string) (*nats.Conn, error) {
	options := []nats.Option{
		nats.Name(clientId),
	}

	conn, err := nats.Connect(natsConfig.URL, options...)
	if err != nil {
		return nil, errors.Wrap(err, "cannot connect to nats-core")
	}

	return conn, nil
}
