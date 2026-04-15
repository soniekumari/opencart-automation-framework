# OpenCart Automation Framework

## Project Description

This project is an End-to-End Test Automation Framework developed for the OpenCart application. The framework is built using Selenium WebDriver with Java and TestNG, following the Page Object Model (POM) design pattern.

It is designed to automate UI and functional test scenarios with reusable components, proper structure, and scalability. The framework also supports CI/CD integration using Jenkins and generates detailed test execution reports.

---

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* Extent Reports
* Jenkins (CI/CD)

---

## Project Structure

### src/main/java

│── pageObjects      → Page Object classes

│── utilities        → Reusable utility classes

### src/test/java

│── testCases        → Test classes

│── testBase         → Base setup (driver initialization)

### src/test/resources

│── config.properties → Configuration settings

testng.xml → Test suite configuration

pom.xml → Maven dependencies

---

## Features

* Page Object Model (POM) design pattern implementation
* Reusable and maintainable test scripts
* Cross-browser testing support
* Test execution using TestNG
* Screenshot capture on test failure
* **Extent Reports integration for detailed HTML reporting**
* Logging support for debugging
* Easy integration with CI/CD tools like Jenkins

---

## Reporting

The framework uses **Extent Reports** to generate interactive HTML reports.

* Displays pass/fail/skip status of test cases
* Includes screenshots for failed test cases
* Provides step-by-step execution details

---

## Run the Project

### 1. Clone the repository

git clone <your-repository-url>

### 2. Open in IDE

Import the project into IntelliJ IDEA or Eclipse as a Maven project.

### 3. Install dependencies

mvn clean install

### 4. Run tests

mvn test

OR run using testng.xml file

---

## CI/CD Integration

This framework can be integrated with Jenkins for:

* Scheduled execution (nightly runs)
* Trigger execution on code commit
* Continuous testing and reporting

