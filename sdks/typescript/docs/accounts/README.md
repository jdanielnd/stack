# accounts

### Available Operations

* [addMetadataToAccount](#addmetadatatoaccount) - Add metadata to an account
* [countAccounts](#countaccounts) - Count the accounts from a ledger
* [getAccount](#getaccount) - Get account by its address
* [listAccounts](#listaccounts) - List accounts from a ledger

## addMetadataToAccount

Add metadata to an account

### Example Usage

```typescript
import { SDK } from "@formance/formance-sdk";
import { AddMetadataToAccountResponse } from "@formance/formance-sdk/dist/sdk/models/operations";
import { ErrorsEnum } from "@formance/formance-sdk/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    authorization: "Bearer YOUR_ACCESS_TOKEN_HERE",
  },
});

sdk.accounts.addMetadataToAccount({
  idempotencyKey: "corrupti",
  requestBody: {
    "distinctio": "quibusdam",
    "unde": "nulla",
    "corrupti": "illum",
  },
  address: "users:001",
  async: true,
  dryRun: true,
  ledger: "ledger001",
}).then((res: AddMetadataToAccountResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## countAccounts

Count the accounts from a ledger

### Example Usage

```typescript
import { SDK } from "@formance/formance-sdk";
import { CountAccountsResponse } from "@formance/formance-sdk/dist/sdk/models/operations";
import { ErrorsEnum } from "@formance/formance-sdk/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    authorization: "Bearer YOUR_ACCESS_TOKEN_HERE",
  },
});

sdk.accounts.countAccounts({
  address: "users:.+",
  ledger: "ledger001",
  metadata: {
    "error": "deserunt",
    "suscipit": "iure",
  },
}).then((res: CountAccountsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## getAccount

Get account by its address

### Example Usage

```typescript
import { SDK } from "@formance/formance-sdk";
import { GetAccountResponse } from "@formance/formance-sdk/dist/sdk/models/operations";
import { ErrorsEnum } from "@formance/formance-sdk/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    authorization: "Bearer YOUR_ACCESS_TOKEN_HERE",
  },
});

sdk.accounts.getAccount({
  address: "users:001",
  ledger: "ledger001",
}).then((res: GetAccountResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## listAccounts

List accounts from a ledger, sorted by address in descending order.

### Example Usage

```typescript
import { SDK } from "@formance/formance-sdk";
import { ListAccountsBalanceOperator, ListAccountsResponse } from "@formance/formance-sdk/dist/sdk/models/operations";
import { ErrorsEnum } from "@formance/formance-sdk/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    authorization: "Bearer YOUR_ACCESS_TOKEN_HERE",
  },
});

sdk.accounts.listAccounts({
  address: "users:.+",
  balance: 2400,
  balanceOperator: ListAccountsBalanceOperator.Gte,
  cursor: "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==",
  ledger: "ledger001",
  metadata: {
    "debitis": "ipsa",
    "delectus": "tempora",
  },
  pageSize: 383441,
}).then((res: ListAccountsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```