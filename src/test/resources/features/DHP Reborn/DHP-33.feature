@DHP33 @Regression
Feature: DHP-33: As a Configuration Mgr., I want to be able to enable and disable the assessment option for patients, so that it can hidden if required

  @DHP33A
  Scenario: 01: Configuration Mgr. view the available setting options
    Given the config manager is on the configuration setting page
    Then user checks if horizontal tabs on settings page is complete

  @DHP33B
  Scenario: 02: Configuration Mgr. views the setting for Assessment
    Given the config manager is on the configuration setting page
    Then sees the options under assessments

  @DHP33C
  Scenario: 03:
    Given the config manager is on the configuration setting page
    When the user switches assessment option off
    Then sees the other assessments disabled

  @DHP33D
  Scenario: 04:
    Given the config manager is on the configuration setting page
    When the user switches anxiety option off
    Then sees anxiety option is turned off

  @DHP33E
  Scenario: 05:
    Given the config manager is on the configuration setting page
    When the user switches physical activity option off
    Then sees physical activity option is turned off

  @DHP33
  Scenario: 06: Configuration Mgr. disables all switches related to Assessments
  Given the config manager is on the configuration setting page
  When the user disables assessment option off
  Then sees message that it is saved successfully
  
  @DHP33
  Scenario: 07: Configuration Mgr. switches on Enable Assessment
  Given the config manager is on the configuration setting page
  When the user enables assessment option on
  Then sees message that it is saved successfully
  
  @DHP33
  Scenario: 08: Configuration Mgr. cancels with no unsaved changes
    Given the config manager is on the configuration setting page
    When user clicks on cancel with no changes
    Then the web browser is on "Settings" page

  @DHP33
  Scenario: 09: Configuration Mgr. cancels with unsaved changes
    Given the config manager is on the configuration setting page
    When user switches videoconferencing option
    And user clicks on cancel on unsaved changes
    Then the web browser is on "Settings" page

  @DHP33
  Scenario: 10: Configuration Mgr. clicks on save
    Given the config manager is on the configuration setting page
    When user clicks an option to toggle
    Then sees message that it is saved successfully

  @End
  Scenario: Close web browser
