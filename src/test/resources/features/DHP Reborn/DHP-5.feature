
Feature: DHP-5: As the Configuration Manager, I want to be able to change the wellness check questions for patients, so the wellness check can be personalised for the patients.

  Scenario: 01: Configuration Manager view the available setting options
    Given a web browser is launched
    When user clicks login button on homepage
    Then the web browser is on "Login" page
    When the user logs in with "Config Manager" credentials
    When user clicks on settings menubar
    Then user checks if horizontal tabs on settings page is complete
    When user clicks on wellness check horizontal tab
    Then checks wellness columns displayed
    And checks select all is checked by default
    #And user seees wellness check questions displayed
    
@DHP5
  Scenario: 02: Configuration Manager rename the wellness check questions
    Given a web browser is launched
    When user clicks login button on homepage
    Then the web browser is on "Login" page
    When the user logs in with "Config Manager" credentials
    When user clicks on settings menubar
    Then the web browser is on "Settings" page
    When user clicks on wellness check horizontal tab
		Then user renames to "NewQuestion1" in wellness check
		#NoRevertOnMe
		#And user reverts to "" in wellness check

  @End
  Scenario: Close web browser
