# API REST - Gestión de Tópicos y Respuestas

Una API REST construida con Spring Boot para gestionar tópicos, respuestas y autenticación segura.

## Descripción

Foro-Hub es una API RESTful que permite crear y administrar tópicos y respuestas en un foro. Incluye autenticación con JWT, validaciones, persistencia en MySQL y migraciones con Flyway.

---

## Funcionalidades

- Gestión de tópicos: crear, listar, ver, actualizar y eliminar.
- Gestión de respuestas: crear, listar y eliminar.
- Autenticación y autorización con JWT.
- Persistencia en MySQL con migraciones automáticas.
- Validaciones de datos y separación por capas.

---

## Tecnologías

- Java 17+
- Spring Boot
- Spring Security
- Flyway
- MySQL
- JPA / Hibernate

---

## Endpoints principales

### Tópicos (`/topicos`)

- `POST /topicos` → Crear nuevo tópico  
- `GET /topicos` → Listar todos los tópicos  
- `GET /topicos/{id}` → Obtener un tópico por ID  
- `PUT /topicos/{id}` → Actualizar un tópico  
- `DELETE /topicos/{id}` → Eliminar un tópico  

### Respuestas (`/respuestas`)

- `POST /respuestas` → Crear nueva respuesta  
- `GET /respuestas` → Listar respuestas  
- `DELETE /respuestas/{id}` → Eliminar respuesta  

---

