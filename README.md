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
* Modular programmi
