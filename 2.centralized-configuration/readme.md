# Creating config-server for Local files

GET -> `http://localhost:8888/app1/default`

```json
{
    "name": "app1",
    "profiles": [
        "default"
    ],
    "label": null,
    "version": null,
    "state": null,
    "propertySources": [
        {
            "name": "classpath:/config/app1.properties",
            "source": {
                "greeting": "hello"
            }
        }
    ]
}
```

GET -> `http://localhost:8888/app2/default`

```json
{
    "name": "app2",
    "profiles": [
        "default"
    ],
    "label": null,
    "version": null,
    "state": null,
    "propertySources": [
        {
            "name": "classpath:/config/app2.properties",
            "source": {
                "greeting": "Namaskar"
            }
        }
    ]
}
```

GET -> `http://localhost:8888/app3/default`

```json
{
    "name": "app3",
    "profiles": [
        "default"
    ],
    "label": null,
    "version": null,
    "state": null,
    "propertySources": [
        {
            "name": "classpath:/config/app3.properties",
            "source": {
                "greeting": "hola"
            }
        }
    ]
}
```
