# Applying Security to Configurations


<img width="852" alt="Screenshot 2022-06-05 at 11 10 23 AM" src="https://user-images.githubusercontent.com/54174687/172036983-63c7f673-8805-4a53-9223-7895f97e9f7c.png">

- CURL

```sh
curl --location --request GET 'http://localhost:8888/s1rates/default/main' \
--header 'Authorization: Basic cHJhdGVlazpwcmF0ZWVr' \
--header 'Cookie: JSESSIONID=478DA3869AC127A8DBC6A86B025D8BB4'
```

Response:
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
                "invalid.connstring": "<n/a>"
            }
        }
    ]
}
```
