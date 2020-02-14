@RegressionD
Feature: DHP-20: As a Configuration Manager, I want to edit Clinician Manager details

  Scenario: 1:  Configuration Manager views the list view of Clinician Manager
    Given the user is on configuration managers landing page
    When user clicks on admin menubar
    Then user is redirected back to list view of Admins

  @End
  Scenario: Close web browser

  Scenario: 2:  Configuration Manager edits an Clinician Manager profile
    Given the user is on configuration managers landing page
    And user clicks on admin menubar
    When they click on the last name of Clinician Manager that they want to edit
    Then they will be taken to the edit Clinician Manager page with First name, Last name, email fields

  @End
  Scenario: Close web browser

  Scenario: 3:  Configuration Manager edits an Clinician Manager profile
    Given the user is on configuration managers landing page
    And user clicks on admin menubar
    When they click on the last name of Clinician Manager that they want to edit
    And clear the mandatory field before updating
    #Then the empty mandatory fields are highlighted in red colour
    And the following feedback error message is displayed for each mandatory field not filled in

  @End
  Scenario: Close web browser

  Scenario: 4:   Configuration Manager saves without making any changes
    Given the user is on configuration managers landing page
    And user clicks on admin menubar
    When they click on the last name of Clinician Manager that they want to edit
    And they save the details without making any changes
    Then following feedback success message Saved Successfully is displayed
    Then user is redirected back to list view of Admins

  @End
  Scenario: Close web browser

  Scenario: 5: Configuration Manager cancels with no unsaved changes
    Given the user is on configuration managers landing page
    And user clicks on admin menubar
    When they click on the last name of Clinician Manager that they want to edit
    And they click on the 'Cancel' option without making any changes
    Then user is redirected back to list view of Admins

  @End
  Scenario: Close web browser

  Scenario: 5: Configuration Manager cancels with no unsaved changes
    Given the user is on configuration managers landing page
    And user clicks on admin menubar
    When they click on the last name of Clinician Manager that they want to edit
    And they click on the 'Cancel' option with  unsaved changes
    Then the browser's prompt message is displayed stating "There are unsaved changes on this page. Do you wish to proceed?"
    When user clicks no on prompt message for unsaved changes
    Then the browser's prompt message for unsaved changes will be hidden
    When they click on the 'Cancel' option with  unsaved changes
    And user clicks yes on prompt message for unsaved changes
    Then user is redirected back to list view of Admins

  @End
  Scenario: Close web browser
