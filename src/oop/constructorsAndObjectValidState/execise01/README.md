# 🛡️ Java Robust Object Design

This project demonstrates how to build reliable Java objects using **Immutability** and **Defensive Programming**.

## 🚀 Principles Demonstrated
- **Encapsulation:** Protecting the internal state of the object.
- **Immutability:** Using `final` fields to prevent state changes after creation.
- **Self-Validation:** Objects validate themselves during construction using `IllegalArgumentException`.
- **Constructor Chaining:** Efficiently managing multiple constructors with `this()`.

## 📋 Logic Rules
- **ID & Name:** Must not be null or empty string.
- **Age:** Must be within the range **5 - 100**.
- **Defaulting:** If age is not provided, it defaults to **18**.

## 💻 Running the Project
Compile all files and run the `Main` class. The output will show both successful object creation and graceful handling of invalid inputs.

```bash
javac oop/constructorsAndObjectValidState/execise01/*.java
java oop.constructorsAndObjectValidState.execise01.Main