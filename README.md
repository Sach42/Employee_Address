# Employee Management System

This is a simple Employee Management System built with Spring Boot, Spring Data JPA, and Hibernate. It provides APIs for managing employees and their addresses.

## Features

- Create, Read, Update, and Delete employees
- Create, Read, Update, and Delete addresses
- One-to-one mapping between Employee and Address entities

## Technologies Used

- Java 8+
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database (for testing, you can replace with your preferred database)
- Maven
- Swagger (for API documentation and testing)

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/employee-management-system.git

### Navigate to the project directory:
cd employee-management-system

### Build the project:
mvn clean install

### Usage
## Start the application:
mvn spring-boot:run

The application will be accessible at http://localhost:8080.

Open the Swagger UI for API documentation and testing:

### Swagger UI: http://localhost:8080/swagger-ui.html
### API Endpoints
### Employees
GET /employees - Get all employees

GET /employees/{id} - Get an employee by ID

POST /employees - Create a new employee

PUT /employees/{id} - Update an employee by ID

DELETE /employees/{id} - Delete an employee by ID

### Addresses

GET /addresses - Get all addresses

GET /addresses/{id} - Get an address by ID

POST /addresses - Create a new address

PUT /addresses/{id} - Update an address by ID

DELETE /addresses/{id} - Delete an address by ID

### Testing with Swagger

Open the Swagger UI at http://localhost:8080/swagger-ui.html.

Explore the available API endpoints and click on an endpoint to expand it.

Click on the "Try it out" button for an endpoint.

Enter the required parameters and click on the "Execute" button.

View the API response and the corresponding status code.

### Contributing
Contributions are welcome! If you find any issues or want to enhance the project, feel free to create a pull request.

#### License
This project is licensed under the MIT License.
