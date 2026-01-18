# Library Management System (OOP Implementation)

An advanced Java-based demonstration of Object-Oriented Programming (OOP) concepts, focusing on Class Inheritance, Constructor Chaining, and Method Overriding.

## ☕︎ Overview
This project implements a hierarchical library management structure where common book attributes are inherited by specialized book types (like EBooks). It emphasizes data integrity through validation and encapsulation.

## 🌱 Core Features
* **Encapsulation:** Data protection using `private` fields and `final` constants.
* **Inheritance:** Extending functionality from a base `Book` class to a specialized `EBook` class.
* **Constructor Chaining:** Efficient resource initialization using the `super()` keyword.
* **Data Validation:** Strict input checking to ensure book IDs, prices, and links meet system requirements.
* **Method Overriding:** Custom string representation for objects using the `@Override` annotation.

## 📂 Project Structure
1. **`Book.java`**: The base class containing common attributes.
2. **`EBook.java`**: The child class inheriting from Book with digital-specific fields.
3. **`Main.java`**: The entry point for system testing and object instantiation.

---

## 💻 Implementation Details

### Book Class (Parent)
The base class handles fundamental metadata and ensures that every book has valid basic information.

### EBook Class (Child)
This class extends the `Book` class, adding attributes for digital distribution.

---

## 👨‍💻 Developer
* **Name:** R. M. A. C. Rathnayaka
* **Position:** BICT Undergraduate student