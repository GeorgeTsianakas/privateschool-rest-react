# privateschool REST Application using Spring Boot & React ![](https://img.shields.io/badge/Framework-Spring-informational?style=flat&logo=spring) ![](https://img.shields.io/badge/Library-React-informational?style=flat&logo=react)

A Spring Boot/React User Management System project which is extend to my old projects [privateschool](https://github.com/GeorgeTsianakas/privateschool) and [trainersCRUD](https://github.com/GeorgeTsianakas/trainersCRUD).

- **server** - Service implemented using Spring Boot, Spring Security, MySQL, Hibernate.
- **client** - A NodeJs application implemented using React. This consumes services hosted by server side.
 
#### 1) Build Server Side

```
$ cd server
$ mvn package
```

#### 2) Build and run client side

```
$ cd client
$ npm start
```

### Access server side using following URL

```
http://localhost:8080
```

### Access application using following URL

```
http://localhost:3000