SB-Rest-CRUD
A RESTful API built with Spring Boot to perform CRUD operations with MySQL integration and centralized exception handling.
Java
Spring Boot
MySQL
Maven

✨ Features
- Create, retrieve, update, and delete products
- Database integration using Spring Data JPA
- Custom ResourceNotFoundException
- Global exception handling
- Structured error responses
🛠️ Tech Stack
Technology	Purpose
Java	Programming language
Spring Boot	Application framework
Spring Web	REST APIs
Spring Data JPA	Database operations
Hibernate	ORM
MySQL	Database
Lombok	Reduce boilerplate
Maven	Build management
Postman	API testing
Git & GitHub	Version control
🔗 API Endpoints
<text color="secondary" size="sm">Base URL: http://localhost:8080</text>
Method	Endpoint
GET	/welcome
POST	/save
GET	/product/DIL4
GET	/products
PUT	/update
DELETE	/delete/DIL5
🚀 Getting Started
1. Clone the repository.
2. Create the MySQL database sbms.
3. Configure application.yml.
4. Run with mvnw.cmd spring-boot:run on Windows.
5. Test using Postman.
👨‍💻 Author
Shayan Arshi
GitHub · LinkedIn
<divider color="subtle"/>
<button block onClick={() => GenUI.copy(readme)}><icon name="copy" size="sm" inline/> Copy Complete README</button>
</box>
