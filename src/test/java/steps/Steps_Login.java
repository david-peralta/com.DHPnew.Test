package steps;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Base;
import pages.Pages;

public class Steps_Login extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();
	
	// ################################################## Given Steps ##################################################
	@Given("^the web browser is on the login page$")
	public void the_web_browser_is_on_the_login_page() throws Throwable {
		try {
			if (!getPageTitle().equals("Login")) {
				steps.getStepsHome().the_user_logs_out();
			}
			
			Assert.assertEquals("Login", getPageTitle());
		}
		catch (AssertionError exception) {
			throw new AssertionError("The web browser is not on the login page." + "\n" + exception.getMessage());
		}
	}
	
	@Given("^the web browser is not on login page$")
	public void the_web_browser_is_not_on_login_page() throws Throwable {
		try {
			if (getPageTitle().equals("Login")) {
				the_user_logs_in_with_credentials("Admin");
			}
			
			Assert.assertTrue(!getPageTitle().equals("Login"));
		}
		catch (AssertionError exception) {
			throw new AssertionError("The web browser is on the login page." + "\n" + exception.getMessage());
		}
	}
	
	// ################################################## When Steps ###################################################
	@When("^user input \"([^\"]*)\" as email address on login page$")
	public void user_input_as_email_address_on_login_page(String arg1) throws Throwable {
		try {
			webElementClear(pages.getPageLogin().getInputEmailAddress());
			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(),arg1);
			Thread.sleep(5000);
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate email address field" + "\n" + exception.getMessage());
		}		
	}

	@When("^user input \"([^\"]*)\" as password on login page$")
	public void user_input_as_password_on_login_page(String arg1) throws Throwable {
		try {
			webElementClear(pages.getPageLogin().getInputUserPassword());
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(),arg1);
			Thread.sleep(5000);
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate password field" + "\n" + exception.getMessage());
		}	
	}
	
	
	@When("^user clicks login button on login page$")
	public void user_clicks_login_button_on_login_page() throws Throwable {
		try {
			webElementClick(pages.getPageLogin().getButtonLogin());
			Thread.sleep(5000);
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate LOGIN BUTTON ON LOGIN PAGE" + "\n" + exception.getMessage());
		}	
	}
	
	
	@When("^the user logs in with \"([^\"]*)\" credentials$")
	public void the_user_logs_in_with_credentials(String arg1) throws Throwable {
		try {
			if (arg1.equals("Config Manager")) {
				webElementSendKeys(pages.getPageLogin().getInputEmailAddress(), properties.getProperty("ConfigManagerEmail"));
				webElementSendKeys(pages.getPageLogin().getInputUserPassword(), properties.getProperty("ConfigManagerPassword"));
				webElementClick(pages.getPageLogin().getButtonLogin());
			}
			else if (arg1.equals("Clinician Manager")) {
				webElementSendKeys(pages.getPageLogin().getInputEmailAddress(), properties.getProperty("ClinicianManagerEmail"));
				webElementSendKeys(pages.getPageLogin().getInputUserPassword(), properties.getProperty("ClinicianManagerPassword"));
				webElementClick(pages.getPageLogin().getButtonLogin());	
		}
		
		else if (arg1.equals("Doctor")) {
			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(), properties.getProperty("DoctorEmail"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(), properties.getProperty("DoctorPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());	
	}
		else if (arg1.equals("Patient")) {
			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(), properties.getProperty("PatientEmail"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(), properties.getProperty("PatientPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());	
	}
		}
		catch (Exception exception) {
			throw new Exception("The login fields are not available." + "\n" + exception.getMessage());
		}
	}

	// ################################################## Then Steps ###################################################
	@Then("^feedback error message for required fields is displayed$")
	public void feedback_error_message_for_required_fields_is_displayed() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.getPageLogin().getValidatedEmptyEmailAddress()));
			assertTrue(isWebElementDisplayed(pages.getPageLogin().getValidatedEmptyUserPassword()));	
			//assertTrue(getWebElementCssValue(pages.getPageLogin().getValidatedEmptyEmailAddress(),"color:").contains("red"));
			//assertTrue(getWebElementCssValue(pages.getPageLogin().getValidatedEmptyUserPassword(),"color:").contains("red"));
			
		}
		catch (AssertionError exception) {
			throw new AssertionError("Feedback error message is not displayed" + "\n" + exception.getMessage());
		}
	}
	@Then("^feedback error message for invalid email address is displayed$")
	public void feedback_error_message_for_invalid_email_address_is_displayed() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.getPageLogin().getValidatedInvalidEmailAddress()));	
			
			
		}
		catch (AssertionError exception) {
			throw new AssertionError("Feedback error message is not displayed" + "\n" + exception.getMessage());
		}
	}
	
	
	@Then("^feedback error message for invalid password is displayed$")
	public void feedback_error_message_for_invalid_password_is_displayed() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.getPageLogin().getValidatedInvalidUserPassword()));	
			webDriver.quit();
			
		}
		catch (AssertionError exception) {
			throw new AssertionError("Feedback error message is not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^elements inside the login page is complete$")
	public void elements_inside_the_login_page_is_complete() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.getPageLogin().getButtonRegister()));
			assertTrue(isWebElementDisplayed(pages.getPageLogin().getInputEmailAddress()));
			assertTrue(isWebElementDisplayed(pages.getPageLogin().getInputUserPassword()));
			assertTrue(isWebElementDisplayed(pages.getPageLogin().getButtonLogin()));
			assertTrue(isWebElementDisplayed(pages.getPageLogin().getForgotPasswordlink()));	
		}
		catch (AssertionError exception) {
			throw new AssertionError("Elements inside the login page is incomplete." + "\n" + exception.getMessage());
		}
	}
	
	@Then("^password field is masked$")
	public void password_field_is_masked() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.getPageLogin().getIfPasswordFieldisMasked()));	
		}
		catch (AssertionError exception) {
			throw new AssertionError("Password field is not masked." + "\n" + exception.getMessage());
		}
	}

}