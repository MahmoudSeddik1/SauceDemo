# SauceDemo Maven Project

This Maven project is an automated test suite for testing the website "SauceDemo". The project is written in Java and uses the Selenium WebDriver and TestNG frameworks.

# Getting Started

# Prerequisites

Java 8 or higher installed on your machine
Maven installed on your machine
# Installing
Clone the repository to your local machine.
    
# Build the project using the command:
    
mvn clean install
    
# Running the Tests
To run the test suite, use the following command:


mvn test
This will run all the tests in the project and generate a report with the results.
Or you can run them from the IDE 

# Project Structure
The project is structured as follows:


    
src/main/java
    ├── pages
        -LoginPage
        -StartPage
        -...
    
  
  
    
src/test/java
    ├── tests
        -LoginTests
        -CheckoutTests
        -...

    
pom.xml
src/main/java: This directory contains the source code for the project.
pages: This directory contains the page objects for the website pages.
utils: This directory contains utility classes for the project.
src/test/java: This directory contains the test code for the project.
tests: This directory contains the test classes for the project.
pom.xml: This is the project's Maven configuration file.
    
# Test Suite
    
The test suite is designed to test the following functionality of the "SauceDemo" website:

Login
Shopping cart
Contributing
If you want to contribute to this project, feel free to create a pull request or submit an issue.

