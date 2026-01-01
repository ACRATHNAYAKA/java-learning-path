# BankAccount Management System - OOP Exercise

This project is a Java-based demonstration of core **Object-Oriented Programming (OOP)** principles, specifically focusing on **Encapsulation** and **Data Integrity**. It simulates a real-world banking scenario where account data is protected and transactions follow strict business rules.

## 🎯 Objectives
- **Data Hiding:** Protecting sensitive data from unauthorized direct access.
- **Controlled Access:** Using methods to interact with data.
- **Data Integrity:** Ensuring that the account balance never enters an invalid state (e.g., negative balance).

---

## 🛠️ Features & Business Rules

The system implements the following logic to ensure the security and accuracy of the data:

### 1. Encapsulation
- All fields (`accountNumber`, `ownerName`, `balance`) are marked as **`private`**.
- Direct modification of the balance from outside the class is impossible.
- Access to the balance is only provided via the `getBalance()` method.

### 2. Deposit Logic
- The system only accepts positive deposit amounts.
- If a user enters `0` or a negative value, the system prompts for a valid input using a validation loop.

### 3. Withdrawal Logic
- **Balance Check:** Before any withdrawal, the system checks if the account has enough funds.
- **Overdraft Prevention:** Withdrawals that would result in a negative balance are blocked.
- **Input Validation:** Only positive amounts can be requested for withdrawal.

---

## 🏗️ Project Structure

The project consists of two main classes:

- **`BankAccount.java`**: The blueprint class containing the data, constructor, and transaction logic (Deposit/Withdraw).
- **`Main.java`**: The execution class that initializes the account and simulates the user interface.

---

## 💻 How to Run

1.  **Clone the project** or copy the files into your local directory.
2.  Ensure you have the following folder structure:
    `oop/encapsulationAndDataIntegrity/execise01/`
3.  **Compile the classes:**
    ```bash
    javac oop/encapsulationAndDataIntegrity/execise01/*.java
    ```
4.  **Run the application:**
    ```bash
    java oop.encapsulationAndDataIntegrity.execise01.Main
    ```

---

## 📜 Code Highlights

- **`private final` fields:** Used for `accountNumber` and `ownerName` as they should not change after the account is created.
- **Scanner Integration:** Uses `scanner.nextLine()` with `Double.parseDouble()` to prevent common input buffer issues.
- **Validation Loops:** Implements `while` loops to ensure the user provides valid data before updating the state.

---
*Developed as part of an OOP Learning Exercise.*

