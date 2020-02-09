@Regression
Feature: DHP-112: As a patient, I don't want to see 'Anxiety' section in the assessment if it not related to my condition, so I don't have to unnecessarily complete anxiety assessment.

  Scenario: 1a:  Toggle ON Assessment / Toggle ON Anxiety
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user toggles on Enable assessment option on settings page
    And user toggles on Enable anxiety option on settings page

  Scenario: 1b:  Patient starts a new Assessment page when Anxiety is enabled
    Given the user is on patient landing page
    When they click on the Assessment in the left menu bar
    #Then anxiety radio button on assessment page is displayed
    And click on the Start Assessment button on the right top corner of the page
    Then they are taken to the Assessment questionnaire page with the anxiety progress bar
    
    Scenario: 2a:  Toggle ON Assessment / Toggle OFF Anxiety
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user toggles on Enable assessment option on settings page
    And user toggles off Enable anxiety option on settings page

  Scenario: 2b:  Patient starts a new Assessment page when Anxiety is enabled
    Given the user is on patient landing page
    When they click on the Assessment in the left menu bar
    #Then anxiety radio button on assessment page is displayed
    And click on the Start Assessment button on the right top corner of the page
    Then they are taken to the Assessment questionnaire page with the anxiety progress bar hidden

  @End
  Scenario: Close web browser
