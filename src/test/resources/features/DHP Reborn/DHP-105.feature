@DHP105 @Regression
Feature: DHP-105: As a Clinician Manager, I should not be able to log in to the portal after my profile is deactivated, so I know the access has been restricted.

  Scenario: Precondition to deactivate user
    Given that user logins with "Config Manager"
    When user clicks a clinicians manager
    And user clicks on clinician to deactivate
    Then sees clinician manager status

  #Page does not redirect to deactivation page on deactivated user
  #Only when it has changed credentials
  @End
  Scenario: Close web browser

  @DHP105A
  Scenario: 01: An inactive (deactivated) Clinician Manager tries to log in
    Given the user has logged in with deactivated user
    Then checks that the user has been deactivated

  @End
  Scenario: Close web browser

  Scenario: Postcondition to Activate user
    Given that user logins with "Config Manager"
    When user clicks a clinicians manager
    And user clicks on clinician to activate
    Then sees clinician manager status

  @End
  Scenario: Close web browser
