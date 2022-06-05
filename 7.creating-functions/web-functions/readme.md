# Creating Functions

GET -> `http://localhost:8080/getStation/100A`

```json
{
    "stationId": "100A",
    "mileMaker": 112.5,
    "stallCount": 2
}
```

POST -> 

```sh
curl --location --request POST 'http://localhost:8080/getStation' \
--header 'Content-Type: text/plain' \
--header 'Cookie: JSESSIONID=478DA3869AC127A8DBC6A86B025D8BB4' \
--data-raw '100A'
```

Response:
```
{
    "stationId": "100A",
    "mileMaker": 112.5,
    "stallCount": 2
}
```

