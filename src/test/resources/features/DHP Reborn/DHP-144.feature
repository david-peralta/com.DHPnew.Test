@DHP144 @Regression
Feature: DHP-144: As a Configuration Manager, I want to enable/disable the Needs Assessment so that I can configure the portal based on my organisation's preference

  @DHP144A
  Scenario: 01: Config Mgr. views the Settings page
    Given the config manager is viewing the assessment settings
    Then sees needs assessment option

  @DHP144B
  Scenario: 02: Configuration Manager saves their changes
    Given the config manager is viewing the assessment settings
    When they disable or enable the needs assessment
    Then sees message that it is saved successfully
    And the web browser is on "Settings" page
 
  @DHP144B
  Scenario: Close web browser
