@DHP106 @Regression
Feature: DHP-106: As a Configuration Mgr, I want to activate a deactivated Clinician Mgr user account so that they can access the portal when they are back at work

  @DHP106A
  Scenario: 01: Configuration Manager views an active Clinician Manager account
    Given that user logins with "Config Manager"
    When user clicks a clinicians manager
    Then sees clinician manager status

  @DHP106B1
  Scenario: 02a: Configuration Manager cancels a Clinician Manager
    Given that user logins with "Config Manager"
    When user clicks a clinicians manager
    And user cancels on confirmation mesage
    Then sees clinician manager status

  @DHP106B2
  Scenario: 02b: Configuration Manager deactivates a Clinician Manager account
    Given that user logins with "Config Manager"
    When user clicks a clinicians manager
    And user clicks on clinician to deactivate
    Then sees clinician manager status

	#NotAutomatable
  Scenario: 03: The reactivated Clinician Manager receives a confirmation email


  @DHP106C
  Scenario: 04: Configuration Manager views the status of Clinician Manager from the list view
    Given that user logins with "Config Manager"
    When user clicks a clinicians manager
    Then sees clinician manager status

  @End
  Scenario: Close web browser
