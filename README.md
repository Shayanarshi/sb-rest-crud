# SB-Rest-CRUD

A Spring Boot REST API for product CRUD operations with MySQL and global exception handling.

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok
- Maven

## Features
- Create, read, update, and delete products
- Custom ResourceNotFoundException
- Centralized exception handling using @RestControllerAdvice
- Standardized error responses

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | /welcome | Welcome message |
| POST | /save | Create a product |
| GET | /product/{id} | Get product by ID |
| GET | /products | Get all products |
| PUT | /update | Update a product |
| DELETE | /delete/{id} | Delete a product |

## Setup and Run
1. Create a MySQL database named sbms.
2. Configure database credentials in src/main/resources/application.yml.
3. Run the application:

Windows:
mvnw.cmd spring-boot:run

macOS/Linux:
./mvnw spring-boot:run

4. Test the API using Postman.

**Security:** Do not commit real database passwords or secrets to GitHub.

## Author
Shayan Arshi
