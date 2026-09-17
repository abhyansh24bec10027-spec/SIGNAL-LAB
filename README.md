# SIGNAL-LAB

## Digital Communication Signal Processing Simulator

SIGNAL-LAB is a Java-based command-line application that simulates important stages of a digital communication system. The project demonstrates signal generation, sampling, quantization, error-control coding, noisy-channel simulation, error detection/correction, validation, and execution logging.

The project is designed to run completely through the command line without requiring a graphical user interface.

---

## 1. Project Objectives

The main objectives of SIGNAL-LAB are:

* Generate and simulate different types of signals.
* Perform signal sampling and quantization.
* Demonstrate Hamming error-control coding.
* Simulate transmission through a noisy communication channel.
* Detect and correct transmission errors.
* Validate signal parameters using the Nyquist sampling criterion.
* Handle invalid inputs and runtime errors.
* Record execution results and metrics using file handling.

---

## 2. Functional Modules

### Module 1 — Signal Generation, Sampling and Quantization

This module allows the user to work with different signal types and perform basic signal-processing operations.

Main operations include:

* Signal generation
* Sampling
* Quantization
* Signal parameter validation

---

### Module 2 — Error Control Using Hamming Code

This module demonstrates error-control techniques used in digital communication.

Main operations include:

* Hamming code generation
* Encoding of data
* Error detection
* Error correction
* Decoding of received data

---

### Module 3 — Noisy Communication Channel

This module simulates errors that may occur during transmission.

Main operations include:

* Transmission through a simulated noisy channel
* Bit-error simulation
* Configurable error probability
* Analysis of received data

---

### Module 4 — Validation and Logging

This module provides input validation and records execution information.

Main operations include:

* Nyquist criterion validation
* Invalid-input handling
* Exception handling
* Execution metrics
* File-based logging

---

## 3. Java Concepts Demonstrated

The project demonstrates the following Java concepts:

* Classes and Objects
* Object-Oriented Programming
* Encapsulation
* Packages
* Modular programming
* Exception handling
* Custom exception handling
* File handling
* Command-line input/output
* Methods and constructors
* Conditional statements and loops
* Arrays and data processing

---

## 4. Project Structure

```text
SIGNAL-LAB/
│
├── src/
│   └── com/
│       └── signallab/
│           ├── Main.java
│           └── [Other Java source files]
│
├── data/
│   └── [Generated log/output files]
│
├── README.md
│
└── statement.md
```

The Java source files are organized under the `com.signallab` package.

---

## 5. Prerequisites

Before running the project, make sure the following are installed:

* Java Development Kit (JDK) 8 or higher
* Git
* Command Prompt / Terminal

### Check Java Installation

Open a terminal and run:

```bash
java -version
javac -version
```

If both commands display the installed Java version, the Java environment is ready.

---

## 6. Clone the Repository

Clone the project using:

```bash
git clone https://github.com/abhyansh24bec10027-spec/SIGNAL-LAB.git
```

Move into the project directory:

```bash
cd SIGNAL-LAB
```

---

## 7. Compile the Project

Compile the main Java class using:

```bash
javac -sourcepath src -d bin src/com/signallab/Main.java
```

This command compiles the Java source files and places the generated `.class` files inside the `bin` directory.

---

## 8. Run the Project

After successful compilation, run:

```bash
java -cp bin com.signallab.Main
```

The application will start in the terminal and display the available options.

Follow the instructions displayed by the program to perform the required signal-processing and communication operations.

---

## 9. Example Execution

A typical execution follows this general flow:

```text
Start Application
       ↓
Select Operation
       ↓
Enter Signal Parameters
       ↓
Generate / Process Signal
       ↓
Sampling & Quantization
       ↓
Hamming Encoding
       ↓
Noisy Channel Simulation
       ↓
Error Detection / Correction
       ↓
Display Results
       ↓
Store Execution Information
```

---

## 10. Error Handling and Validation

The application validates user inputs and handles invalid conditions.

Examples include:

* Invalid signal parameters
* Invalid sampling frequency
* Invalid signal frequency
* Nyquist sampling criterion violation
* Invalid error probability
* Incorrect data input
* Runtime exceptions

For example, when the sampling frequency does not satisfy the Nyquist criterion, the application reports the invalid condition instead of continuing with an invalid configuration.

---

## 11. Testing

The following test cases can be used to verify the application.

| Test Case | Input / Condition                              | Expected Result                                   |
| --------- | ---------------------------------------------- | ------------------------------------------------- |
| TC01      | Valid signal parameters                        | Signal processing executes successfully           |
| TC02      | Sampling frequency satisfies Nyquist criterion | Sampling proceeds successfully                    |
| TC03      | Sampling frequency violates Nyquist criterion  | Validation error is reported                      |
| TC04      | Error probability = 0                          | No transmission errors are introduced             |
| TC05      | Error probability > 0                          | Noisy-channel errors are simulated                |
| TC06      | Single-bit transmission error                  | Hamming code detects/corrects the error           |
| TC07      | Invalid user input                             | Appropriate validation/error message is displayed |
| TC08      | Normal project execution                       | Output/log information is generated successfully  |

---

## 12. Output and Logging

The project can generate execution information and logs inside the project's `data/` directory.

The `data/` directory is relative to the project root, so the project does not depend on a specific computer or Windows file path.

---

## 13. Command-Line Execution

SIGNAL-LAB is designed to be executed entirely from the command line.

The complete execution process is:

```bash
git clone https://github.com/abhyansh24bec10027-spec/SIGNAL-LAB.git
cd SIGNAL-LAB
javac -sourcepath src -d bin src/com/signallab/Main.java
java -cp bin com.signallab.Main
```

No GUI-based IDE setup is required to execute the project.

---

## 14. Non-Functional Requirements

### Performance

The application should process signal data and perform encoding, decoding, and simulation operations efficiently for the supported input sizes.

### Reliability

The application should provide consistent results for valid inputs and use error-control techniques to detect and correct supported transmission errors.

### Usability

The application should provide clear command-line prompts and understandable output so that users can operate the system through a terminal.

### Maintainability

The application uses a modular Java package and class structure so that individual components can be modified and maintained independently.

### Error Handling

The application should detect invalid inputs and invalid signal configurations and provide appropriate error messages.

### Portability

The project uses standard Java commands and relative project paths so that it can be executed on systems with a compatible Java JDK.

---

## 15. Technologies Used

* **Programming Language:** Java
* **Execution:** Command Line / Terminal
* **Version Control:** Git and GitHub
* **File Handling:** Java File I/O
* **Core Concepts:** OOP, exception handling, signal processing, error-control coding

---

## 16. Repository Information

**Project:** SIGNAL-LAB

**Student:** Abhyansh Balbhadra

**Registration Number:** 24BEC10027

**Repository:**
https://github.com/abhyansh24bec10027-spec/SIGNAL-LAB

---

## 17. Conclusion

SIGNAL-LAB provides a command-line simulation of key digital communication and signal-processing operations using Java. The project combines signal generation and processing with Hamming error-control coding, noisy-channel simulation, validation, exception handling, and file-based logging.

The application demonstrates how Java programming concepts can be applied to implement a modular digital communication simulation that can be compiled and executed directly from a terminal.
### Clone the Repository

```bash
git clone https://github.com/abhyansh24bec10027-spec/SIGNAL-LAB.git
cd SIGNAL-LAB
