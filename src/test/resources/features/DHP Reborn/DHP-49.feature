@Regression
Feature: DHP-49: As a patient, I want the dropdown option 'PSA' hidden under 'my info < add info' if it is toggled off, so I don't see an unnecessary option in the dropdown.

  Scenario: 1a: Toggle ON PSA
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user enables PSA toggle on info type settings page
    And user toggles on health indicator option on settings page

  Scenario: 1b: Patient adds an info type under their timeline when "Enable PSA" is toggled on for their instance
    Given the user is on patient landing page
    When user clicks on add info button on my info page
    Then info type dropdown options are complete

  Scenario: 2a: Toggle OFF PSA
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user disables PSA toggle on info type settings page

  Scenario: 2b: Clinician views a patient's profile  when "Enable PSA" is toggled off for their instance
    Given the user is on patient landing page
    When user clicks on add info button on my info page
    Then PSA menu on info type dropdown is hidden

  @End
  Scenario: Close web browser
