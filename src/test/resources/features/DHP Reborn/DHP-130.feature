@DHP130 @RegressionDD
Feature: DHP-130: As a Clinician, I want to add a clinical note against a patient's profile, So that I can add patient commentary that is not attached to an appointment

  @DHP130A
  Scenario: 01: Clinician views a patient profile
    Given that a clinician has selected a Patient in the my patients page
    Then views the patient profile tabs

  @End
  Scenario: Close web browser

  @DHP130B
  Scenario: 02: Clinician views list of notes #Views only first row.
    Given that a clinician has selected a Patient in the my patients page
    When user clicks on patient notes tab
    Then views the most recent notes at the top

  @End
  Scenario: Close web browser

  @DHP130C
  Scenario: 03: Clinician adds a new note
    Given that a clinician has selected a Patient in the my patients page
    When then input a new note in the patient profile
    Then sees feedback success message is displayed

  @End
  Scenario: Close web browser

  @DHP130D
  Scenario: 04: Patient cancels note entry
    Given that a clinician has selected a Patient in the my patients page
    When then input a new note in the patient profile
    And clicks cancels the patient note
    Then page is redirected back to the notes list

  @End
  Scenario: Close web browser

  @DHP130E
  Scenario: 05: Mandatory field not filled in #No validation shown when field is empty

  @DHP130F
  Scenario: 06: Mandatory fields filled in
    Given that a clinician has selected a Patient in the my patients page
    When then input a new note in the patient profile
    Then sees feedback success message is displayed

  @End
  Scenario: Close web browser
