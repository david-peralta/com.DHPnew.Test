@Regression
Feature: DHP-47: As a patient, I want the PSA tab to be hidden from my info section if this option is disabled for my instance.

  Scenario: 1a: Patient views "My Info" section when "Enable PSA" is toggled on for their instance
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user enables PSA toggle on info type settings page
    And user toggles on health indicator option on settings page

  Scenario: 1b: Patient checks if PSA tab is displayed
    Given the user is on wellness check tab on my info page
    Then PSA tab on my info page is displayed

  Scenario: 2a: Patient views "My Info" section when "Disable PSA" is toggled on for their instance
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user disables PSA toggle on info type settings page

  Scenario: 2b: Patient checks if PSA tab is hidden
    Given the user is on wellness check tab on my info page
    Then PSA tab on my info page is not displayed

  @End
  Scenario: Close web browser
