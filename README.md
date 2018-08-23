# Learning-api-tests-automation
Projeto exemplo de automação de testes de API para o treinamento de automação

## Exercicios
realizar os exercicios utilizando as Apis do site
https://jsonplaceholder.typicode.com/

* utilizando o endpoint /users, realizar um GET em um usuario não existente, response deverá retornar 404
* utilizando o endpoint /users, realizar um GET em um usuario valido, response deverá retornar 200
* utilizando o endpoint /users, realizar um POST de um novo usuário, response deverá retornar 201
* utilizando o endpoint /users, realizar um DELETE de um usuário, response deverá retornar 200
* utilizando o endpoint /users, realizar um DELETE de um usuário no existente, response deverá retornar 404
```
{
    "id": 11,
    "ana": "Macau",
    "username": "Macau",
    "email": "Macau@kory.org",
    "address": {
        "street": "Hoeger Mall",
        "suite": "Apt. 692",
        "city": "South Elvis",
        "zipcode": "53919-4257",
        "geo": {
            "lat": "29.4572",
            "lng": "-164.2990"
        }
    },
    "phone": "493-170-9623 x156",
    "website": "kale.biz",
    "company": {
        "name": "Robel-Corkery",
        "catchPhrase": "Multi-tiered zero tolerance productivity",
        "bs": "transition cutting-edge web services"
    }
}
```
* utilizando o endpoint /users, realizar um PUT de um novo usuário, response deverá retornar 404
```
{
    "id": 11,
    "ana": "Macau",
    "username": "Macau",
    "email": "Macau@kory.org",
    "address": {
        "street": "Hoeger Mall",
        "suite": "Apt. 692",
        "city": "South Elvis",
        "zipcode": "53919-4257",
        "geo": {
            "lat": "29.4572",
            "lng": "-164.2990"
        }
    },
    "phone": "493-170-9623 x156",
    "website": "kale.biz",
    "company": {
        "name": "Robel-Corkery",
        "catchPhrase": "Multi-tiered zero tolerance productivity",
        "bs": "transition cutting-edge web services"
    }
}
```
* utilizando o endpoint /users, realizar um PUT de um novo usuário, response deverá retornar 200
```
{
    "id": 11,
    "ana": "Macau",
    "username": "Macau",
    "email": "Macau@kory.org",
    "address": {
        "street": "Hoeger Mall",
        "suite": "Apt. 692",
        "city": "South Elvis",
        "zipcode": "53919-4257",
        "geo": {
            "lat": "29.4572",
            "lng": "-164.2990"
        }
    },
    "phone": "493-170-9623 x156",
    "website": "kale.biz",
    "company": {
        "name": "Robel-Corkery",
        "catchPhrase": "Multi-tiered zero tolerance productivity",
        "bs": "transition cutting-edge web services"
    }
}
```
