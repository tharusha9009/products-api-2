# Products API

This project is a simple Spring Boot REST API created as a learning exercise for Week 1 of the Spring Boot tutorial series. The repository demonstrates how to set up a basic web application, expose HTTP endpoints, and return simple responses in JSON or plain text.

## Purpose of the project

The main goal of this project is to introduce the fundamentals of a REST API built with Java and Spring Boot. It is intended to help students and developers understand:

- how a Spring Boot application starts
- how controllers map HTTP routes
- how a basic API responds to client requests
- how application configuration is managed
- how simple Java model objects can be used in a web application

Although the name suggests a product API, this repository is currently a starter project focused on learning API concepts rather than a full production-ready ecommerce backend.

## Architecture

The application follows a very simple layered structure typical of a Spring Boot beginner project:

- Application entry point: `ProductsApiApplication`
- HTTP layer: `HelloController`
- Model layer: `Person`
- Configuration: `application.properties`

### Main components

1. `ProductsApiApplication`
   - This is the Spring Boot main class.
   - It is annotated with `@SpringBootApplication`.
   - It starts the embedded Tomcat server and initializes the application context.

2. `HelloController`
   - This class is annotated with `@RestController`.
   - It exposes HTTP endpoints like `/hello`, `/status`, and `/goodbye`.
   - Each method returns a Java string, which Spring converts to an HTTP response.

3. `Person`
   - A simple Java bean used to demonstrate object modeling.
   - It contains a `name` field and an `email` field with JavaBean-style accessors.
   - It illustrates how plain Java classes can be used in a web API context.

4. `application.properties`
   - Stores application-level configuration.
   - The current configuration sets the application name to `products-api`.

## How it works

When the application starts:

- `ProductsApiApplication.main()` runs.
- Spring Boot creates the application context.
- It scans for Spring components such as controllers.
- `HelloController` is registered as a REST endpoint handler.

When a client sends a request to the API:

- the HTTP request reaches the embedded server
- Spring matches the URL path to a controller method
- the corresponding method is executed
- the returned value is sent back as an HTTP response

### Example endpoints

- `GET /hello` -> returns `Hello from Spring Boots!`
- `GET /status` -> returns the current date and a status message
- `GET /goodbye` -> returns `Goodbye from Spring Boot!`

## Project flow

The overall flow is:

Client request -> Spring Boot controller -> method logic -> HTTP response

This is a classic MVC-style REST architecture simplified for learning, where the controller acts as the entry point for incoming requests and returns the required response.

## Technology stack

- Java
- Spring Boot
- Maven
- Spring Web

## Run the project

From the project root, run:

```bash
./mvnw spring-boot:run
```

Then open:

- `http://localhost:8080/hello`
- `http://localhost:8080/status`
- `http://localhost:8080/goodbye`

## Summary

This project is a beginner-friendly Spring Boot API example that demonstrates how a small Java web application is structured, how requests are routed, and how responses are returned. It serves as a foundation for building more advanced APIs with database connectivity, business logic, and real product management features.
