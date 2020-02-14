@Regression
Feature: DHP-21: As a Configuration Manager, I want to create a Clinician Mgr for my instance so they can create the Clinicians as need

  Scenario: 01:  Super Admin views list view of Admins
    Given the user is on configuration managers landing page
    When user clicks on admin menubar
    Then columns for admins list is complete

  @End
  Scenario: Close web browser

  Scenario: 2: Super Admin Creates an Admin
    Given the web browser is on "ClinicianManagers" page
    When user clicks on create admin button
    Then the web browser is on "Clinician Manager Details" page
    And field for creating admin is complete

  @End
  Scenario: Close web browser

  #Mandatory fields will be marked with an asterisk (Not implemented)
  Scenario: 3: Mandatory fields not filled in
    Given the web browser is on "Clinician Manager Details" page
    When user clicks on create admin button inside the admin creation page
    Then user sees validations on all required fields

  @End
  Scenario: Close web browser

  Scenario: 5: Super Admin cancels with no unsaved changes
    When user clicks on cancel admin button inside the admin creation page
    Then user is redirected back to list view of Admins

  @End
  Scenario: Close web browser

  Scenario: 4: Mandatory fields filled in
    Given the web browser is on "ClinicianManagers" page
    When user creates an administrator
    Then user is redirected back to list view of Admins

  @End
  Scenario: Close web browser

  #Check if newly registered account is listed
  Scenario: 6a: Super Admin cancels with unsaved changes
    When user creates an administrator without saving
    And user clicks cancel button inside the admin creation page
    Then the browser's prompt message for unsaved changes is displayed
    #yes is clicked
    And user clicks yes on prompt message for unsaved changes
    Then user is redirected back to list view of Admins

  @End
  Scenario: Close web browser

  Scenario: 6b: Super Admin cancels with unsaved changes
    When user creates an administrator without saving
    And user clicks cancel button inside the admin creation page
    Then the browser's prompt message for unsaved changes is displayed
    #no is clicked
    And user clicks no on prompt message for unsaved changes
    Then the browser's prompt message for unsaved changes will be hidden

  @End
  Scenario: Close web browser
