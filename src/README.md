# Bank Management System | Core Java

A console-based Bank Management System developed using Core Java to perform basic banking operations and demonstrate object-oriented programming concepts.

## Features

- Create savings accounts
- Create current accounts
- Display account details
- Deposit money
- Withdraw money
- Transfer money between accounts
- Check account balance
- Calculate interest
- Validate account numbers and transaction amounts
- Handle exceptions using custom exception classes

## Technologies Used

- Java (Core Java)
- Object-Oriented Programming (OOP)
- Java Arrays
- Exception Handling
- Scanner Class
- Eclipse IDE

## OOP Concepts Implemented

- **Abstraction:** Used an abstract `account` class and an abstract interest calculation method.
- **Encapsulation:** Used private fields with getter and setter methods.
- **Inheritance:** Extended the `account` class through `savingsAccount` and `currentAccount`.
- **Polymorphism:** Implemented different interest calculation behaviors for savings and current accounts.

## Custom Exceptions

- `InvalidAmountException`
- `InsufficientBalanceException`
- `AccountNotFoundException`

## Project Structure

```text
BankManagementSystem/
├── src/
│   ├── account.java
│   ├── savingsAccount.java
│   ├── currentAccount.java
│   ├── bank.java
│   ├── bankmanagement.java
│   ├── InvalidAmountException.java
│   ├── InsufficientBalanceException.java
│   └── AccountNotFoundException.java
├── README.md
├── .gitignore
├── .project
└── .classpath
```

## How to Run

1. Clone or download this repository.
2. Import the project into Eclipse as an existing Java project.
3. Open `bankmanagement.java`.
4. Run the class containing the `main()` method.
5. Select an option from the console menu to perform banking operations.

## Limitations

- Account information is stored in memory using an array.
- Account information
