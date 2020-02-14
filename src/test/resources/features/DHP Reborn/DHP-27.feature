@Regression
Feature: DHP-27: As a Configuration Manager, I want to add new Speciality options for the Treatment Info Type

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
    Then treatment speciality table is displayed

  @End
  Scenario: Close web browser

  Scenario: 3: Configuration Manager adds a new speciality item for clinician
    Given the user is on configuration managers landing page
    When user add speciality item for treatment
    Then an error message is displayed for add treatment speciality

  @End
  Scenario: Close web browser

  Scenario: 4: Configuration Manager renames a treatment speciality item
    Given the user is on configuration managers landing page
    When user edits a speciality for treatment
    Then edited treatment speciality is displayed in the table

  @End
  Scenario: Close web browser
