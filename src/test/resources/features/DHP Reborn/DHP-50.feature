@Regression
Feature: DHP-50: As a patient, I want the link to "Assessments" hidden that is present on the left menu bar when assessments are turned off in my instance.

  Scenario: 1a: Toggle OFF Assessment
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user toggles off Enable assessment option on settings page

  @End
  Scenario: Close web browser

  Scenario: 1b: Patient views the left menu bar
    Given the user is on patient landing page
    Then the link to the assessments in the left menu bar should be hidden

  @End
  Scenario: Close web browser
