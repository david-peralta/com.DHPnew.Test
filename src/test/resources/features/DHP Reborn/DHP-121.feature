@DHP121 @Regression
Feature: DHP-121: As a patient, I don't want to see the needs section in the assessment when is disabled

  Scenario: Precondition - To switch Needs Assessment off
    Given the config manager is viewing the assessment settings
    When they click disable the needs assessment
    Then sees message that it is saved successfully
    And the web browser is on "Settings" page

  @DHP121A
  Scenario: 01: Patient starts a new Assessment
    Given that user logins with "Patient"
    When they click start the assessment
    Then sees that the needs section is disabled in the progress bar

  Scenario: Postcondition - To switch Needs Assessment on
    Given the config manager is viewing the assessment settings
    When they click enable the needs assessment
    Then sees message that it is saved successfully
    And the web browser is on "Settings" page

  @End
  Scenario: Close web browser
