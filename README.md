# User Management API

API to manage users.

## Run the Application

```
cd path/to/java-springboot

./mvnw spring-boot:run
```

## API Documentation

### Get all Users

`GET /users`

Request Body: None

### Get User by ID

`GET /users/{id}`

Request Body: None

### Create User

`POST /users`

Request Body:
```
{
    "username": "username",
    "firstName": "First",
    "lastName": "Last",
    "email": "example@email.com",
    "phoneNumber": 1234567890
}
```

### Edit User

`PUT /users/{id}`

Request Body:
```
{
    "username": "username",
    "firstName": "First",
    "lastName": "Last",
    "email": "example@email.com",
    "phoneNumber": 1234567890
}
```

### Delete User

`DELETE /users/{id}`

Request Body: None
