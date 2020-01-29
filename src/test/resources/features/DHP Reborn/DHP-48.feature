@Regression
Feature: DHP-48: As a Clinician, I want the PSA tab under patients profile to be hidden if it is not active, so I don't see an unnecessary tab.

  Scenario: 1a: Clinician views a patient's profile when "Enable PSA" is toggled on for their instance
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user enables PSA toggle on info type settings page
    And user toggles on health indicator option on settings page

  Scenario: 1b:
    Given the clinician is on the patient's profile page
    When user clicks on a specific patient
    
    
    
  #Scenario: 2a: Patient views "My Info" section when "Disable PSA" is toggled on for their instance
    #Given the user is on configuration managers landing page
    #When user clicks on settings menubar
    #Then user disables PSA toggle on info type settings page
#
  #Scenario: 1b:
#
  #@End
  #Scenario: Close web browser
