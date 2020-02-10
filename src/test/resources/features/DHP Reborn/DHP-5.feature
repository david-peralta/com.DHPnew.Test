@DHP5
Feature: DHP-5: As the Configuration Manager, I want to be able to change the wellness check questions for patients, so the wellness check can be personalised for the patients.

@DHP5A
  Scenario: 01: 
    #Checking of Wellness check questions

    Given the user is on wellness check tab on my info page
    When user clicks on start wellness check button
    Then complete wellness check questions are displayed
    #And user seees wellness check questions displayed
    
@DHP5B1
  Scenario: 02: Patient starts a wellness check some questions are disabled and Scenario 04: Patient starts wellness check when graph legend are renamed
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
@DHP5B2
  Scenario:  #Revert values to default
    Given the user is on configuration managers landing page
    When user clicks on settings menubar
    Then user clicks on wellness check horizontal tab
    And user reverts back values "How has your work or leisure life been?" as question and "Appetite" as graph legend for question number one

  @End
  Scenario: Close web browser
