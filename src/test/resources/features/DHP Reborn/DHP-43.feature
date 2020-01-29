@Regression
Feature: DHP-43: As a Configuration Manager, I want to log out of DB Health Platform so that no one else can access my account once I've finished using it

  Scenario: 1a: Configuration Manager logs out of portal
  #  'Logout' function from the left menu 
    Given the user is on configuration managers landing page
    When user logsout the configuration managers page without closing the browser
    And the web browser is on "Home" page
  @End
  Scenario: Close web browser

  Scenario: 1b: Configuration Manager logs out of portal
  #  'Logout' function from the left menu 
    Given the user is on configuration managers landing page
    When user logsout the configuration managers page using profile menu without closing the browser
    And the web browser is on "Home" page
  @End
  Scenario: Close web browser
