@DHP32 @Regression
Feature: DHP-32: As a Configuration Manager, I should be able to deactivate Clinician Manager account, so that the Clinician Manager couldn't login to the portal

  @DHP32A
  Scenario: 01: Configuration Mgr. view the available setting options
    Given the config manager is on the configuration setting page
    Then user checks if horizontal tabs on settings page is complete

  @DHP32B1 
  Scenario: 02: Configuration Mgr. disable the video conference for appointments
    Given the config manager is on the configuration setting page
    When user disables the video conferencing option
    Then sees button video conferencing option status
    
  @DHP32B2 
  Scenario: 03: Configuration Mgr. enables the video conference for appointments
    Given the config manager is on the configuration setting page
    When user enables the video conferencing option
    Then sees button video conferencing option status

  @DHP32C
  Scenario: 04: Configuration Mgr. clicks on save without changing anything
    Given the config manager is on the configuration setting page
    When user clicks on save without making any changes
    Then sees message that it is saved successfully

  @DHP32D1
  Scenario: 05a: Configuration Mgr. clicks on cancel after making some changes
    Given the config manager is on the configuration setting page
    When user switches videoconferencing option
		And user clicks on confirm unsaved changes
    Then the web browser is on "ClinicianManagers" page
	
	@DHP32D2
	Scenario: 05b: Configuration Mgr. clicks on cancel after making some changes
    Given the config manager is on the configuration setting page
    When user switches videoconferencing option
		And user clicks on cancel on unsaved changes
		Then the web browser is on "Settings" page

  @DHP32E
  Scenario: 06: Configuration Mgr. clicks on cancel with no unsaved changes
    Given the config manager is on the configuration setting page
		When user clicks on cancel with no changes
    Then the web browser is on "Settings" page
 
  @End
  Scenario: Close web browser
