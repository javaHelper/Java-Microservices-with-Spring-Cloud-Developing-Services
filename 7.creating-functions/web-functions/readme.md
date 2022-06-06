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

GET -> `http://localhost:8080/getTollStations`

```json
[
    {
        "stationId": "100A",
        "mileMaker": 112.5,
        "stallCount": 2
    },
    {
        "stationId": "111C",
        "mileMaker": 124.0,
        "stallCount": 4
    },
    {
        "stationId": "112C",
        "mileMaker": 126.0,
        "stallCount": 2
    }
]
```

POST -> 

```sh
curl --location --request POST 'http://localhost:8080/getStation' \
--header 'Content-Type: text/plain' \
--header 'Cookie: JSESSIONID=478DA3869AC127A8DBC6A86B025D8BB4' \
--data-raw '100A'
```

Response:
```json
{
    "stationId": "100A",
    "mileMaker": 112.5,
    "stallCount": 2
}
```



POST -> 

```sh
curl --location --request POST 'http://localhost:8080/processListOfTollRecordsReactive' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=478DA3869AC127A8DBC6A86B025D8BB4' \
--data-raw '[
    {
        "stationId": "151A",
        "licensePlate": "MH 27 AR 1111",
        "timestamp": "2022-05-05T08:00:00"
    },
    {
        "stationId": "152A",
        "licensePlate": "MH 31 MH 1111",
        "timestamp": "2022-05-05T08:00:00"
    }
]'
```

POST -> 

```sh
curl --location --request POST 'http://localhost:8080/processTollRecordReactive' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=478DA3869AC127A8DBC6A86B025D8BB4' \
--data-raw '{
    "stationId": "150A",
    "licensePlate": "MH 27 AR 1111",
    "timestamp": "2022-05-05T08:00:00"
}'
```


