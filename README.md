This project is a UI test automation framework developed using **Java**, **Selenium WebDriver**, and **Cucumber (BDD)**. It automates end-to-end testing of web applications using Gherkin syntax and the Page Object Model (POM) architecture.

Key Features
- BDD-style test automation with Cucumber
- Selenium WebDriver for UI interactions
- Modular Page Object Model (POM) structure
- Configuration and logging (log4j)
- Excel-based test data support
- Tag-based test execution (`@search`, `@login`, etc.)

Project Structure

src/test/java/
├── projectFolders/
│ ├── _projectLogs/ # Log files
│ └── _projectUtilities/ # Config, Excel, Logger classes
├── uiAutomation/
│ ├── pages/ # Page classes (POM)
│ ├── runners/ # Test runners
│ ├── step_definitions/ # Step implementations
│ └── utilities/ # WebDriver and helper methods
└── resources/
├── configuration.properties # URL, browser, timeouts, etc.
└── log4j.properties # Logging settings

Getting Started

1-Clone the repository
2-Update test configuration in configuration properties
3- Running Tests
