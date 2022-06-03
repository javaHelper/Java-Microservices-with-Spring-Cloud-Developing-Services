# Centralized Configuration using github

GET -> `http://localhost:8888/s1rates/default/main`

```json
{
    "name": "s1rates",
    "profiles": [
        "default"
    ],
    "label": "main",
    "version": "29ab92d02e1e4aed70efe8eaee73472747797235",
    "state": null,
    "propertySources": [
        {
            "name": "https://github.com/javaHelper/pluralsight-spring-cloudconfig-wa-tolls/station1/s1rates.properties",
            "source": {
                "rate": "1.91",
                "lanecount": "1"
            }
        },
        {
            "name": "https://github.com/javaHelper/pluralsight-spring-cloudconfig-wa-tolls/s1rates.properties",
            "source": {
                "rate": "1.91",
                "lanecount": "1"
            }
        },
        {
            "name": "https://github.com/javaHelper/pluralsight-spring-cloudconfig-wa-tolls/application.properties",
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

GET -> `http://localhost:8888/s2rates/default/main`

```json
{
    "name": "s2rates",
    "profiles": [
        "default"
    ],
    "label": "main",
    "version": "0b09e2f2ca026806afd9ab1c86114ad032fa0d79",
    "state": null,
    "propertySources": [
        {
            "name": "https://github.com/javaHelper/pluralsight-spring-cloudconfig-wa-tolls/station2/s2rates.properties",
            "source": {
                "rate": "1.65",
                "lanecount": "3"
            }
        },
        {
            "name": "https://github.com/javaHelper/pluralsight-spring-cloudconfig-wa-tolls/application.properties",
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
