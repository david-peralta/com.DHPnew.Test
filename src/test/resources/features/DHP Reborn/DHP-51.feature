@RegressionD
Feature: DHP-51: As a patient, I want my request appointment success popup with no "Start Assessment" when "Assessment" is disabled
	
	Scenario: 1a: Configuration manager toggles off assessment in the general settings page
  Given the user is on configuration managers landing page
  When user clicks on settings menubar
  And user disable assessment in the general settings page
  Then assessment settings was disabled

	Scenario: 1b: Patient views the request appointment success pop up”
  Given the user is on patient landing page
  When user request an appointment and assessment was disabled by the configuration manager
  Then start assessment button in the request popup is not displayed
  And clicking on the close button will close the request popup