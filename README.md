# PrivateSchool — REST Application (Spring Boot + React)

![Spring](https://img.shields.io/badge/Framework-Spring-informational?style=flat&logo=spring) ![React](https://img.shields.io/badge/Library-React-informational?style=flat&logo=react) ![MySQL](https://img.shields.io/badge/Database-MySQL-informational?style=flat&logo=mysql) ![Build](https://img.shields.io/badge/Build-Maven-blue?logo=apachemaven) ![License](https://img.shields.io/badge/License-MIT-green)

A full‑stack User Management System built with Spring Boot (REST API) and React (SPA). It extends and modernizes ideas from my earlier projects: [privateschool](https://github.com/GeorgeTsianakas/privateschool) and [trainersCRUD](https://github.com/GeorgeTsianakas/trainersCRUD).

- server — Spring Boot, Spring Security, Hibernate/JPA, MySQL
- client — React application that consumes the server API

## Features
- User registration and login via Spring Security session authentication
- Role management (e.g., change a user's role)
- Admin endpoints to list and delete users
- React SPA with guarded routes and basic profile/registration pages

## Architecture
- Backend: Java 17+ (Spring Boot), JPA/Hibernate, MySQL
- Frontend: React (Create React App)
- Communication: JSON over HTTP (REST)
- Auth: Cookie/session based (Spring Security)

```
root
├─ server/       # Spring Boot REST API
└─ client/       # React SPA
```

## Prerequisites
- Java 17+ (JDK)
- Node.js 18+ and npm
- Maven 3.8+
- MySQL 8+ running locally

## Configuration (Server)
Server configuration resides in server/src/main/resources/application.properties. Defaults provided in the repo:

```
# datasource
spring.datasource.username=root
spring.datasource.password=123456789
spring.datasource.url=jdbc:mysql://localhost:3306/reactschool?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false

# JPA
spring.jpa.hibernate.ddl-auto=update
```

Notes:
- Ensure a MySQL database named reactschool exists, or enable createDatabaseIfNotExist in the URL.
- Update username/password to match your local setup. Do not use the default password in production.

## Getting Started
1) Start the backend (server)

PowerShell (Windows):

```
cd server
mvn spring-boot:run
```

Or build a jar:

```
cd server
mvn clean package
java -jar target\server-*.jar
```

API base URL: http://localhost:8080

2) Start the frontend (client)

```
cd client
npm install
npm start
```

App URL: http://localhost:3000

## API Overview
Base path: /api

Public/User endpoints
- POST /api/user — Register a new user with JSON body (UserDto)
- GET  /api/user/login — Returns current authenticated user (also target for logout redirect)
- PUT  /api/user/{username}/change/{role} — Change a user role

Admin endpoints
- GET    /api/admin/all — List all users (ADMIN only)
- DELETE /api/admin/{userId} — Delete a user (ADMIN only)

Authentication
- Spring Security is configured for session-based auth. Ensure the client sends credentials with requests where required.

## Frontend
Key pages and components:
- Login, Register, Profile, Home
- AuthGuard for route protection

Run scripts (from client/):
- npm start — development server at http://localhost:3000
- npm test — run tests (if present)
- npm run build — production build to build/

## Development Tips
- If the frontend needs to call the backend with credentials, ensure fetch/Axios includes credentials and CORS is configured appropriately in the server security config.
- For port conflicts, change the React dev server port by setting PORT in an .env file in client/.

## Troubleshooting
- MySQL connection errors: verify spring.datasource.url, username, and password; ensure MySQL is running and database exists.
- CORS/auth issues: check Spring Security configuration and browser console for blocked requests.
- Build failures: ensure JDK and Maven versions match prerequisites.

## Related Work
This project is an evolution of:
- privateschool — https://github.com/GeorgeTsianakas/privateschool
- trainersCRUD — https://github.com/GeorgeTsianakas/trainersCRUD

## Branches and Alternative Implementations
There may be branches with different implementations. From your local git repo, you can explore them with:
- git fetch --all
- git branch -a
- git checkout <branch>
- git log --oneline --decorate --graph --all

If you want, open an issue indicating which branch to feature here and I can document differences in this README.

## License
This project is licensed under the MIT License. See LICENSE if provided; otherwise, treat as MIT for reuse of the example code.
