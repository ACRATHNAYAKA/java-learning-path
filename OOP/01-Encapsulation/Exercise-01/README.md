# Java OOP: Encapsulation and Data Validation Challenge 🛡️

## 📌 Problem Description
In Object-Oriented Programming, protecting the internal state of an object is crucial. This project demonstrates a common real-world scenario where we need to manage a **Book** entity while ensuring that no invalid data (like negative prices or empty titles) enters the system.

## 🎯 The Objective
The goal is to create a robust `Book` class that:
* **Hides Data:** Uses private access modifiers for all fields.
* **Validates Input:** Ensures data integrity through public setter methods.
* **Formats Output:** Displays the price in a specific currency format (LKR).

## 🛠️ Requirements & Validation Rules

| Attribute | Data Type | Validation Rule |
| :--- | :--- | :--- |
| **title** | String | Cannot be null or an empty string. |
| **price** | double | Cannot be a negative value. |
| **pages** | int | Must be greater than zero. |

## ✨ Technical Features
* **Encapsulation:** Implementation of private attributes with public getters and setters.
* **Currency Formatting:** Uses `java.text.NumberFormat` to display the price in Sri Lankan format (LKR).
* **Error Messaging:** Provides immediate feedback to the console when invalid data is attempted to be set.

## 💻 Implementation Logic
The project consists of two main components:
1.  **`Book.java`**: The blueprint class containing the logic for encapsulation and validation.
2.  **`Main.java`**: The driver class that tests the system with both valid and invalid scenarios to prove the robustness of the system.

## 📊 Expected Output
When the program is executed, the following output is generated in the console:

```text
-Valid Data-
Title  : My Book
Price : LKR 2,000.00
Pages : 500

-Invalid Data-
Title cant be empty
Price cant be Negative
Pages cant be Zero or Negative

-Final Status-
Title  : My Book
Price : LKR 2,000.00
Pages : 500