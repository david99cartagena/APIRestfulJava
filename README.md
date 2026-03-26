# 🚀 ApiRestfulJava - Spring Boot REST API

Este es un proyecto de ejemplo que implementa una API RESTful básica utilizando **Java** con el framework **Spring Boot**. El objetivo es proporcionar un sistema CRUD (Crear, Leer, Actualizar, Borrar) para la gestión de **Personas**.

## 🛠️ Tecnologías y Requerimientos

- **Lenguaje**: Java 11 (AdoptOpenJDK recomendado)
- **Framework**: Spring Boot 2.6.6
- **Base de Datos**: MySQL (PostgreSQL soportado vía Docker Compose)
- **Persistencia**: Spring Data JPA / Hibernate
- **Herramientas**:
  - Apache Maven (vía `mvnw`)
  - Docker & Docker Compose
  - Postman / Insomnia (para pruebas de API)

## 🏗️ Estructura del Proyecto

```text
ApiRestfulJava/
├── src/main/java/com/example/ApiRestfulJava/     # Código fuente
│   ├── controlers/                               # Endpoints de la API
│   ├── models/                                   # Entidades de datos
│   ├── repositories/                             # Interfaces de JPA
│   └── services/                                 # Lógica de negocio
├── src/main/resources/                           # Configuración y recursos
├── Dockerfile                                    # Configuración de imagen Docker
├── docker-compose.yml                            # Orquestación de contenedores
└── pom.xml                                       # Dependencias del proyecto (Maven)
```

## 🚦 Primeros Pasos

### Ejecución Local con Maven
Si tienes Java 11 y Maven instalados, puedes ejecutar el proyecto directamente:

1. **Configurar la base de datos**:
   Asegúrate de que tienes un servidor MySQL corriendo y actualiza `src/main/resources/application.properties` con tus credenciales.

2. **Ejecutar la aplicación**:
   ```bash
   # En Windows
   mvnw.cmd spring-boot:run

   # En Unix/macOS
   ./mvnw spring-boot:run
   ```

### Ejecución con Docker (Recomendado)
El proyecto incluye configuración para levantar la aplicación y una base de datos PostgreSQL automáticamente:

```bash
docker-compose up --build
```
> [!NOTE]
> Por defecto, la aplicación estará disponible en `http://localhost:8080`.

## 📡 Endpoints de la API - `/persona`

| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| **GET** | `/persona` | Obtiene la lista de todas las personas. |
| **POST** | `/persona` | Crea o guarda una nueva persona. |
| **GET** | `/persona/{id}` | Busca una persona específica por su ID. |
| **DELETE** | `/persona/{id}` | Elimina una persona por su ID. |

## 📋 Ejemplos de Petición (JSON)

Para guardar una persona (**POST** `/persona`):
```json
{
  "nombre": "David",
  "email": "david@example.com",
  "prioridad": 1
}
```

## 🎬 Referencias y Tutoriales

Si deseas profundizar en la implementación de este tipo de APIs, puedes consultar estos recursos:
- [Tutorial de Spring Boot & MySQL](https://www.youtube.com/watch?v=vTu2HQrXtyw)
- [Gestión de APIs REST con Spring](https://www.youtube.com/watch?v=VTfFpgaSIDw)

## 🔧 Solución de Problemas

- **Fallo al ejecutar `mvnw`**: Asegúrate de que tu variable de entorno `JAVA_HOME` apunte a una versión compatible (Java 11).
- **Puerto 8080 ocupado**: Puedes cambiar el puerto en `application.properties` agregando `server.port=9090`.
- **Conexión a BD**: Verifica que el usuario y contraseña coincidan con los de tu servidor local.
