@Regression
Feature: DHP-10: As a Clinician Manager/Patient, I want to see the word 'Users' as 'Clinicians' in the portal, so that it can generic and doesn't create any confusion.

  Scenario: 1: Clinician Manager sees the menu bar

  Scenario: 2: Clinician Manager is on the list view of clinicians
    Given the clinicians manager is on clinicians page
    When user is in the clinicians page
    Then the following menu is displayed

  #1. Cinicians
  #2. Resources
  #3. Settings (removed)
  #4. Logout
  
  @End
  Scenario: Close web browser

  @Regression
  Scenario: 3: Patient requests an appointment
    Given the user is on patient landing page
    When user clicks on request appointment
    Then changes on request appointment page was displayed

  @End
  Scenario: Close web browser
