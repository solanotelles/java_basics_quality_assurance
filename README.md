# Month 1 — Java Fundamentals and Quality Control CLI

> This repository represents Month 1 of a structured 12-month learning roadmap focused on Java Backend Development.

## Overview

This repository documents my first month of structured Java studies.

The main goals of this stage were to practice programming fundamentals, problem-solving, code organization, Git/GitHub usage, and the development of a terminal-based Java application.

The repository contains weekly exercises and a final project that combines the concepts studied throughout the month.

---

## Learning Timeline

| Week | Period | Main Focus |
|---|---|---|
| **Week 1** | July 13 – July 19 | Development environment setup, Java syntax, programming logic, and Git basics |
| **Week 2** | July 20 – July 26 | Control flow, `switch`, methods, and persistent menus |
| **Week 3** | July 27 – August 2 | Arrays, `ArrayList`, data storage, searches, and initial project structure |
| **Week 4** | August 3 – August 12 | Quality Control System development, refactoring, testing, and documentation |

---

## Concepts Practiced

Throughout the exercises and project development, I practiced:

- **Java fundamentals:** variables, primitive data types, operators, and expressions;
- **Input and output:** reading data with `Scanner` and formatting console output;
- **Conditional structures:** `if`, `else if`, `else`, and `switch`;
- **Loops:** `for`, `while`, and `do-while`;
- **Methods:** parameters, `void` methods, return values, and separation of responsibilities;
- **Data structures:** arrays and `ArrayList`;
- **Basic algorithms:** linear search, sum, average, minimum, maximum, and comparisons;
- **Program organization:** persistent CLI menus, reusable methods, and business-rule validation;
- **Version control:** commits, push operations, and project history using Git and GitHub.

---

## Repository Structure

```text
src/
├── week1/      # Java fundamentals, arithmetic, conditionals, and loops
├── week2/      # Methods, switch statements, and persistent menu exercises
├── week3/      # Arrays, ArrayList operations, searches, and project prototypes
└── week4/      # Final project: Quality Control System
```

---

## Weekly Progress

### Week 1 — Java Fundamentals and Logic

Main topics:

- reading user input;
- arithmetic and logical operators;
- conditional statements;
- loops and accumulators;
- basic validation and boundary testing.

Exercises included:

- even or odd number verification;
- largest value among three numbers;
- multiplication table;
- sum, average, minimum, and maximum calculations;
- initial quality-analysis exercise;
- repository creation and first commits.

### Week 2 — Methods and Program Flow

Main topics:

- extracting logic into methods;
- using parameters and return values;
- organizing menu-based programs;
- applying `switch` and persistent loops.

Exercises included:

- weekday selector;
- calculator with multiple operations;
- mathematical utility methods;
- age verification with a boolean return value;
- even or odd verification through a method;
- quality compliance verification;
- persistent CLI menus.

### Week 3 — Arrays and ArrayList

Main topics:

- storing multiple values in memory;
- iterating through collections;
- searching and comparing stored data;
- passing collections to methods;
- organizing the first version of the final project.

Exercises included:

- array declaration and index access;
- sum, average, minimum, and maximum calculations;
- linear search and index lookup;
- dynamic registration using `ArrayList`;
- collection-based project prototypes.

### Week 4 — Final Project and Documentation

Main topics:

- integrating the concepts practiced during the month;
- organizing the application into methods;
- validating business rules;
- testing boundary values;
- documenting the project and its current limitations.

---

## Capstone Project — Quality Control System

The final project is a terminal-based Java application that simulates a simplified quality-control workflow.

Its purpose is to practice procedural Java fundamentals and in-memory collection manipulation before introducing object-oriented domain modeling.

### System Menu

```text
=== Quality Control System ===
1 - Register Analysis
2 - List Analyses
3 - Calculate Average Moisture
4 - Check Analyses Outside the Standard
0 - Exit
```

### Data Stored for Each Analysis

Each analysis contains:

- product name;
- measured moisture;
- maximum moisture limit;
- measured density;
- maximum density limit.

### Compliance Rules

- Measured value `<=` maximum limit: **Compliant**
- Measured value `>` maximum limit: **Non-Compliant**

Values exactly equal to the maximum limit are considered compliant.

### Sample Output

```text
Analysis 1
Product: Dog Dog
Moisture: 9.20% - Compliant (Limit: 9.50%)
Density: 420 g/L - Non-Compliant (Limit: 400 g/L)

Analysis 2
Product: Rocky Dog
Moisture: 8.10% - Compliant (Limit: 8.50%)
Density: 390 g/L - Compliant (Limit: 400 g/L)
```

### Current Data Structure

To practice collection indexing before studying object-oriented programming, the project stores related data in parallel `ArrayList` collections:

```java
ArrayList<String> productNames;
ArrayList<Double> moistureResults;
ArrayList<Double> moistureMaximumStandards;
ArrayList<Integer> densityResults;
ArrayList<Integer> densityMaximumStandards;
```

The same index position represents the same analysis across all lists.

For example, index `0` in every list contains the data associated with the first registered analysis.

> This structure is an intentional learning step. In a future refactoring, the parallel lists will be replaced by an `ArrayList<Analysis>`.

---

## Technologies and Tools

- Java
- IntelliJ IDEA
- Git
- GitHub

---

## How to Run

### 1. Clone the repository

```bash
git clone https://github.com/solanotelles/java_basics_quality_assurance.git
```

### 2. Open the project

Open the cloned folder in IntelliJ IDEA or another Java-compatible IDE.

### 3. Run the application

Open the final project class inside `src/week4/`, locate the method below, and run the class:

```java
public static void main(String[] args)
```

The application will run in the IDE console and accept numeric menu inputs.

---

## Current Limitations

- Data is stored only in memory and is lost when the program ends.
- The application runs only through the terminal.
- There is no file or database persistence.
- Related data is stored in parallel collections.
- Some invalid input scenarios may still require additional handling.
- The project does not yet use object-oriented domain classes, automated tests, or web endpoints.

These limitations reflect the concepts studied during the first month.

---

## Future Roadmap

The next stages of the learning roadmap may include:

- [ ] Refactor parallel lists into an `Analysis` class;
- [ ] Store analyses in an `ArrayList<Analysis>`;
- [ ] Improve input validation and exception handling;
- [ ] Add automated tests with JUnit;
- [ ] Add file persistence;
- [ ] Study SQL and relational databases;
- [ ] Connect the project to PostgreSQL;
- [ ] Expose the main features through a REST API using Spring Boot.

---

## Key Learning Outcomes

Through this repository, I practiced how to:

- break a problem into smaller programming tasks;
- control program flow using decisions and loops;
- organize logic into reusable methods;
- store, search, and filter data using collections;
- test boundary values in business rules;
- identify limitations in an initial implementation;
- record project development using Git and GitHub.

This repository represents an early stage of my Java Backend learning path and will serve as a reference for future refactoring and project evolution.

---

## Author

Developed by **Luiz Solano** as part of a structured career transition into Java Backend Development.

- GitHub: [@solanotelles](https://github.com/solanotelles)
- LinkedIn: Luiz Solano
