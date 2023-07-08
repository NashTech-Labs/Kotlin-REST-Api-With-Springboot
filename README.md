# REST API Example

This is an example REST API application that provides basic banking operations.

## Overview

The application consists of several components:

- `Bank` data class: Represents a bank with account details such as account number, trust value, and transaction fee.
- `BankDataSource` interface: Provides an abstraction for accessing the data source related to banks.
- `MockBankDataSource` class: A mock implementation of the `BankDataSource` interface for testing purposes.
- `BankService` class: A service class for performing bank-related operations by utilizing the `BankDataSource`.
- `BankController` class: A controller class for handling REST API requests related to banks.

## Prerequisites

To run the application, ensure you have the following prerequisites installed on your system:

- Java Development Kit (JDK) version 8 or higher
- Gradle build tool
- Spring Boot

## Getting Started

Follow these steps to run the application:

1. Clone this repository to your local machine.
2. Open a command prompt or terminal and navigate to the project's root directory.
3. Build the project using the following command:

   ```shell
   gradle build
Run the application using the following command:

   ```shell
   gradle bootRun
```

### The application will start and listen on a specific port (e.g., localhost:8080).

- API Endpoints
1. The REST API provides the following endpoints:

- GET /api/banks: Retrieves all banks.
- GET /api/banks/{accountNum}: Retrieves a bank with the specified account number.
- POST /api/banks: Adds a new bank.
- PATCH /api/banks: Updates an existing bank.
- DELETE /api/banks/{accountNum}: Deletes a bank with the specified account number.

2. Error Handling
>>  The application handles two types of exceptions:

- 1. NoSuchElementException: Thrown when a requested bank or resource is not found.
- 2. IllegalArgumentException: Thrown when an invalid argument is provided.
Both exceptions return an appropriate HTTP response with an error message.

3. Contributing
Contributions are welcome! If you find any issues or want to enhance the functionality, feel free to open a pull request.