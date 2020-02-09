@DHP88 @Regression
Feature: DHP-88: As a Configuration Manager, I want to be able to change my portal password so that I can update it in case my old password is exposed.

  @DHP88A
  Scenario: 01: Configuration Manager views the Change Password Page
    Given that user logins with "Config Manager"
    When they click on user accounts
    Then the web browser is on "Change Password" page

  @End
  Scenario: Close web browser
