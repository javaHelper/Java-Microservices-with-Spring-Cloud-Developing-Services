# Distributed Tracing 

GET -> `http://localhost:8091/customer/500/contactdetails`

Response

```json
{
    "contactId": "500",
    "contactName": "Alexis Rose",
    "postalCode": "30010"
}
```

GET -> `http://localhost:8092/customer/500/vehicledetails`

Response

```json
{
    "customerId": "500",
    "carType": "Lincoln Contential",
    "licensePlate": "SNUG30"
}
```

GET -> `http://localhost:9090/customer/500`

Response

```json
{
    "contactId": "500",
    "contactName": "Alexis Rose",
    "postalCode": "30010",
    "carType": "Lincoln Contential",
    "licensePlate": "SNUG30"
}
```
