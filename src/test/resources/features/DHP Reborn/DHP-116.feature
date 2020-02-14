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

  Scenario: 1b:  Patient starts a new Assessment page when physical activity is enabled
    Given the user is on patient landing page
    When they click on the Assessment in the left menu bar
    And click on the Start Assessment button on the right top corner of the page
    Then they are taken to the Assessment questionnaire with the following sections Needs (First page), Depression (Second page),Anxiety (Third page), Physical Activity (Fourth page)

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

  Scenario: 2b:  Patient starts a new Assessment page when physical activity is enabled
    Given the user is on patient landing page
    When they click on the Assessment in the left menu bar
    And click on the Start Assessment button on the right top corner of the page
    Then they are taken to the Assessment questionnaire with the following sections Needs (First page), Depression (Second page),Anxiety (Third page)
    And Physical Activity questionaire is hidden

  @End
  Scenario: Close web browser

  Scenario: 3a:  Toggle ON Assessment / Toggle OFF Needs / Toggle OFF Depression / Toggle OFF Anxiety / Toggle ON Physical Activity
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user toggles on Enable assessment option on settings page
    And user toggles off Enable needs option on settings page
    And user toggles off Enable depression option on settings page
    And user toggles off Enable anxiety option on settings page
    And user toggles on Enable physical activity option on settings page

  @End
  Scenario: Close web browser

  Scenario: 3b:  Patient starts a new Assessment page when only physical activity is enabled
    Given the user is on patient landing page
    When they click on the Assessment in the left menu bar
    And click on the Start Assessment button on the right top corner of the page
    Then they are taken to the Assessment page only display is Physical Activity

  @End
  Scenario: Close web browser
