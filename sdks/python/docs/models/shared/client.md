# Client


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `description`                                             | *Optional[str]*                                           | :heavy_minus_sign:                                        | N/A                                                       |
| `id`                                                      | *str*                                                     | :heavy_check_mark:                                        | N/A                                                       |
| `metadata`                                                | dict[str, *Any*]                                          | :heavy_minus_sign:                                        | N/A                                                       |
| `name`                                                    | *str*                                                     | :heavy_check_mark:                                        | N/A                                                       |
| `post_logout_redirect_uris`                               | list[*str*]                                               | :heavy_minus_sign:                                        | N/A                                                       |
| `public`                                                  | *Optional[bool]*                                          | :heavy_minus_sign:                                        | N/A                                                       |
| `redirect_uris`                                           | list[*str*]                                               | :heavy_minus_sign:                                        | N/A                                                       |
| `scopes`                                                  | list[*str*]                                               | :heavy_minus_sign:                                        | N/A                                                       |
| `secrets`                                                 | list[[ClientSecret](../../models/shared/clientsecret.md)] | :heavy_minus_sign:                                        | N/A                                                       |
| `trusted`                                                 | *Optional[bool]*                                          | :heavy_minus_sign:                                        | N/A                                                       |