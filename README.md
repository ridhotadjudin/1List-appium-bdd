<!-- 1List Appium BDD -->
<div align="center">

# 📱 1List Appium BDD

**Automated Mobile Testing for the 1List Todo App using Appium, Cucumber BDD & TestNG**

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Appium](https://img.shields.io/badge/Appium-8.1.1-6C3FD1?style=flat-square&logo=appium&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white)
![Cucumber](https://img.shields.io/badge/Cucumber-7.3.4-23D96C?style=flat-square&logo=cucumber&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-7.6.0-FF7300?style=flat-square&logo=testng&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)

</div>

---

An end-to-end mobile test automation framework built with **Java**, **Appium**, and **Cucumber BDD** for testing the **1List** todo application on Android. The framework follows the Page Object Model design pattern, uses Gherkin syntax for readable test scenarios, and generates rich HTML reports with ExtentReports.

---

## 📑 Table of Contents

- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Project Structure](#-project-structure)
- [Prerequisites](#-prerequisites)
- [Getting Started](#-getting-started)
- [Test Scenarios](#-test-scenarios)
- [Design Patterns](#-design-patterns)
- [Reports](#-reports)
- [Author](#-author)

---

## ✨ Features

- **BDD with Cucumber** — Human-readable Gherkin feature files for clear test documentation
- **Page Object Model** — Clean separation between test logic and page interactions
- **Data-Driven Testing** — External test data managed via Excel spreadsheets
- **Rich HTML Reports** — Detailed test execution reports powered by ExtentReports
- **Screenshot Capture** — Automatic screenshots on test steps for visual verification
- **Android Real Device & Emulator** — Run tests on physical devices or Android emulators
- **TestNG Integration** — Flexible test suite configuration and parallel execution support
- **Maven Build** — Dependency management and build lifecycle handled by Maven

---

## 🛠 Tech Stack

| Technology | Version | Purpose |
|---|---|---|
| Java | 8+ | Programming language |
| Maven | 3.x | Build & dependency management |
| Appium Java Client | 8.1.1 | Mobile automation library |
| Appium Server | 2.x | Mobile automation server |
| TestNG | 7.6.0 | Test execution framework |
| Cucumber Java | 7.3.4 | BDD framework |
| Cucumber TestNG | 7.3.4 | Cucumber–TestNG integration |
| ExtentReports | 4.0.9 | HTML test reporting |
| Apache POI | 5.x | Excel data reading |
| Selenium | 4.x | WebDriver support |

---

## 📁 Project Structure

```
1List-appium-bdd/
├── pom.xml
├── OneListSuite.xml
├── RidhoTestCase_Exam4.xlsx
├── screenshotOneList/
│   └── *.png
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── nexsoft/
│   │               ├── pages/
│   │               │   ├── BasePage.java
│   │               │   ├── HomePage.java
│   │               │   ├── AddItemPage.java
│   │               │   └── EditItemPage.java
│   │               ├── utils/
│   │               │   ├── DriverManager.java
│   │               │   ├── ExcelReader.java
│   │               │   └── ScreenshotUtil.java
│   │               └── config/
│   │                   └── AppConfig.java
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── nexsoft/
│       │           ├── runner/
│       │           │   └── TestRunner.java
│       │           └── stepdefinitions/
│       │               ├── Hooks.java
│       │               ├── AddItemSteps.java
│       │               ├── EditItemSteps.java
│       │               ├── DeleteItemSteps.java
│       │               └── MarkCompleteSteps.java
│       └── resources/
│           └── features/
│               ├── add_item.feature
│               ├── edit_item.feature
│               ├── delete_item.feature
│               └── mark_complete.feature
└── test-output/
    └── ExtentReport.html
```

---

## 📋 Prerequisites

Ensure the following are installed and configured before running the tests:

| Requirement | Details |
|---|---|
| **Java JDK** | Version 8 or higher — `java -version` |
| **Maven** | Version 3.x — `mvn -version` |
| **Node.js** | Required for Appium Server — `node -v` |
| **Appium Server** | Install via `npm install -g appium` |
| **Android SDK** | With platform-tools and build-tools configured |
| **ANDROID_HOME** | Environment variable pointing to your Android SDK |
| **JAVA_HOME** | Environment variable pointing to your JDK installation |

**Device Setup:**
- Enable **Developer Options** and **USB Debugging** on your Android device, or
- Create and start an **Android Emulator** via Android Studio AVD Manager

Verify Appium readiness:
```bash
appium driver install uiautomator2
appium
```

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/ridhotadjudin/1List-appium-bdd.git
cd 1List-appium-bdd
```

### 2. Install Dependencies

```bash
mvn clean install -DskipTests
```

### 3. Start the Appium Server

```bash
appium --address 127.0.0.1 --port 4723
```

### 4. Connect a Device or Start an Emulator

Confirm the device is detected:
```bash
adb devices
```

### 5. Run the Test Suite

Execute all tests using the TestNG suite file:
```bash
mvn test -DsuiteXmlFile=OneListSuite.xml
```

Or run via Maven Cucumber defaults:
```bash
mvn clean test
```

### 6. View Reports

After execution, open the generated report:
```
test-output/ExtentReport.html
```

Screenshots are saved to the `screenshotOneList/` directory.

---

## 🧪 Test Scenarios

The following scenarios are automated for the **1List** todo application:

| # | Scenario | Feature File | Description |
|---|---|---|---|
| 1 | Add a new todo item | `add_item.feature` | Create a new task with a title and verify it appears in the list |
| 2 | Add item with empty title | `add_item.feature` | Validate error handling when adding an item without a title |
| 3 | Add multiple items | `add_item.feature` | Add several items sequentially and verify all are listed |
| 4 | Edit an existing item | `edit_item.feature` | Modify the title of an existing task and confirm the update |
| 5 | Edit item with empty title | `edit_item.feature` | Validate behavior when editing an item to have a blank title |
| 6 | Delete a single item | `delete_item.feature` | Remove a task from the list and verify it no longer exists |
| 7 | Delete multiple items | `delete_item.feature` | Bulk-delete several tasks and validate the list is updated |
| 8 | Mark item as complete | `mark_complete.feature` | Check off a task and verify it is marked as completed |
| 9 | Unmark a completed item | `mark_complete.feature` | Uncheck a completed task and verify it returns to active |
| 10 | Verify item persistence | `add_item.feature` | Close and reopen the app to verify saved items persist |

Test data for each scenario is maintained in `RidhoTestCase_Exam4.xlsx`.

---

## 🏗 Design Patterns

### Page Object Model (POM)

Each screen of the 1List app is represented by a dedicated page class under `com.nexsoft.pages`. Page classes encapsulate element locators and interaction methods, keeping test logic clean and maintainable.

```
BasePage          ← Common actions (tap, swipe, wait)
  ├── HomePage        ← Todo list interactions
  ├── AddItemPage     ← New item form interactions
  └── EditItemPage    ← Edit item form interactions
```

### Behavior-Driven Development (BDD)

Cucumber Gherkin feature files define test scenarios in plain English:

```gherkin
Feature: Add a new todo item

  Scenario: Successfully add a todo item
    Given the user is on the home screen
    When the user taps the add button
    And the user enters "Buy groceries" as the item title
    And the user saves the item
    Then "Buy groceries" should appear in the todo list
```

### Data-Driven Testing with Excel

Test data is externalized in `RidhoTestCase_Exam4.xlsx` and read at runtime using Apache POI. This allows testers to manage and extend test data without modifying code.

```java
ExcelReader reader = new ExcelReader("RidhoTestCase_Exam4.xlsx");
String itemTitle = reader.getCellData("AddItem", "Title", rowNumber);
```

---

## 📊 Reports

The framework uses **ExtentReports 4.0.9** to generate comprehensive HTML reports after each test run.

**Report features include:**
- Test pass/fail/skip status with duration
- Step-by-step execution details
- Embedded screenshots for visual verification
- Category and author tagging
- Interactive charts and filters

**Report location:** `test-output/ExtentReport.html`

**Screenshots location:** `screenshotOneList/`

<div align="center">

| Report Element | Description |
|---|---|
| Dashboard | Overall pass/fail summary with pie charts |
| Test Details | Step-level breakdown of each scenario |
| Screenshots | Captured on each step or on failure |
| Categories | Tests grouped by feature tags |

</div>

---

## 👤 Author

**Ridho Tadjudin**

- 🌐 Website: [ridhotadjudin.id](https://ridhotadjudin.id)
- 💻 GitHub: [@ridhotadjudin](https://github.com/ridhotadjudin)

---

<div align="center">

⭐ Star this repository if you find it useful!

---

## 📄 License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.

---

</div>

