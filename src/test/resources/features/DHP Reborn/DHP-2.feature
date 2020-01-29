@Regression
Feature: DHP-2: As a User, I should be able to view the generic dropdown options for the question "What brings you here?" in the registration page.

  Scenario: 01: Registration reason dropdown
    Given the user is on registration page
    And user sees registration reason dropdown from registration page
    Then registration reason dropdown options are complete

  @End
  Scenario: Close web browser
