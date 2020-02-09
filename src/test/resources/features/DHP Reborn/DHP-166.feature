@DHP166 @Regression
Feature: DHP-166: As a Clinician Manager, I want to be able to search for a Clinician so that I can efficiently manage their details.

  @DHP166A
  Scenario: 01: Clinician Manager accesses the Search function
    Given that user logins with "Clinician Manager"
    Then sees the screen elements displayed

  @DHP166B
  Scenario: 02: Clinician Manager searches for a Clinician and at least 1 record found
    Given that user logins with "Clinician Manager"
    When user inputs a clinician to the search field
    Then check results of records found

  @DHP166C
  Scenario: 03: Clinician Manager applies a search with no records found
    Given that user logins with "Clinician Manager"
    When user inputs an empty clinician to the search field
    Then checks result of no records found

  @DHP166D
  Scenario: 04: Clinician Manager resets Search
    Given that user logins with "Clinician Manager"
    When user inputs a clinician to the search field
    And they click on reset on search field
    Then the web browser is on "Clinicians" page

	@DHP166E
  Scenario: 05: Clinician Manager presses reset before applying a search
    Given that user logins with "Clinician Manager"
    When they click on reset on search field
    Then the web browser is on "Clinicians" page

  @End
  Scenario: Close web browser
