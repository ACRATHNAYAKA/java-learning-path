# 🎓 Student Marks Processing System (Java OOP)

This project demonstrates the practical application of **Object-Oriented Programming (OOP)** principles in a real-world scenario. Rather than just a simple calculation tool, this system focuses on **Data Integrity**, **Robustness**, and **Industry-Standard Design Patterns**.



## 🚀 Key Features & Highlights

* **Immutable Design:** The `Student` class is designed as an immutable object. This ensures that once a student is created, their core identity (ID and Name) cannot be altered, preventing accidental data corruption.
* **Fail-Fast Validation:** Using the "Fail-Fast" principle, all data is validated inside the constructors. If invalid data (null, empty strings, or out-of-range marks) is provided, the system throws an `IllegalArgumentException` immediately.
* **Strong Data Integrity:** The system ensures that the number of subjects matches the number of marks and verifies that all marks fall within the valid range (0–100) before allowing object creation.
* **Domain Association:** Demonstrates a clean **"Has-A" relationship** where an `ExamResult` is associated with a specific `Student` object.

## 🛠 Project Structure

The project consists of three core classes:

1.  **`Student.java`**: Manages the student's identity with strict validation and immutability.
2.  **`ExamResult.java`**: The core business logic layer. It handles mark storage, average calculation, and grade reporting.
3.  **`Main.java`**: The orchestrator that initializes objects and executes the workflow.



## 🧠 OOP Concepts Applied

* **Encapsulation:** All fields are marked `private` and `final`, protecting the internal state of objects and exposing data only through controlled methods.
* **Association:** Implements object-to-object communication by passing a `Student` reference into the `ExamResult` class.
* **Constructor Injection:** Dependencies are injected via constructors to ensure objects are always in a valid state from the moment of instantiation.
* **Exception Handling:** Robust error management using standard Java exceptions to handle edge cases and invalid inputs.

## 💻 How to Run

1.  **Clone the repository** or download the source files.
2.  **Compile the classes** via terminal:
    ```bash
    javac oop/studentMarksProcessingSystem/*.java
    ```
3.  **Run the application**:
    ```bash
    java oop.studentMarksProcessingSystem.Main
    ```

## 📝 Example Output

```text
Student Name : His Name
Student ID   : 90000
----------Grade Report---------
Subject                 Grade
English                  A
Science                  B
Sinhala                  B
Maths                    A
History                  W
Total : 340.0
Average : 68.0

