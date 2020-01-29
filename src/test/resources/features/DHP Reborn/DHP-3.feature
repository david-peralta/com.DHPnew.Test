@Regression
Feature: DHP-3: As a Patient, I want to see the updated enabled info types in the dropdown when adding info in my timeline so that I am informed about what information is required by the clinicians

  Scenario: 01: Login with Admin Rights
    Given the user is on patient landing page
    When user clicks on add info button on my info page
    And user sees info type dropdown from my info page
    Then info type dropdown options are complete

  @End
  Scenario: Close web browser
