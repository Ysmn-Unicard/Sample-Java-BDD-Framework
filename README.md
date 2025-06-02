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

Create a Feature File
A .feature file is created under the features directory.
Test scenarios are written in Gherkin syntax to define the behavior of the new feature.

Create a Page Class
A new Java class(page) is created for the corresponding web page (e.g., LoginPage.java).
All relevant WebElements and page-specific methods are defined and stored in this class.
This Page class must extend BasePage, which provides access to shared functionality and initialization logic.

BasePage and Page Initialization
All Page classes extend the BasePage, which itself extends PageInitializer.
PageInitializer is responsible for creating object of each Page class.
Thanks to this setup, Step Definitions do not need to instantiate pages manually.
You can access any page class directly by name (e.g., loginPage.enterCredentials()).

Step Definitions
All Step Definition classes also extend BasePage.
This gives them direct access to every Page Object via the names initialized in PageInitializer.

Utility Methods
Utility functions (e.g., waits, element actions, JavaScript executions) are defined as static methods.
These methods can be called from anywhere in the framework without class instantiation (e.g., clickElement(element)).

 Running Tests
  A-Open any .feature file
    Right-click inside a scenario
    Select Run Scenario
  B-Open CukesRunner.java under runners/
    Right-click the file and select Run 'CukesRunner
  C-From Terminal using Maven
    mvn clean install
  D-From Terminal by Tag
    mvn test -Dcucumber.filter.tags="@ebay"
