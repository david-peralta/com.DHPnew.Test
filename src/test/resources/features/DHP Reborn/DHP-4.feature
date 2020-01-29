@Regression
Feature: DHP-4: As a Configuration Manager, I want to be able to disable the Health indicator option for my instance, so that when it's not needed it can be hidden.

  Scenario: 01: Configuration Manager view the available setting options
    Given the user is on configuration managers landing page
    Then user clicks on settings menubar
    When user checks if general horizontal tab is set to default
    And horizontal tabs on settings page is complete

  Scenario: 02: Configuration Manager views the General tab
    And user sees health indicator option

  Scenario: 03: Configuration Manager disables "Health indicator"
    When user toggles off health indicator option on settings page

  @End
  Scenario: Close web browser
