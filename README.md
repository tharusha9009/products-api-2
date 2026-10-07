# Products API

This project is a Spring Boot-based learning API that demonstrates how to model a simple domain, expose REST endpoints, and document object relationships using UML. It is designed as a beginner-friendly Java web development project for learning API structure, Java classes, and REST conventions.

## Project purpose

The repository has evolved from a simple starter application into a small domain-driven example that includes:

- product information and basic product modeling
- customer and address object modeling
- relationship between a customer and their address
- REST controllers for serving example data
- UML documentation for object-oriented design

The focus is not just on returning strings from controllers, but on representing real-world entities and the relationships between them in a clean Java design.

## Current project features

The application now includes these core domain classes:

- `product` - represents a product with an id, name, and price
- `Customer` - represents a customer with id, name, email, and address
- `Address` - represents a street, city, and postcode

The project also includes:

- Spring Boot application bootstrap with `ProductsApiApplication`
- `HelloController` for basic demo endpoints
- `CustomerController` for customer lookup examples
- `productController` for product data examples
- UML diagrams stored in the `docs/uml` folder

## Architecture overview

The application follows a simple Spring Boot layered structure:

- `ProductsApiApplication` - starts the application
- `HelloController` - handles basic greeting and status routes
- `CustomerController` - exposes customer example data
- `productController` - exposes product data examples
- `Customer`, `Address`, and `product` - domain model classes
- `application.properties` - application configuration

### Domain model

The latest commits add object-oriented modeling for product and customer relationships:

- `Address` stores location data
- `Customer` contains a reference to an `Address`
- `product` stores product metadata
- The design reflects a tutorial on encapsulation and UML class associations

This matches the latest learning objectives from the repository history, which include:

- encapsulation
- object associations
- UML diagram creation
- JSON-friendly Java model design

## API endpoints

The application currently provides these endpoints:

- `GET /hello` -> returns a greeting message
- `GET /status` -> returns a status message
- `GET /goodbye` -> returns a goodbye message
- `GET /customers/{id}` -> returns a customer object with an address
- `GET /products/{id}` -> returns product details (depending on the controller implementation)

Example customer response:

```json
{
  "id": 1,
  "name": "Ada Lovelace",
  "email": "ada@example.com",
  "address": {
    "street": "115 New Cavendish Street",
    "city": "London",
    "postcode": "W1W 6UW"
  }
}
```

## UML documentation

The repository includes UML artifacts under `docs/uml` to support the object-oriented design learning exercises.

Files include:

- `docs/uml/UML.drawio`
- `docs/uml/Customer_&_Address_UML.drawio .html`

These diagrams illustrate the relationships between the domain classes and help students understand how Java objects are structured and connected.

## Project structure

```text
products-api-2/
├── docs/
│   └── uml/
│       ├── UML.drawio
│       └── Customer_&_Address_UML.drawio .html
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── uk/ac/westminster/products_api/
│   │   │       ├── Address.java
│   │   │       ├── Customer.java
│   │   │       ├── CustomerController.java
│   │   │       ├── HelloController.java
│   │   │       ├── Person.java
│   │   │       ├── ProductsApiApplication.java
│   │   │       ├── product.java
│   │   │       └── productController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
├── README.md
└── .mvn/
```

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

Then open the API in a browser or API client using URLs such as:

- `http://localhost:8080/hello`
- `http://localhost:8080/status`
- `http://localhost:8080/goodbye`
- `http://localhost:8080/customers/1`

## Summary

This repository is a progressive learning project showing how a Java Spring Boot API can evolve from a simple greeting app into a more realistic domain model. The recent commits reflect a move toward encapsulation, object relationships, class design, and UML-based understanding.

It is an excellent starting point for learning:

- Java class modeling
- Spring REST controllers
- object composition
- JSON serialization
- UML and software design basics

