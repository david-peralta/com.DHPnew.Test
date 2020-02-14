@Regression
Feature: DHP-29: As a patient, I want to see the personalised wellness check in my profile as set up by the Configuration Manager

  Scenario: 01: Patient starts a wellness check when all questions are enabled
    #Enable all wellness check
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user clicks on wellness check horizontal tab
    And user clicks on select all checkbox inside the wellness check horizontal tab
    And user logsout the configuration managers page
    #Checking of Wellness check questions
    Given the user is on wellness check tab on my info page
    When user clicks on start wellness check button
    Then complete wellness check questions are displayed

  @End
  Scenario: Close web browser

  Scenario: 02: Patient starts a wellness check some questions are disabled
    #Disable Question1
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user clicks on wellness check horizontal tab
    And user disables question number one on wellness check
    And user logsout the configuration managers page
    #Checking of Wellness check questions
    Given the user is on wellness check tab on my info page
    When user clicks on start wellness check button
    Then wellness check question one is not displayed

  @End
  Scenario: Close web browser

  Scenario: 03: Patient starts a wellness check some questions are disabled and Scenario 04: Patient starts wellness check when graph legend are renamed
    #Update Question1 (Question and Graph legend is updated)
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user clicks on wellness check horizontal tab
    And user inputs "Edited question one" as question and "Edited graph legend one" as graph legend for question number one
    And user clicks on select all checkbox inside the wellness check horizontal tab
    And user logsout the configuration managers page
    #Checking of Wellness check questions
    Given the user is on wellness check tab on my info page
    When graph legend for question number one on wellness check is successfully updated
    Then user clicks on start wellness check button
    And question number one on wellness check is successfully updated

  @End
  Scenario: Close web browser

  Scenario: 03:  #Revert values to default
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user clicks on wellness check horizontal tab
    And user reverts back values "How has your work or leisure life been?" as question and "Appetite" as graph legend for question number one
    And user logsout the configuration managers page

  @End
  Scenario: Close web browser

  Scenario: 05: Patient view wellness check graph (Will not automate due to graph checking)
