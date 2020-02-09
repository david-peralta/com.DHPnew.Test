@Regression
Feature: DHP-113: As a clinician, I don't want to see the details of assessment - anxiety inside a patient profile when it's turned off, so space can be used efficiently.

  Scenario: 1a:  Toggle ON Assessment / Toggle ON Anxiety / Toggle ON Physical Activity
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user toggles on Enable assessment option on settings page
    And user toggles on Enable anxiety option on settings page
    And user toggles on Enable physical activity option on settings page

  Scenario: 1b: Clinician views Assessment inside a patient’s profile when Anxiety = On
    Given the clinician is on the patient's profile page
    When user clicks on a specific patient
    And clicks on appointments tab
    Then inside the Assessment Results box, they see assessment results for anxiety and physical activity

  Scenario: 2a:  Toggle ON Assessment / Toggle OFF Anxiety / Toggle OFF Physical Activity
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user toggles on Enable assessment option on settings page
    And user toggles off Enable anxiety option on settings page
    And user toggles off Enable physical activity option on settings page

  Scenario: 2b: Clinician views Assessment inside a patient’s profile when Anxiety = OFF
    Given the clinician is on the patient's profile page
    When user clicks on a specific patient
    And clicks on appointments tab
    Then inside the Assessment Results box, they don't see assessment results for anxiety and physical activity

  @End
  Scenario: Close web browser
