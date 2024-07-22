# SpringBoot-User-Defined-Exception-Handling

This is a simple Spring Boot application for managing user data with exception handling. The application provides RESTful APIs for CRUD operations on user data and handles exceptions gracefully using a global exception handler.

## Features

- Save user data
- Retrieve all users
- Find user by ID
- Find user by name
- Exception handling for non-existing users

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- An IDE like IntelliJ IDEA or Eclipse

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/KoushalKumar22/SpringBoot-User-Defined-Exception-Handling.git
   cd SpringBoot-User-Defined-Exception-Handling
2. Build the project:
   ```sh
     mvn clean install
3. Run the application:
   ```sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints
- GET /test: A test endpoint to verify the application is running.
- POST /save: Save user data. Expects a JSON body with name and address.
- GET /all: Retrieve all users.
- GET /id/{id}: Find a user by their ID.
- GET /name/{name}: Find a user by their name.


### Exception Handling
- IdNotFoundException: Thrown when a user with the specified ID does not exist.
- NameNotFoundException: Thrown when a user with the specified name does not exist.
- These exceptions are handled by a global exception handler, returning a 404 NOT FOUND status with a descriptive message.
