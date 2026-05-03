Library Management API

This project is a backend application built with Spring Boot. It provides basic book management operations such as adding, listing, borrowing, returning, and deleting books.

The application uses PostgreSQL as the database and is containerized with Docker. It is deployed on a Kubernetes cluster using Kind for local development.

Technologies used:
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker
- Kubernetes (Kind)

API Endpoints:
GET /books -> list all books  
POST /books -> add new book  
PUT /books/{id}/borrow -> mark as borrowed  
PUT /books/{id}/return -> mark as returned  
DELETE /books/{id} -> delete book  

The project includes Docker and Kubernetes configurations for deployment and can be extended to cloud environments like Google Cloud.
