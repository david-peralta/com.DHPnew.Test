@DHP15 @RegressionDave
Feature: DHP-15: As a Configuration Manager, I should be able to deactivate Clinician Manager account, so that the Clinician Manager couldn't login to the portal

  @DHP15A
  Scenario: 01: Patient see the organisation log
    Given that user logins with "Patient"
    Then checks the logo if it is displayed

  @End
  Scenario: Close web browser

  @DHP15B
  Scenario: 02: Patient see the organisation detail
    Given that user logins with "Patient"
    When user clicks on Contact Us
    Then sees the organisation details displayed on the page footer

  @End
  Scenario: Close web browser
