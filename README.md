# Products API

This project is a beginner-friendly Spring Boot application created as part of a Java web development tutorial. The main goal is to help students understand how a REST API is structured, how Spring Boot starts an application, and how HTTP requests are mapped to Java methods.

## Project purpose

The repository demonstrates the fundamentals of building a simple API with Java and Spring Boot. It introduces the following concepts:

- creating a Spring Boot application
- running an embedded web server
- exposing REST endpoints with `@RestController`
- returning simple responses from Java methods
- organizing basic application classes and configuration

Although the project is named `products-api`, it is currently a learning starter project rather than a full production ecommerce backend. The focus is on learning the architecture and mechanics of a web API.

## Architecture overview

The application follows a small, straightforward Spring Boot structure:

- `ProductsApiApplication` - application bootstrap and entry point
- `HelloController` - REST API endpoints and request handling
- `Person` - simple Java model object
- `application.properties` - project configuration

### 1. Application entry point
The class `ProductsApiApplication` is the main launcher for the Spring application. It is annotated with `@SpringBootApplication`, which enables component scanning and auto-configuration for the project.

When the application starts, Spring Boot creates the application context and begins the embedded server.

### 2. Controller layer
The `HelloController` class is annotated with `@RestController`. This tells Spring to treat it as a controller that handles incoming HTTP requests.

Inside the controller, methods are mapped to routes such as:

- `/hello`
- `/status`
- `/goodbye`

Each method returns a String response, which is sent back to the client by the web server.

### 3. Model layer
The `Person` class is a simple Java object that demonstrates a basic model. It contains fields and getters/setters following JavaBean conventions. This is useful for learning how objects are represented and later expanded into more complex data models.

### 4. Configuration
The `src/main/resources/application.properties` file contains application configuration. In this project, it sets the application name to `products-api`.

## How the application works

When the application is launched:

1. Spring Boot starts from `ProductsApiApplication`
2. The app context is initialized
3. Spring scans for controller components
4. `HelloController` is registered as a REST endpoint handler
5. Incoming HTTP requests are routed to matching methods
6. The method returns a response, which is sent back to the client

A basic request flow looks like this:

Client request -> Spring Boot controller -> Java method -> HTTP response

## Example endpoints

The current API includes these routes:

- `GET /hello` -> returns a greeting message
- `GET /status` -> returns a status string with the current date
- `GET /goodbye` -> returns a goodbye message

## Project structure

```text
products-api-2/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── uk/ac/westminster/products_api/
│   │   │       ├── ProductsApiApplication.java
│   │   │       ├── HelloController.java
│   │   │       └── Person.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## Technology stack

- Java
- Spring Boot
- Maven
- Spring Web

## Run the project

From the root of the project, run:

```bash
./mvnw spring-boot:run
```

Then open the following URLs in a browser or API client:

- `http://localhost:8080/hello`
- `http://localhost:8080/status`
- `http://localhost:8080/goodbye`

## Summary

This project is a practical introduction to Spring Boot and REST API development. It gives a clear example of how a simple Java web application is structured, how endpoints are created, and how a request is processed from the browser to the backend and back again.

It is a strong starting point for learning more advanced API features such as CRUD operations, validation, database integration, and service-based application design.
