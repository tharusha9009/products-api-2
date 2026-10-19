# Products API

This project is a Spring Boot-based learning API that demonstrates how to model a simple domain, expose REST endpoints, and document object relationships using UML. It is designed as a beginner-friendly tutorial repository that evolves through small, incremental activities and exercises.

## Project purpose

The repository has evolved from a simple starter application into a small domain-driven example that includes:

- product information and basic product modeling (including an inheritance example)
- customer and address object modeling
- relationship between a customer and their address
- simple service classes that provide example data
- REST controllers for serving example data
- UML documentation for object-oriented design and recent exercises

The focus is on representing real-world entities and relationships in a clean Java design and on practicing common OOP patterns taught in the tutorial activities.

## Current project features

The application now includes these core domain classes and features:

- `Product` - base product class with id, name, and price
- `DigitalProduct` - an example subclass that extends `Product` (tutorial activity)
- `PhysicalProduct` - another subclass showing a different variation of `Product`
- `Customer` - represents a customer with id, name, email, and address
- `Address` - represents a street, city, and postcode
- `productService` - a simple service that provides lists and lookups of products

The project also includes:

- Spring Boot application bootstrap with `ProductsApiApplication`
- `HelloController` for basic demo endpoints
- `CustomerController` for customer lookup examples
- `productController` for product data examples
- UML diagrams and activity artifacts stored in the `docs/uml` folder

## Architecture overview

The application follows a simple Spring Boot layered structure:

- `ProductsApiApplication` - starts the application
- Controllers - handle HTTP requests and return JSON responses
  - `HelloController` - greeting and status routes
  - `CustomerController` - exposes customer example data
  - `productController` - exposes product data and demonstrates using the service layer
- Service layer
  - `productService` - constructs example product objects and demonstrates business logic like searching with streams
- Domain model classes
  - `Customer`, `Address`, `Product`, `DigitalProduct`, `PhysicalProduct`
- `application.properties` - application configuration

### Domain model

Recent commits add object-oriented modeling for product inheritance and service-layer examples:

- `Product` is the base class used in the tutorial examples
- `DigitalProduct` and `PhysicalProduct` demonstrate inheritance and specialization
- `productService` contains example data and utility methods (including stream-based search examples)
- `Customer` contains a reference to an `Address`

These changes are part of the tutorial activities that cover:

- encapsulation
- inheritance and polymorphism
- object associations
- using Java Streams for collection processing
- UML diagram creation to document class relationships

## API endpoints

The application currently provides these demo endpoints:

- `GET /hello` -> returns a greeting message
- `GET /status` -> returns a status message
- `GET /goodbye` -> returns a goodbye message
- `GET /customers/{id}` -> returns a customer object with an address
- `GET /products/{id}` -> returns product details (depending on the controller implementation)
- Additional controller routes demonstrate listing products and searching/filtering using the service layer

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

The repository includes UML artifacts under `docs/uml` to support the object-oriented design learning exercises. Recent commits add and update diagrams that illustrate:

- the `Product` inheritance hierarchy (Product, DigitalProduct, PhysicalProduct)
- the `Customer` and `Address` relationship
- class diagrams used in tutorial activities and exercises

Files you may find under `docs/uml` include draw.io artifacts and exported HTML diagrams used for classroom demonstration.

## Project structure

```
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
│   │   │       ├── Product.java
│   │   │       ├── DigitalProduct.java
│   │   │       ├── PhysicalProduct.java
│   │   │       ├── productController.java
│   │   │       └── productService.java
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

## Recent activity summary

The most recent commits introduce tutorial activities that extend the product model (DigitalProduct / PhysicalProduct), add a product service with additional example objects, and update UML diagrams used in the lessons. See the commit history for a step-by-step progression through the tutorial activities.

## Summary

This repository is a progressive learning project showing how a Java Spring Boot API can evolve from a simple greeting app into a more realistic domain model. The recent commits reflect a move toward demonstrating inheritance, service-layer patterns, collection processing with streams, and clearer UML documentation for class relationships.
