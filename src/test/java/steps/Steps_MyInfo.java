package steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Base;

import pages.Pages;

public class Steps_MyInfo extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();
	
	// ################################################## Given Steps ##################################################
	
	@Given("^the user is on patient landing page$")
	public void the_user_is_on_patient_landing_page() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			Assert.assertTrue(getCurrentUrl().contains(properties.getProperty("url")));
			webElementClick(pages.getPageHome().getLogInButton());
			Thread.sleep(5000);
			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(), properties.getProperty("PatientEmail"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(), properties.getProperty("PatientPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());	
		}
		catch (AssertionError exception) {
			throw new AssertionError("Cannot proceed to clinicians manager landing page." + "\n" + exception.getMessage());
			
		}
	}
	
	
	@Given("^the user is on wellness check tab on my info page$")
	public void the_user_is_on_wellness_check_tab_on_my_info_page() throws Throwable {	
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			Assert.assertTrue(getCurrentUrl().contains(properties.getProperty("url")));
			webElementClick(pages.getPageHome().getLogInButton());
			Thread.sleep(5000);
			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(), properties.getProperty("PatientEmail"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(), properties.getProperty("PatientPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());	
			webElementClick(pages.getPageMyInfo().getWellnessCheckTab());
			Thread.sleep(1000);
		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to proceed on wellness check tab." + "\n" + exception.getMessage());
		}
		
	}
	@Given("^the clinician is on patients profile page$")
	public void the_clinician_is_on_patients_profile_page() throws Throwable {	
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			Assert.assertTrue(getCurrentUrl().contains(properties.getProperty("url")));
			webElementClick(pages.getPageHome().getLogInButton());
			Thread.sleep(5000);
			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(), properties.getProperty("clinicia@doctor.com"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(), properties.getProperty("PatientPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());	
			webElementClick(pages.getPageMyInfo().getWellnessCheckTab());
			Thread.sleep(1000);
		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to proceed on wellness check tab." + "\n" + exception.getMessage());
		}
		
	}
	
	@Given("^user is on timeline tab on my info page$")
	public void user_is_on_timeline_tab_on_my_info_page() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			Assert.assertTrue(getCurrentUrl().contains(properties.getProperty("url")));
			webElementClick(pages.getPageHome().getLogInButton());
			Thread.sleep(5000);
			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(), properties.getProperty("PatientEmail"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(), properties.getProperty("PatientPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());	
			webElementClick(pages.getPageMyInfo().getTimelineTab());
			Thread.sleep(1000);
		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to proceed on timeline tab." + "\n" + exception.getMessage());
		}
	}

	// ################################################## When Steps ###################################################
	@When("^user clicks on add info button on my info page$")
	public void user_clicks_on_add_info_button_on_my_info_page() throws Throwable {
		try {
			webElementClick(pages.getPageMyInfo().getButtonAddInfo());
			Thread.sleep(1000);
		}
		catch (Exception exception) {
			throw new Exception("Unable to proceed on patient landing page." + "\n" + exception.getMessage());
		}
	}
	@When("^user clicks on start wellness check button$")
	public void user_clicks_on_start_wellness_check_button() throws Throwable {
		try {
			webElementClick(pages.getPageMyInfo().getStartWellnessCheckbutton());
			Thread.sleep(1000);
		}
		catch (Exception exception) {
			throw new Exception("Unable to proceed on patient landing page." + "\n" + exception.getMessage());
		}
	}
	
	
	// ################################################## Then Steps ###################################################
	@Then("^PSA tab on my info page is not displayed$")
	public void psa_tab_on_my_info_page_is_not_displayed() throws Throwable {
		try {
			assertFalse(isWebElementDisplayed(pages.getPageMyInfo().getPSATabOnMyInfoPage()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("PSA tab on my info page is still displayed." + "\n" + exception.getMessage());
		}
	}
	
	@Then("^PSA tab on my info page is displayed$")
	public void psa_tab_on_my_info_page_is_displayed() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.getPageMyInfo().getPSATabOnMyInfoPage()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("PSA tab on my info page is not displayed." + "\n" + exception.getMessage());
		}
	}
	
	
	@Then("^complete wellness check questions are displayed$")
	public void complete_wellness_check_questions_are_displayed() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.getPageMyInfo().getWellnessCheckQuestion1()));
			assertTrue(isWebElementDisplayed(pages.getPageMyInfo().getWellnessCheckQuestion2()));
			assertTrue(isWebElementDisplayed(pages.getPageMyInfo().getWellnessCheckQuestion3()));
			assertTrue(isWebElementDisplayed(pages.getPageMyInfo().getWellnessCheckQuestion4()));
			assertTrue(isWebElementDisplayed(pages.getPageMyInfo().getWellnessCheckQuestion5()));
			webDriver.quit();
			
		}
		catch (AssertionError exception) {
			throw new AssertionError("Wellness check questions is incomplete" + "\n" + exception.getMessage());
		}
	}
	@Then("^wellness check question one is not displayed$")
	public void wellness_check_question_one_is_not_displayed() throws Throwable {
		try {
			assertFalse(isWebElementDisplayed(pages.getPageMyInfo().getWellnessCheckQuestion1()));
			webDriver.quit();
		}
		catch (AssertionError exception) {
			throw new AssertionError("wellness check questions is incomplete" + "\n" + exception.getMessage());
		}
	}

	
	@Then("^user sees info type dropdown from my info page$")
	public void user_sees_info_type_dropdown_from_my_info_page() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.getPageMyInfo().getLabelInfoType()));
			assertTrue(isWebElementDisplayed(pages.getPageMyInfo().getDropdownInfoType()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to locate Info type dropdown." + "\n" + exception.getMessage());
		}
	}
	
	@Then("^info type dropdown options are complete$")
	public void info_type_dropdown_options_are_complete() throws Throwable {
		try {
			String infoTypes [] = {"Please select","Appointments", "Decisions", "Journal", "PSA","To Do","Treatment","Other"};
			checkDropdownOptionsAvailable(pages.getPageMyInfo().getDropdownInfoType(), infoTypes);
		}
		catch (Exception exception) {
			throw new Exception("Info type dropdown options is incomplete." + "\n" + exception.getMessage());
		}
	}
	
	@Then("^question number one on wellness check is successfully updated$")
	public void question_number_one_on_wellness_check_is_successfully_updated() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.getPageMyInfo().getWellnessCheckQuestion1Updated()));
			webDriver.quit();
		}
		catch (AssertionError exception) {
			throw new AssertionError("Question 1 is not updated." + "\n" + exception.getMessage());
		}
	}
	
	@Given("^graph legend for question number one on wellness check is successfully updated$")
	public void graph_legend_for_question_number_one_on_wellness_check_is_successfully_updated() throws Throwable {
		try {
			assertFalse(isXPathNotExisting("//div[text()='Edited graph legend one']"));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Question 1 is not updated." + "\n" + exception.getMessage());
		}
	}

	


}