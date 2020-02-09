@Regression
Feature: DHP-52: As a clinician, the health assessment box of patients should be removed when "Enable Assessment" is toggled off, so it doesn't occupy the space unneccessarily.

  Scenario: 1a: Toggle OFF Assessment
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user toggles off Enable assessment option on settings page

  Scenario: 1b: Clinician views a patient's profile
    Given the clinician is on the patient's profile page
    When user clicks on a specific patient
    And clicks on appointments tab
    Then the assesstment table on appointments tab is hidden

  @End
  Scenario: Close web browser
