## Polynomial Operations Using Linked Lists

### About the Project

Polynomial Operations is a Java-based application developed as part of the ITSE205 / CSSE2203 – Data Structures and Algorithm course at the University of Technology and Applied Sciences (UTAS).

The project focuses on representing and manipulating mathematical polynomials using a linear data structure. It uses a singly linked list, where each node stores a polynomial term's coefficient and exponent.

The application allows users to enter two polynomials and perform different mathematical operations on them.

### Features

Polynomial Input: Reads two polynomials of any degree from the user.

Polynomial Representation: Stores polynomial terms using a singly linked list.

Polynomial Addition: Adds two polynomials and displays the result.

Polynomial Multiplication: Multiplies two polynomials.

Scalar Multiplication: Multiplies a polynomial by a constant.

Term Insertion: Inserts a term with a specified degree into a polynomial.

Term Searching: Checks whether a term of a given degree exists in a polynomial.

Polynomial Equality: Checks whether two polynomials are equal.

Polynomial Inversion: Supports the inverse operation if implemented in the application.

### Technologies Used

Java

Singly Linked Lists

Data Structures and Algorithms

Object-Oriented Programming

Loops and Conditional Statements

Data Structure

### The application uses a singly linked list to represent polynomials. Each node stores:

Coefficient: The numerical coefficient of a term.

Exponent: The power of the variable (x).

Next: A reference to the next node in the list.

#### For example, the polynomial:

P(x) = 5x^4 + 3x^3 - 2x^2 + x - 7

can be represented as a sequence of linked nodes, with each node storing one term.

#### Example

#### Given:

P(x) = 2x^2 + 3x + 1

Q(x) = x^2 + 2x + 4

#### Addition:

P(x) + Q(x) = 3x^2 + 5x + 5

#### Scalar Multiplication:

For a constant of 2:

2P(x) = 4x^2 + 6x + 2

### How to Run

Install the Java Development Kit (JDK).

Clone or download this repository.

Open the project in a Java IDE, such as NetBeans, IntelliJ IDEA, or Eclipse.

Ensure the Java source files are in the correct package or source directory.

Run the Java file containing the main() method.

### Concepts Demonstrated

Singly linked list implementation

Node creation and traversal

Insertion and searching

Polynomial arithmetic

Methods and modular programming

Algorithmic problem-solving

### Project Purpose

This project was developed as an academic assignment to apply data structures and algorithms to a mathematical problem. It demonstrates how linked lists can be used to store and manipulate polynomial expressions dynamically.
