@Regression
Feature: DHP-109: As a patient, I want the first reason to book an appointment to be changed, so it can be made generic.

  Scenario: 1:  Patient views reasons to book an appointment
    Given a patient is on the appointments page
    When the user clicks on request appointment button
    Then they go on to the step of the requesting an appointment, 'Select Reason'
    And they see the following reason to select from:

  #		1. I want more information about my condition    			 #
  #		2. I want to speak about treatment side effects    		 #
  #		3. I want to speak about my mood and relationships     #
  #		4. I am not sure
  
  @End
  Scenario: Close web browser