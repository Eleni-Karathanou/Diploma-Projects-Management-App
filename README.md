# Diploma Thesis Management System

## About The Project
A backend web application built with Java and Spring Boot designed to manage the workflow of university diploma projects. The system acts as a bridge between professors offering thesis subjects and students applying for them, automating the application, evaluation and assignment processes.

## Built With
* **Backend Framework:** Java, Spring Boot
* **Architecture:** MVC (Model-View-Controller)
* **Security:** Spring Security (BCrypt password encoding)
* **Data Access:** Spring Data JPA / Hibernate
* **Database:** MySQL

## Key Features & Architecture
* **Role-Based Access Control (RBAC):** Distinct dashboards and permissions for Users (Students), Professors and Admins. Secure login and registration.
* **N-Tier Architecture:** Clean separation of concerns using Controllers (routing), Services (business logic) and DAOs (data access).
* **Smart Applicant Selection:** Implemented GoF Design Patterns (**Strategy Pattern** & **Factory Pattern**) to dynamically select the best student for a thesis based on different criteria (`BestAvgGradeStrategy`, `FewestCoursesStrategy`, `ThresholdApplicant`).
* **Entity Management:** Full CRUD operations architecture for Users, Applications, Subjects and Theses.

## Status
Developed as an academic project. Core architectural layers and database schemas are established demonstrating proficient understanding of modern Java backend development.
