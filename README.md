# Employee Management System

A RESTful Employee Management API built using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL.

This project is an upgraded version of my earlier JDBC-based Employee Management System. It demonstrates how Spring Data JPA and Hibernate simplify database operations while building a structured REST API using Spring Boot.

## 🚀 Features

- Create a new employee
- Retrieve all employees
- Retrieve an employee by ID
- Update employee details
- Delete an employee
- MySQL database integration
- RESTful API architecture
- CRUD operations using Spring Data JPA
- API testing using Postman

## 🛠️ Technologies Used

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Maven**
- **Postman**
- **Git & GitHub**
- **Eclipse IDE**

## 🏗️ Project Architecture

The application follows a layered architecture:

text
Client / Postman
       ↓
EmployeeController
       ↓
EmployeeService
       ↓
EmployeeRepository
       ↓
Spring Data JPA
       ↓
Hibernate
       ↓
MySQL Database

Layers
Controller
Handles HTTP requests and exposes REST API endpoints.

Service
Contains the business logic of the application.

Repository
Uses Spring Data JPA to perform database operations.

Entity
Represents the Employee table in the MySQL database.


Sample Employee JSON
Create Employee

POST
/employees

Request body:
{
    "name": "Sreerag",
    "department": "IT",
    "salary": 50000
}
Update Employee

PUT
/employees/1

Request body:
{
    "name": "Sreerag N",
    "department": "Software",
    "salary": 60000
}


Database Configuration
This project uses MySQL as the database.

Create a database:
CREATE DATABASE employee_db;

Configure the database connection in application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

How to Run the Project
1. Clone the repository
git clone https://github.com/Sreerag080/EmployeeManagementSystem-using-Spring-Data-Jpa.git
2. Open the project
Open the project using Eclipse or another Java IDE.

3. Configure MySQL
Create the employee_db database and update the database credentials in application.properties.

4. Run the application
Run the Spring Boot application.
The application will start on:
http://localhost:8080

5. Test the APIs
Use Postman to test the REST API endpoints.

🧪 API Testing
The REST APIs were tested using Postman for:

Creating employees
Retrieving employees
Updating employees
Deleting employees
