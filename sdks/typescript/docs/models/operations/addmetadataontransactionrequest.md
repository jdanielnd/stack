# AddMetadataOnTransactionRequest


## Fields

| Field                                                                                                              | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        | Example                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `idempotencyKey`                                                                                                   | *string*                                                                                                           | :heavy_minus_sign:                                                                                                 | Use an idempotency key                                                                                             |                                                                                                                    |
| `requestBody`                                                                                                      | Record<string, *string*>                                                                                           | :heavy_minus_sign:                                                                                                 | metadata                                                                                                           |                                                                                                                    |
| `async`                                                                                                            | *boolean*                                                                                                          | :heavy_minus_sign:                                                                                                 | Set async mode.                                                                                                    | true                                                                                                               |
| `dryRun`                                                                                                           | *boolean*                                                                                                          | :heavy_minus_sign:                                                                                                 | Set the dryRun mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker. | true                                                                                                               |
| `ledger`                                                                                                           | *string*                                                                                                           | :heavy_check_mark:                                                                                                 | Name of the ledger.                                                                                                | ledger001                                                                                                          |
| `txid`                                                                                                             | *number*                                                                                                           | :heavy_check_mark:                                                                                                 | Transaction ID.                                                                                                    | 1234                                                                                                               |