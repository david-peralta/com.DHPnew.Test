@Regression
Feature: DHP-5: As the Configuration Manager, I want to be able to change the wellness check questions for patients, so the wellness check can be personalised for the patients.

  @DHP5A
  Scenario: 01: Configuration Manager view the available setting options
    #Checking of Wellness check questions
    Given the config manager is on the configuration setting page
    Then user checks if horizontal tabs on settings page is complete

  @End
  Scenario: Close web browser

  @DHP5B1
  Scenario: 02: Configuration Manager rename the wellness check questions
    #Update Question1 (Question and Graph legend is updated)
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user clicks on wellness check horizontal tab
    And user inputs "Edited question one" as question and "Edited graph legend one" as graph legend for question number one
    And user clicks on select all checkbox inside the wellness check horizontal tab
    And user logsout the configuration managers page

  @End
  Scenario: Close web browser

  @DHP5B2
  Scenario: #Revert values to default
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user clicks on wellness check horizontal tab
    And user reverts back values "How has your work or leisure life been?" as question and "Appetite" as graph legend for question number one

  @End
  Scenario: Close web browser
