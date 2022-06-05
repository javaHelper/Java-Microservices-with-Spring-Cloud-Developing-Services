# Refreshing Configurations

CURL

```sh
curl --location --request GET 'http://localhost:8888/s1rates/default/main' \
--header 'Authorization: Basic cHJhdGVlazpwcmF0ZWVr' \
--header 'Cookie: JSESSIONID=478DA3869AC127A8DBC6A86B025D8BB4'
```

Response - 

```json
{
    "name": "s1rates",
    "profiles": [
        "default"
    ],
    "label": "main",
    "version": "f1b7f6ac9109f3a74212156bfa854f238be5540e",
    "state": null,
    "propertySources": [
        {
            "name": "https://github.com/rseroter/pluralsight-spring-cloudconfig-wa-tolls-2/station1/s1rates.properties",
            "source": {
                "rate": "2.91",
                "lanecount": "1"
            }
        },
        {
            "name": "https://github.com/rseroter/pluralsight-spring-cloudconfig-wa-tolls-2/application.properties",
            "source": {
                "rate": "1.55",
                "tollstart": "05:00",
                "tollstop": "22:00",
                "lanecount": "0",
                "connstring": "{cipher}5eeefc741591596005ddd38168830ea5001d082a470e1d1dbc2e9634c7f8453221230fc135819b077de8df37040facc9c9b294d5ffdb05c7170484159e69f9d1bdad70c7768635df1a1d8f67fa57ed1e"
            }
        }
    ]
}
```

GET -> `http://localhost:8080/actuator/refresh`

<img width="910" alt="Screenshot 2022-06-05 at 1 15 42 PM" src="https://user-images.githubusercontent.com/54174687/172040831-d3d7de57-a962-4df7-8bfd-febef7254bb2.png">


