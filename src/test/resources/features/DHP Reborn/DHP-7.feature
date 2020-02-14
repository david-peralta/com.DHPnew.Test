@Regression
Feature: DHP-7: As a Configuration Manger, I want to be able to add new speciality item for clinician, so I can classify the clinicians based on their expertise.

  Scenario: 1: Configuration Manager views the available setting options
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then horizontal menu is displayed

  #General
  #Speciality
  #Wellness Check
  @End
  Scenario: Close web browser

  Scenario: 2: Configuration Manager views the ‘Speciality List’ tab
    Given the user is on configuration managers landing page
    When user navigate to Speciality List page
    Then speciality table is displayed

  @End
  Scenario: Close web browser

  Scenario: 3: Configuration Manager adds a new speciality item for clinician
    Given the user is on configuration managers landing page
    When user add speciality item for clinician
    Then an error message is displayed

  @End
  Scenario: Close web browser

  Scenario: 4: Configuration Manager renames a speciality item
    Given the user is on configuration managers landing page
    When user edits an speciality for clinician
    Then edited speciality is displayed in the table

  @End
  Scenario: Close web browser
