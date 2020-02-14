package steps;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Base;
import pages.Pages;

public class Steps_Appointments extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();

	// ################################################## Given Steps ##################################################
	@Given("^the patient is on patients page$")
	public void the_patient_is_on_patients_page() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			Assert.assertTrue(getCurrentUrl().contains(properties.getProperty("url")));
			waitUntilWebElementVisible(pages.getPageHome().getLogInButton());
			webElementClick(pages.getPageHome().getLogInButton());
			Thread.sleep(5000);
			waitUntilWebElementVisible(pages.getPageLogin().getButtonLogin());
			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(), properties.getProperty("PatientEmail"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(), properties.getProperty("PatientPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());
		}
		catch (AssertionError exception) {
			throw new AssertionError("Cannot proceed to patients landing page." + "\n" + exception.getMessage());

		}
	}

	// ################################################## When Steps ###################################################
	@When("^user clicks on request appointment$")
	public void user_clicks_on_request_appointment() throws Throwable {
		try {
			// clicks on appointment menu
			webElementClick(pages.getpageAppointments().getAppointmentsLink());
			waitUntilWebElementVisible(pages.getpageAppointments().getRequestAppointmentButton());
			assertTrue(isWebElementDisplayed(pages.getpageAppointments().getAppointmentHeader()));
			// clicks on request appointment button
			webElementClick(pages.getpageAppointments().getRequestAppointmentButton());

		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to click request appointment button." + "\n" + exception.getMessage());

		}
	}

	@When("^user request an appointment and assessment was disabled by the configuration manager$")
	public void user_request_an_appointment_and_assessment_was_disabled_by_the_configuration_manager() throws Throwable {
		try {
			// clicks on appointment menu
			webElementClick(pages.getpageAppointments().getAppointmentsLink());
			waitUntilWebElementVisible(pages.getpageAppointments().getRequestAppointmentButton());
			assertTrue(isWebElementDisplayed(pages.getpageAppointments().getAppointmentHeader()));
			// clicks on request appointment button
			webElementClick(pages.getpageAppointments().getRequestAppointmentButton());
			// checks on request appointment page
			waitUntilWebElementVisible(pages.getpageAppointments().getRequestAppointmentLabel());
			assertTrue(isWebElementDisplayed(pages.getpageAppointments().getRequestAppointmentLabel()));
			// select appointment question
			webElementClick(pages.getpageAppointments().getAppointmentQuestion());
			// check clinicians
			waitUntilWebElementVisible(pages.getpageAppointments().getSelectClinicianHeader());
			assertTrue(isWebElementDisplayed(pages.getpageAppointments().getSelectClinicianHeader()));
			// select clinician's available time
			scrollToWebElement(pages.getpageAppointments().getSelectClinicianTimeline1stPage());
			// waitUntilWebElementVisible(pages.getpageAppointments().getBookClinician());
			Thread.sleep(5000);
			webElementClick(pages.getpageAppointments().getBookClinician());
			Thread.sleep(5000);
			// waitUntilWebElementVisible(pages.getpageAppointments().getBookClinician());
			// check if redirected to select clinician schedule
			waitUntilWebElementVisible(pages.getpageAppointments().getSelectAnotherClinician());
			assertTrue(isWebElementDisplayed(pages.getpageAppointments().getRequestAppointmentLabel()));
			// check page labels
			assertTrue(isWebElementDisplayed(pages.getpageAppointments().getSelectAnotherClinicianLabel()));
			assertTrue(isWebElementDisplayed(pages.getpageAppointments().getSelectClinicianTimeline()));
			// select date
			webElementClick(pages.getpageAppointments().getAppointmentDateIsToday());
			// select time
			waitUntilWebElementVisible(pages.getpageAppointments().getAppointmentDateTimeContainer());
			webElementClick(pages.getpageAppointments().getAppointmentTime());
			// user check and click In clinic visit button
			waitUntilWebElementVisible(pages.getpageAppointments().getButtonClinicVisit());
			webElementClick(pages.getpageAppointments().getButtonClinicVisit());
			// user check and click on next button
			waitUntilWebElementVisible(pages.getpageAppointments().getButtonNext());
			webElementClick(pages.getpageAppointments().getButtonNext());
			// user check and tick on consent checkbox
			waitUntilWebElementVisible(pages.getpageAppointments().getCheckboxRequestAppointmentConsent());
			webElementClick(pages.getpageAppointments().getCheckboxRequestAppointmentConsent());
			scrollToBottom();
			// user check and click send request
			waitUntilWebElementVisible(pages.getpageAppointments().getButtonSendRequest());
			webElementClick(pages.getpageAppointments().getButtonSendRequest());
			// user check close success appointment popup
			// switchFrameByWebElement(pages.getpageAppointments().getSuccessAppointmentRequest());
			waitUntilWebElementVisible(pages.getpageAppointments().getCloseSuccessAppointmentRequest());
			assertTrue(isWebElementDisplayed(pages.getpageAppointments().getCloseSuccessAppointmentRequest()));

		}
		catch (AssertionError exception) {
			throw new AssertionError("User was not able to request an appointment" + "\n" + exception.getMessage());

		}

	}

	// ################################################## Then Steps ###################################################

	@Then("^changes on request appointment page was displayed$")
	public void changes_on_request_appointment_page_was_displayed() throws Throwable {
		try {
			// checks on request appointment page
			waitUntilWebElementVisible(pages.getpageAppointments().getRequestAppointmentLabel());
			assertTrue(isWebElementDisplayed(pages.getpageAppointments().getRequestAppointmentLabel()));
			// select appointment question
			webElementClick(pages.getpageAppointments().getAppointmentQuestion());
			// check clinicians
			waitUntilWebElementVisible(pages.getpageAppointments().getSelectClinicianHeader());
			assertTrue(isWebElementDisplayed(pages.getpageAppointments().getSelectClinicianHeader()));
			// select clinician's available time
			scrollToWebElement(pages.getpageAppointments().getSelectClinicianTimeline1stPage());
			Thread.sleep(5000);
			// waitUntilWebElementVisible(pages.getpageAppointments().getBookClinician());
			webElementClick(pages.getpageAppointments().getBookClinician());
			Thread.sleep(5000);
			// check if redirected to select clinician schedule
			waitUntilWebElementVisible(pages.getpageAppointments().getSelectAnotherClinician());
			assertTrue(isWebElementDisplayed(pages.getpageAppointments().getRequestAppointmentLabel()));
			// check page labels
			assertTrue(isWebElementDisplayed(pages.getpageAppointments().getSelectAnotherClinicianLabel()));
			assertTrue(isWebElementDisplayed(pages.getpageAppointments().getSelectClinicianTimeline()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Cannot proceed to request appointment page." + "\n" + exception.getMessage());

		}
	}

	@Then("^start assessment button in the request popup is not displayed$")
	public void start_assessment_button_in_the_request_popup_is_not_displayed() throws Throwable {
		try {
			// start assessment button is not displayed
			Assert.assertTrue(!isWebElementDisplayed(pages.getpageAppointments().getStartAssesment()));

		}
		catch (AssertionError exception) {
			throw new AssertionError("Start assessment button is displayed" + "\n" + exception.getMessage());

		}
	}

	@Then("^clicking on the close button will close the request popup$")
	public void clicking_on_the_close_button_will_close_the_request_popup() throws Throwable {
		try {
			// user click on close success appointment button
			webElementClick(pages.getpageAppointments().getCloseSuccessAppointmentRequest());
			waitUntilWebBrowserTitleContains("Appointments | Prostmate");
			// check popup is closed
			assertTrue(!isWebElementDisplayed(pages.getpageAppointments().getSuccessAppointmentRequest()));
			Assert.assertEquals("Appointments | Prostmate", getPageTitle());

		}
		catch (AssertionError exception) {
			throw new AssertionError("Close button is not displayed, unable to close appointment request popup" + "\n" + exception.getMessage());

		}
	}
}