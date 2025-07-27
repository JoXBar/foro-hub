<h1 align="center">💬 API REST - Gestión de Tópicos y Respuestas</h1>

<p align="center">
  Una poderosa API REST construida con Spring Boot para gestionar tópicos, respuestas, y autenticación segura.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Spring_Boot-3.x-success" />
  <img src="https://img.shields.io/badge/MySQL-Relational_DB-blue" />
  <img src="https://img.shields.io/badge/Security-Autenticaci%C3%B3n-green" />
  <img src="https://img.shields.io/badge/Migraciones-Flyway-red" />
</p>

## 📌 Descripción

**Foro-Hub** es una API RESTful construida con **Spring Boot** que permite gestionar tópicos y respuestas dentro de un foro. Incorpora autenticación segura mediante **JWT**, validaciones de negocio, persistencia en **MySQL** y migraciones automáticas con **Flyway**.

---

## 📌 Funcionalidades principales

✅ **Gestión de Tópicos**
- Crear un nuevo tópico
- Listar todos los tópicos
- Ver un tópico específico
- Actualizar un tópico
- Eliminar un tópico

✅ **Gestión de Respuestas**
- Crear una respuesta: `@PostMapping /respuestas`
- Listar respuestas: `@GetMapping /respuestas`
- Eliminar respuesta: `@DeleteMapping /respuestas/{id}`

✅ **Otras características destacadas**
- API RESTful con rutas limpias y semánticas
- Validaciones de datos según reglas de negocio
- Persistencia con **MySQL** y migraciones gestionadas por **Flyway**
- Seguridad y control de acceso con **Spring Boot Security**

✅ **Seguridad con JWT**
- Registro y autenticación de usuarios
- Acceso restringido a rutas privadas

✅ **Persistencia**
- Base de datos relacional (MySQL)
- Migraciones automáticas con Flyway

✅ **Buenas prácticas**
- Rutas RESTful limpias
- Validaciones de entrada
- Separación de capas: Controller, Service, Repository
---

## 🛠️ Tecnologías utilizadas

| Tecnología       | Descripción                         |
|------------------|-------------------------------------|
| Java 17+         | Lenguaje base                       |
| Spring Boot      | Framework principal                 |
| Spring Security  | Autenticación y autorización        |
| Flyway           | Migraciones automáticas de DB       |
| MySQL            | Base de datos relacional            |
| JPA / Hibernate  | ORM para persistencia de datos      |
| HATEOAS (opcional)| Navegación entre recursos (HAL)    |

---

## 🔐 Seguridad

- Autenticación y autorización implementadas con **Spring Security**
- Protección de endpoints sensibles
- Rutas públicas y privadas bien definidas
  
---

## 📦 Endpoints REST

### 🧵 Tópicos (`/topicos`)

| Método | Ruta                  | Descripción               |
|--------|------------------------|---------------------------|
| POST   | `/topicos`             | Crear nuevo tópico        |
| GET    | `/topicos`             | Listar todos los tópicos  |
| GET    | `/topicos/{id}`        | Obtener un tópico por ID  |
| PUT    | `/topicos/{id}`        | Actualizar un tópico      |
| DELETE | `/topicos/{id}`        | Eliminar un tópico        |

### 💬 Respuestas (`/respuestas`)

| Método | Ruta                  | Descripción                  |
|--------|------------------------|------------------------------|
| POST   | `/respuestas`          | Crear una nueva respuesta    |
| GET    | `/respuestas`          | Listar respuestas paginadas |
| DELETE | `/respuestas/{id}`     | Eliminar una respuesta       |

---
## 🧠 Estructura del Proyecto
<pre lang="markdown"><code> ``` src/ ├── controller/ → Controladores REST ├── dto/ → Clases de transferencia de datos ├── model/ → Entidades de base de datos ├── repository/ → Interfaces JPA ├── service/ → Lógica de negocio ├── config/ → Configuración de seguridad JWT ├── security/ → Filtros, utils y autenticación └── db/migration/ → Scripts de Flyway (ej: V1__init.sql) ``` </code></pre>

---

👨‍💻 Autor: 
Brian Exequiel Maciel


---

📄 Licencia
Este proyecto está licenciado bajo la licencia MIT.
Consulta el archivo LICENSE para más detalles.

