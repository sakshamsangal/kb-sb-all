# info


## add user
```
curl  -X POST \
'http://localhost:8080/products/new' \
--header 'Accept: */*' \
--header 'User-Agent: Thunder Client (https://www.thunderclient.com)' \
--header 'Content-Type: application/json' \
--data-raw '{

"name":"lavi",
"email":"saksham@test.com",
"password":"saksham",
"roles":"ROLE_USER"
}'

```