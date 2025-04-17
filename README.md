


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
