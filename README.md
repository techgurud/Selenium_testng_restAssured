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
git clone https://github.com/yourusername/test-automation-framework.git
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
project-root/
├── pom.xml                          # Maven project file (manages dependencies and build)
├── README.md                        # Project documentation and setup instructions
├── testng.xml                       # TestNG suite configuration
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/yourcompany/framework/
│   │           ├── base/               # Base classes for driver, API, mobile
│   │           │   ├── BaseTest.java
│   │           │   ├── BaseAPI.java
│   │           │   └── BaseMobile.java
│   │           ├── config/             # Config readers, property loaders
│   │           │   └── ConfigManager.java
│   │           ├── drivers/            # WebDriver and AppiumDriver factory
│   │           │   ├── DriverFactory.java
│   │           │   └── MobileDriverFactory.java
│   │           ├── utils/              # Utility classes
│   │           │   ├── ExcelUtils.java
│   │           │   ├── WaitUtils.java
│   │           │   ├── LoggerUtils.java
│   │           │   └── ScreenshotUtils.java
│   │           ├── api/                # API utilities and clients
│   │           │   ├── RestClient.java
│   │           │   └── ApiUtils.java
│   │           └── mobile/             # Appium mobile actions
│   │               └── MobileActions.java
│   │
│   └── test/
│       └── java/
│           └── com/yourcompany/tests/
│               ├── web/
│               │   ├── LoginTest.java
│               │   └── CheckoutTest.java
│               ├── api/
│               │   └── UserApiTest.java
│               └── mobile/
│                   └── AppLoginTest.java
│
├── resources/
│   ├── testdata/
│   │   ├── testdata.xlsx
│   │   └── testdata.json
│   ├── config.properties
│   ├── locators.yaml
│   └── log4j2.xml
│
└── reports/
    ├── test-output/                  # TestNG report
    ├── extent-report/                # Extent or Allure reports
    └── logs/                         # Execution logs
```
