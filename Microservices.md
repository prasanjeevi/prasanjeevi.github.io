<link rel="stylesheet" href="styles.css"/>

# Microservices

* Small [services](#service)
* Independently deployable units
* For scalability and availability
* Fault isolation

## Microservice Architecture
![microservice-architecture](images/microservice-architecture.png?raw=true)

## Monoliths vs Microservices
![monoliths-vs-microservices](images/monoliths-vs-microservices.png?raw=true)

## Scale cube
![scale-cube](images/scale-cube.jpg?raw=true)

## Service  
Service-oriented architecture (SOA) - A service is a discrete unit of functionality that can be accessed remotely and acted upon and updated independently

## Philosophy
* Continuous integration and delivery/deployment (CI/CD)
* Cloud native
* Enterprise application
* Loosely coupled, collaborating services
* Expose an API for 3rd parties to consume
* Integrate with other applications, external services
* Support web, mobile web, native mobile applications

> Do one thing and do it well - [Unix philosophy](https://en.wikipedia.org/wiki/Unix_philosophy)

* Decomposition
  * Single responsibility principle (SRP) - a responsibility of a class as a reason to change, and states that a class should only have one reason to change.
  * Common closure principle (CCP) - classes that change for the same reason should be in the same package.
  * Decompose by business capability
  * Decompose by Domain-driven design (DDD) subdomain.
  * Decompose by verbs / nouns / usecases
* Representational state transfer (REST)
  * Create, read, update and delete (CRUD)
  * [REST constraints](https://en.wikipedia.org/wiki/Representational_state_transfer#Architectural_constraints)
* Atomicity, consistency, isolation, durability (ACID)
* Cross-cutting concern
  * Persistence
  * Caching
  * Security
  * Logging

## Reference Sites
* [microservices.io](http://microservices.io)
* [martinfowler.com > Microservices](https://martinfowler.com/articles/microservices.html)

## Books
![building-microservices-book](images/building-microservices-book.jpg?raw=true)

![](images/microservice-patterns-book.png?raw=true)
