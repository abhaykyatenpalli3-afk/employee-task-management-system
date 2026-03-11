# Employee Task Management System

A RESTful backend application developed using Spring Boot to manage departments, employees, and task assignments in an organization.

## 🚀 Features

- Department creation and retrieval
- Employee management with department mapping
- Task assignment to employees
- Pending task filtering using Java Stream API
- Global exception handling
- Swagger API documentation
- Layered architecture (Controller → Service → Repository → Entity)

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Swagger OpenAPI
- Git & GitHub

## 🧩 System Design

- One Department → Many Employees
- One Employee → Many Tasks

## ▶ Run Project

```bash
mvn spring-boot:run