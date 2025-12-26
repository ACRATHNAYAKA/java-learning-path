# Java OOP: Notification System (Abstraction) ✉️

## 🎯 Objective
The primary goal of this exercise is to design a simple **Notification System** using core Object-Oriented Programming principles, specifically focusing on **Abstraction**, **Inheritance**, and **Polymorphism** in Java.

## 📝 Problem Statement
A communication platform needs a unified way to send different types of notifications (**Email, SMS, and Push**) to users. While each notification type has a unique delivery method and destination, they all share a common core attribute: a **message**.

## 🏗️ Class Architecture

| Class | Type | Attributes | Methods |
| :--- | :--- | :--- | :--- |
| **Notification** | `Abstract Class` | `String message` | `abstract void send()` |
| **EmailNotification** | `Subclass` | `String recipientEmail` | `void send()` (Override) |
| **SMSNotification** | `Subclass` | `String phoneNumber` | `void send()` (Override) |
| **PushNotification** | `Subclass` | `String deviceID` | `void send()` (Override) |

## 🛠️ Key Technical Concepts
* **Abstraction:** Using an `abstract class` to define a template for all notification types without specifying the exact delivery logic.
* **Inheritance:** Extending the base `Notification` class to reuse common properties while adding specialized identifiers.
* **Polymorphism:** Using a `Notification` reference to hold different subclass objects and calling the `send()` method dynamically at runtime.



## 💻 Implementation Logic
1.  **Notification.java**: The abstract base class that enforces a contract for any notification type.
2.  **Concrete Classes**: Each class (Email, SMS, Push) provides its own specific implementation of the `send()` method.
3.  **Main.java**: Demonstrates polymorphism by creating an array or list of `Notification` objects and triggering their delivery in a loop.

## 📊 Expected Output
When the program runs, it simulates the delivery process to different destinations:

```text
Sending Email to support@example.com: Your OTP is 1234
Sending SMS to +94771234567: Your OTP is 1234
Sending Push Notification to Dev-ID-9988: Your OTP is 1234