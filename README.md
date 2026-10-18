# SB-Rest-CRUD

A Spring Boot REST API for product CRUD operations with MySQL and global exception handling.

## Tech Stack
- Java, Spring Boot
- Spring Data JPA, MySQL
- Lombok, Maven

## Features
- Create, read, update, and delete products
- Custom ResourceNotFoundException
- Centralized error handling with @RestControllerAdvice

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | /welcome | Welcome message |
| POST | /save | Create product |
| GET | /product/{id} | Get product by ID |
| GET | /products | Get all products |
| PUT | /update | Update product |
| DELETE | /delete/{id} | Delete product |

## Run Locally
1. Create MySQL database: sbms
2. Configure database credentials in src/main/resources/application.yml
3. Run: mvnw.cmd spring-boot:run (Windows) or ./mvnw spring-boot:run (macOS/Linux)
4. Test endpoints using Postman.

Do not commit database passwords or secrets to GitHub.

## Author
Shayan Arshi
