# Spring Boot CRUD Application with Database

## Overview
This is a simple CRUD (Create, Read, Update, Delete) application built using Spring Boot. The application connects to a relational database (MySQL) to manage and persist data.

## Prerequisites

Before running the application, ensure the following are installed on your system:

- **Java Development Kit (JDK)**: Version 8 or later.
- **Maven**: For building the project.
- **MySQL**: For the database.
- **Postman** or similar tool (optional): To test the APIs.

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/your-repo/springboot-crud
cd springboot-crud
```

### 2. Configure the Database

Create a MySQL database named `studentdatabase` or any name of your choice. Update the `application.properties` file with your database credentials:

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/studentdatabase
spring.datasource.username=your_username
spring.datasource.password=your_password

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Build the Project

Run the following command to build the project:
```bash
mvn clean install
```

### 4. Run the Application

Start the application using:
```bash
mvn spring-boot:run
```
The application will start on `http://localhost:8080`.

## API Endpoints

### Base URL
```
http://localhost:8080
```

### 1. Create a New Student
**Endpoint:**
```
POST /students
```
**Request Body:**
```json
{
  "name": "John Doe",
  "age": 20,
  "email": "john.doe@example.com"
}
```
**Response:**
- **201 Created**: When a student is successfully created.

### 2. Get All Students
**Endpoint:**
```
GET /students
```
**Response:**
```json
[
  {
    "id": 1,
    "name": "John Doe",
    "age": 20,
    "email": "john.doe@example.com"
  }
]
```

### 3. Get a Student by ID
**Endpoint:**
```
GET /students/{id}
```
**Response:**
- **200 OK**: When the student is found.
- **404 Not Found**: When the student does not exist.

### 4. Update a Student
**Endpoint:**
```
PUT /students/{id}
```
**Request Body:**
```json
{
  "name": "Jane Doe",
  "age": 22,
  "email": "jane.doe@example.com"
}
```
**Response:**
- **200 OK**: When the student is successfully updated.
- **404 Not Found**: When the student does not exist.

### 5. Delete a Student
**Endpoint:**
```
DELETE /students/{id}
```
**Response:**
- **200 OK**: When the student is successfully deleted.
- **404 Not Found**: When the student does not exist.

## Project Structure
```
src/
├── main/
│   ├── java/
│   │   └── com.example.crud/
│   │       ├── controller/    # REST Controllers
│   │       ├── entity/        # JPA Entities
│   │       ├── repository/    # JPA Repositories
│   │       └── service/       # Service Layer
│   └── resources/
│       ├── application.properties # Configuration
│       └── static/            # Static Files (if any)
│       └── templates/         # Templates (if any)
└── test/
```

## Tools and Technologies
- **Spring Boot**: Backend framework.
- **MySQL**: Database.
- **Spring Data JPA**: ORM framework.
- **Maven**: Build tool.
- **Postman**: For API testing.

## Common Issues
1. **Database Connection Error**:
   - Ensure MySQL is running and credentials in `application.properties` are correct.

2. **Port Already in Use**:
   - Stop the application already running on port 8080 or change the port in `application.properties`:
     ```properties
     server.port=8081
     ```

3. **Dependency Issues**:
   - Run `mvn clean install` to resolve dependency problems.

