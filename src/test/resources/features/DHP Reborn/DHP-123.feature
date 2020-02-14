@DHP123 @Regression
Feature: DHP-123: As a user, I want to see the updated text on Hero Image

  @DHP123A 
  Scenario: 01: As a user, I want to see the updated text on Hero Image 
  #Opening of page is on the bottom not  the top
    Given user is on homepage
		Then checks hero text is displayed
		
  @End
  Scenario: Close web browser
