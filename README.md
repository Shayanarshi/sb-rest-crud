# SB-Rest-CRUD

A Spring Boot REST API for managing products with CRUD operations using Spring Data JPA and MySQL.

## Technologies Used
- Java
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- MySQL
- Lombok
- Maven
- Postman

## Features
- Create a product
- Retrieve a product by ID
- Retrieve all products
- Update a product
- Delete a product
- Store product data in MySQL

## Product Model
- id — Generated UUID
- name — Product name
- price — Product price

## REST API Endpoints

Base URL: http://localhost:8080

| Method | Endpoint | Description |
|---|---|---|
| POST | /save | Create a product |
| GET | /product/{id} | Get a product by ID |
| GET | /products | Get all products |
| PUT | /update | Update a product |
| DELETE | /delete/{id} | Delete a product |

## Example Request

POST /save

```json
{
  "name": "Keyboard",
  "price": 799.0
}
```

## Setup and Run

1. Clone the repository.
2. Create the MySQL database:

```sql
CREATE DATABASE sbms;
```

3. Configure database credentials in src/main/resources/application.properties.
4. Run the application:

Windows:
```bash
mvnw.cmd spring-boot:run
```

macOS/Linux:
```bash
./mvnw spring-boot:run
```

5. Test the API using Postman.

## Author
Shayan Arshi
