# Selenium_testng_restAssured
### 🚀 Overview
This is a hybrid automation framework using Java, Selenium, TestNG, REST Assured, Appium, and Maven. It supports UI, API, and Mobile automation testing.

---

### 🪰 Tech Stack
- **Java 11+**
- **Maven**
- **TestNG**
- **Selenium WebDriver**
- **REST Assured**
- **Appium**
- **Log4j2**
- **ExtentReports / Allure**
- **Docker + Jenkins**

---

### 🛠️ Installation
1. **Install Java (11 or later)**
2. **Install Maven**
3. **Install Docker and Jenkins**
4. **Clone the repo**
```bash

```
5. **Navigate to project directory**
```bash
cd test-automation-framework
```
6. **Install dependencies**
```bash
mvn clean install
```

---

### ✅ Run Tests
- Run all tests:
```bash
mvn test
```
- Run specific suite:
```bash
mvn test -DsuiteXmlFile=testng.xml
```
- Run in Docker:
```bash
docker build -t test-framework .
docker run test-framework
```

---

### 📆 Jenkins Integration
Use the provided `Jenkinsfile` to configure CI pipelines. Trigger builds on push, schedule nightly runs, and publish Allure or Extent reports.

---




# 📁 Automation Framework Folder Structure (Java + Selenium + TestNG + REST Assured + Appium + Maven)

```
project_root/

# 1. Configuration
├── config/
│   ├── config.properties               # App/environment settings like URLs, credentials
│   ├── EnvironmentManager.java         # Manages environment switching (dev, QA, prod)
│   └── ConfigReader.java               # Reads and provides access to config values

# 2. Driver Setup
├── drivers/
│   └── DriverManager.java              # Handles browser and mobile driver setup

# 3. Utilities
├── utils/
│   ├── LoggerUtil.java                 # Logging (console and file)
│   ├── WaitUtils.java                  # Explicit/smart waits
│   ├── ElementUtils.java               # Click, input, visibility checks
│   ├── AssertionUtils.java             # Hard and soft assertions
│   ├── DateTimeUtils.java              # Date and time manipulation
│   ├── RandomDataGenerator.java        # Fake/test data generation
│   ├── FileUtils.java                  # Read/write files (Excel, JSON)
│   ├── ScreenshotUtils.java            # Capture screenshots
│   ├── ExceptionHandler.java           # Centralized exception capture
│   ├── RetryAnalyzer.java              # Retry logic for flaky tests
│   └── ValidationUtils.java            # Input validators (email, range, etc.)

# 4. Test Data
├── data/
│   ├── TestData.xlsx                   # Structured Excel test data
│   ├── TestData.json                   # JSON-based test data
│   └── DataReader.java                 # Reader class for JSON/Excel

# 5. API Utilities
├── api_utils/
│   ├── ApiClient.java                  # REST methods using Rest Assured
│   ├── ApiValidator.java               # Response schema assertions
│   └── MockServerHelper.java           # Stub/mocking support

# 6. Database Utilities
├── db_utils/
│   ├── SqlConnector.java               # SQL DB (MySQL/PostgreSQL)
│   └── NoSqlConnector.java             # NoSQL (MongoDB, etc.)

# 7. Reporting
├── reports/
│   ├── ExtentReportManager.java        # Extent HTML reports
│   ├── AllureConfig.xml                # Allure report configuration
│   ├── ResultParser.java               # Parse results for readability
│   └── EmailReporter.java              # Send summary via email

# 8. CI/CD Integration
├── ci_cd/
│   ├── TestRunner.java                 # Master runner for suites
│   ├── JenkinsTrigger.java             # Jenkins/GitHub integration
│   └── Notifier.java                   # Slack/Email notifications

# 9. Tests
├── tests/
│   ├── LoginTests.java                 # Login test cases
│   └── CheckoutTests.java              # Checkout functionality tests

# 10. Page Object Model
├── pages/
│   ├── LoginPage.java                  # Login page actions/locators
│   ├── DashboardPage.java              # Dashboard actions
│   └── BasePage.java                   # Common page methods

# 11. Resources
├── resources/
│   └── locators.properties             # Element locators (CSS/XPath)

# 12. Project Files
├── testng.xml                           # TestNG suite configuration
├── pom.xml                              # Maven project descriptor
└── README.md                            # Project documentation and usage

```
