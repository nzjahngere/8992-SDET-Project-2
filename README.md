# 8992-SDET-Project-2

## Overview 📋

The **8992-SDET-Project-2** aims to ensure the reliability, security, and usability of key functionalities of the OrangeHRM website. The project focuses on robust testing of its key features to ensure reliability, security, and usability using both manual and automated testing techniques.

## Key Features and Technologies Used 🚀

### Features Tested:
- **User Login:** Authentication scenarios for valid and invalid credentials.
- **Forgot Password:** Password recovery functionality and email validation.
- **Session Management:** Session timeout and logout behaviors.
- **Role-Based Access Control:** Permissions testing for admin and employee roles.
- **Multi-Language Support:** Verifying login page functionality across multiple languages.
- **Responsive Design:** Compatibility and usability across various devices.
- **Performance and Compatibility Testing:** Ensuring optimal performance under different load conditions across multiple browsers and devices.

### Technologies Used:
- **Manual Testing:** Exploratory tests for user scenarios.
- **Automated Testing:** 
  - **Selenium WebDriver** for regression and cross-browser testing.
  - **Cucumber Framework with POM (Page Object Model)** for behavior-driven development (BDD).
- **Environments:**
  - **Operating Systems:** Windows 10.
  - **Browsers:** Chrome, Firefox, Edge.
  - **Devices:** Desktop, laptops, tablets, and mobiles.

## Setup Instructions 🛠️

Follow these steps to set up and run the project:

### 1. Prerequisites:
- Install **Java Development Kit (JDK)** (Version 11 or later).
- Install **Maven** for dependency management.
- Install a code editor like **IntelliJ IDEA** or **Eclipse**.
- Download and set up **Selenium WebDriver** and **Cucumber**.
- Ensure access to the OrangeHRM test site.

### 2. Repository Setup:
1. Clone the repository containing the test project.
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd <project-directory>
   ```

### 3. Install Dependencies:
Use Maven to install project dependencies:
   ```bash
   mvn clean install
   ```

### 4. Configuring Test Environment:
- Update `config.properties` with test credentials and browser settings.
- Ensure the browser drivers (e.g., ChromeDriver) are placed in the appropriate location.

### 5. Running Tests:
- For manual testing, refer to the test cases provided in the project.
- For automated tests:
   - Execute tests via Maven:
     ```bash
     mvn test
     ```
   - Generate test reports using Cucumber:
     ```bash
     mvn verify
     ```

## Deliverables 📑

- **Test Plan Document**: Detailed documentation of what, how and when to do.
- **Test Scenarios Document**: Detailed scenarios outlining the test approach.
- **Test Cases Document**: Comprehensive test cases for functional and non-functional aspects.
- **Test Execution Report**: Reports summarizing test results and defect logs.
- **Bug Reports**: Documented defects discovered during testing.

---
