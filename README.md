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

The project is successfully deployed on AWS EC2 using Ubuntu Server, Docker, PostgreSQL and Spring Boot.

Features demonstrated in this project:

- REST API development with Spring Boot
- PostgreSQL database integration
- Docker container usage
- AWS EC2 cloud deployment
- API testing with Postman
- External access via public IP

- Library Management API

Bu proje, Spring Boot ile geliştirilmiş bir backend uygulamasıdır. Kitap ekleme, listeleme, ödünç verme, geri getirme ve silme gibi temel kitap yönetim işlemlerini sağlar.

Uygulama veritabanı olarak PostgreSQL kullanır ve Docker ile container yapısına alınmıştır. Yerel geliştirme ortamında Kind kullanılarak Kubernetes cluster üzerinde deploy edilmiştir.

Kullanılan Teknolojiler
Java 17
Spring Boot
Spring Data JPA
PostgreSQL
Docker
Kubernetes (Kind)
API Endpointleri
GET /books → tüm kitapları listeler
POST /books → yeni kitap ekler
PUT /books/{id}/borrow → kitabı ödünç verilmiş olarak işaretler
PUT /books/{id}/return → kitabı geri getirildi olarak işaretler
DELETE /books/{id} → kitabı siler

Proje, Ubuntu Server, Docker, PostgreSQL ve Spring Boot kullanılarak AWS EC2 üzerinde başarıyla deploy edilmiştir.

Bu Projede Gösterilen Özellikler
Spring Boot ile REST API geliştirme
PostgreSQL veritabanı entegrasyonu
Docker container kullanımı
AWS EC2 cloud deployment
Postman ile API testi
Public IP üzerinden dış erişim
