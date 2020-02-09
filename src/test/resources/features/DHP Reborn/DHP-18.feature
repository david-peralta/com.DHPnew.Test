@DHP18 @Regression
Feature: DHP-18: As a Configuration Manager, I should be able to deactivate Clinician Manager account, so that the Clinician Manager couldn't login to the portal

  @DHP18A
  Scenario: 01: Configuration Manager views an active Clinician Manager account
    Given that user logins with "Config Manager"
    When user clicks a clinicians manager
    Then sees clinician manager status

  @DHP18B1
  Scenario: 02a: Configuration Manager cancels a Clinician Manager
    Given that user logins with "Config Manager"
    When user clicks a clinicians manager
   	And user cancels on confirmation mesage
    Then sees clinician manager status
    
  @DHP18B2
  Scenario: 02b: Configuration Manager deactivates a Clinician Manager account
  	Given that user logins with "Config Manager"
    When user clicks a clinicians manager
   	And user clicks on clinician to deactivate
    Then sees clinician manager status
  	
  @DHP18C
  Scenario: 03: Configuration Manager views the status of Clinician Manager from the list view
    Given that user logins with "Config Manager"
    When user clicks a clinicians manager
    Then sees clinician manager status

  @End
  Scenario: Close web browser
