@RegressionD
Feature: DHP-20: As a Configuration Manager, I want to edit Clinician Manager details

  Scenario: 1:  Configuration Manager views the list view of Clinician Manager
    Given the user is on configuration managers landing page
    When user clicks on admin menubar
    Then user is redirected back to list view of Admins

  Scenario: 2:  Configuration Manager edits an Clinician Manager profile
    Given the user is on configuration managers landing page
    And user clicks on admin menubar
    When they click on the last name of Clinician Manager that they want to edit
    Then they will be taken to the EDIT Clinician Manager page with First name, Last name, email fields
    
    
    ############## DI PA TAPOSSSS!!! ########################

  @End
  Scenario: Close web browser
