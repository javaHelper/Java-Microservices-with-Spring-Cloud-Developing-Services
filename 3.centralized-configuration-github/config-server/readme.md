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
----------------
- After adding more granular paths for perf

application.yml

```yml
server:
  port: 8888

#spring:
#  cloud:
#    config:
#      server:
#        git:
#          uri: https://github.com/javaHelper/pluralsight-spring-cloudconfig-wa-tolls
#          default-label: main
#          search-paths:
#            - station*

spring:
  cloud:
    config:
      server:
        git:
          uri: https://github.com/rseroter/pluralsight-spring-cloudconfig-wa-tolls-2
          search-paths:
            - station*
          repos:
            perf:
              pattern: '*/perf'
              uri: https://github.com/rseroter/pluralsight-spring-cloudconfig-wa-tolls-perf-2
              search-paths:
                - 'station*'
```

GET -> `http://localhost:8888/s1rates/perf/main`

```json
{
    "name": "s1rates",
    "profiles": [
        "perf"
    ],
    "label": "main",
    "version": "e9ede2065766443f11b7331d5e6a482b04f38746",
    "state": null,
    "propertySources": [
        {
            "name": "https://github.com/rseroter/pluralsight-spring-cloudconfig-wa-tolls-perf-2/station1/s1rates.properties",
            "source": {
                "rate": "5",
                "lanecount": "5"
            }
        },
        {
            "name": "https://github.com/rseroter/pluralsight-spring-cloudconfig-wa-tolls-perf-2/application.properties",
            "source": {
                "rate": "1.55",
                "tollstart": "05:00",
                "tollstop": "22:00",
                "lanecount": "0"
            }
        }
    ]
}
```

GET -> http://localhost:8888/s3rates/perf/main

```json
{
    "name": "s3rates",
    "profiles": [
        "perf"
    ],
    "label": "main",
    "version": "e9ede2065766443f11b7331d5e6a482b04f38746",
    "state": null,
    "propertySources": [
        {
            "name": "https://github.com/rseroter/pluralsight-spring-cloudconfig-wa-tolls-perf-2/station3/s3rates.properties",
            "source": {
                "rate": "9.10",
                "lanecount": "8"
            }
        },
        {
            "name": "https://github.com/rseroter/pluralsight-spring-cloudconfig-wa-tolls-perf-2/application.properties",
            "source": {
                "rate": "1.55",
                "tollstart": "05:00",
                "tollstop": "22:00",
                "lanecount": "0"
            }
        }
    ]
}
```
