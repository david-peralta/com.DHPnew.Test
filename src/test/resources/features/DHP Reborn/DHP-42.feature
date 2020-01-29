@Regression
Feature: DHP-42: As a Configuration Manager, I want to login to the DB Health Platform instance so that I can access its features and manage the settings of the DB Health Platform

  Scenario: 1: Super Admin accesses Login function
    Given the user is on home page
    When the user clicks login quick link in the footer
    Then the web browser is on "Login" page
    And elements inside the login page is complete
    And password field is masked

  Scenario: 2:  Mandatory fields not filled in
    When user clicks login button on login page
    Then feedback error message for required fields is displayed

  Scenario: 3: Email format not valid
    When user input "usernamedomain.com" as email address on login page
    Then user clicks login button on login page
    And feedback error message for invalid email address is displayed
    And the web browser is on "Login" page

  Scenario: 4: Invalid Credentials Entered
    When user input "dim@yahoo.com" as email address on login page
    Then user input "InvalidPassword" as password on login page
    And user clicks login button on login page
    And feedback error message for invalid password is displayed

  Scenario: 5: Valid Credentials Entered
    Given the user is on configuration managers landing page
    Then the web browser is on "ClinicianManagers" page
    And profile name with caret down icon is displayed on the profile menu corner
    

  @End
  Scenario: Close web browser
