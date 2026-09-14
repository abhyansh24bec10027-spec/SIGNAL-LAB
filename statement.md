# Project Statement: SignalLab

## 1. Problem Statement
In real-world electronic communication systems, transmitting data over physical mediums introduces environmental noise. This noise causes signal degradation and random bit flips, compromising data integrity. Engineers must design robust software simulation pipelines to test line coding schemes and error-correction algorithms (like Hamming Code) before implementing them in physical hardware. 

SignalLab addresses this by providing a modular, Object-Oriented Java platform to simulate, test, and analyze the performance of a digital communication pipeline under variable noise conditions.

## 2. Scope of the Project
SignalLab is a console-based Java application that models a complete digital transmitter, transmission channel, and receiver pipeline. The scope includes:
- Simulating analog-to-digital signal generation (Sine, Square, Sawtooth sampling).
- Encoding data blocks using 7,4 Hamming Code for single-bit error correction.
- Simulating a noisy telecommunication channel with user-defined bit-error probabilities.
- Decoding, detecting, and repairing bit errors at the receiver end.
- Calculating and exporting operational metrics like Bit Error Rate (BER).

## 3. Target Users
- **Electronics & Communication Students:** To visually understand how channel noise affects bit streams and how error-correcting codes restore data.
- **Academic Evaluators:** To verify the practical application of core Java programming paradigms (OOP, arrays, exceptions, I/O) to an engineering domain.

## 4. High-Level Features
- Dynamic configuration of signal types and sampling rates.
- Algorithmic implementation of Hamming Code (7,4) matrix operations.
- Random bit-flip noise injection based on probability models.
- Automated error tracking and evaluation console logs.
- External logging system saving results directly to local files.
