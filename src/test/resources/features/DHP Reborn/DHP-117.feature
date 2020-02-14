@Regression
Feature: DHP-116: As a patient, I don't want to see 'Physical Activity' section in the assessment if it not related to my condition, so I don't have to unnecessarily complete physical activity assessment.

  Scenario: 1a:  Toggle ON Assessment / Toggle ON Needs / Toggle ON Depression / Toggle ON Anxiety / Toggle ON Physical Activity
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user toggles on Enable assessment option on settings page
    And user toggles on Enable needs option on settings page
    And user toggles on Enable depression option on settings page
    And user toggles on Enable anxiety option on settings page
    And user toggles on Enable physical activity option on settings page

  @End
  Scenario: Close web browser

  Scenario: 1b: Clinician views Assessment inside a patient’s profile when physical activity = On
    Given the clinician is on patients profile page
    When user clicks on a specific patient
    And clicks on appointments tab
    Then inside the Assessment Results box, they see assessment results of the most recent assessment completed by that patient

  @End
  Scenario: Close web browser

  Scenario: 2a:  Toggle ON Assessment / Toggle ON Needs / Toggle ON Depression / Toggle ON Anxiety / Toggle OFF Physical Activity
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user toggles on Enable assessment option on settings page
    And user toggles on Enable needs option on settings page
    And user toggles on Enable depression option on settings page
    And user toggles on Enable anxiety option on settings page
    And user toggles off Enable physical activity option on settings page

  @End
  Scenario: Close web browser

  Scenario: 2b: Clinician views Assessment inside a patient’s profile when physical activity = OFF
    Given the clinician is on patients profile page
    When user clicks on a specific patient
    And clicks on appointments tab
    Then inside the Assessment Results box, they see assessment results without physical activity table of the most recent assessment completed by that patient

  @End
  Scenario: Close web browser
