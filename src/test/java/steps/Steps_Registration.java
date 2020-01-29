package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import helpers.Base;
import pages.Pages;

public class Steps_Registration extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();
	
	// ################################################## Given Steps ##################################################
	@Given("^the user is on registration page$")
	public void the_user_is_on_registration_page() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			Assert.assertTrue(getCurrentUrl().contains(properties.getProperty("url")));
			webElementClick(pages.getPageHome().getRegisterButton());
			Thread.sleep(5000);
		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to launch URL on the web browser." + "\n" + exception.getMessage());
		}
		
		
	}

	// ################################################## When Steps ###################################################
	
	// ################################################## Then Steps ###################################################
	@Then("^user sees registration reason dropdown from registration page$")
	public void user_sees_registration_reason_dropdown_from_registration_page() throws Throwable {
		
		try {
			isWebElementDisplayed(pages.getPageRegistration().getLabelWhatBringsYouHere());
			isWebElementDisplayed(pages.getPageRegistration().getDropdownWhatBringsYouHere());
		}
		catch (Exception exception) {
			throw new Exception("Registration reason label/dropdown is not displayed." + "\n" + exception.getMessage());
		}
		
		
	}
	
	@Then("^registration reason dropdown options are complete$")
	public void registration_reason_dropdown_options_are_complete() throws Throwable {
		try {
			String reasons [] = {"Please Select", "I have, or have had a medical condition.", "I am supporting someone with a medical condition.", "I am interested in learning more."};
			checkDropdownOptionsAvailable(pages.getPageRegistration().getDropdownWhatBringsYouHere(), reasons);
		}
		catch (AssertionError exception) {
			throw new AssertionError("Registration reason dropdown options is incomplete" + "\n" + exception.getMessage());
		}
		
	}

}