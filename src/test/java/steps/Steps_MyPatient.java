package steps;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Base;
import pages.Pages;

public class Steps_MyPatient extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();

	// ################################################## Given Steps ##################################################
	@Given("^that a clinician has selected a Patient in the my patients page$")
	public void that_a_clinician_has_selected_a_patient_in_the_my_Patients_page() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			getCurrentUrl().contains(properties.getProperty("url"));
			webElementClick(pages.getPageHome().getLogInButton());

			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(), properties.getProperty("DoctorEmail"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(), properties.getProperty("DoctorPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());

			webElementClick(pages.getPageClinician().getPatientsMenubar());

			webElementSendKeys(pages.getPageMyPatient().getInputSearchName(), "demeth");
			webElementClick(pages.getPageMyPatient().getSearchButton());
			webElementClick(pages.getPageMyPatient().getLinkPatientUser());
			waitUntilWebElementVisible(pages.getPageMyPatient().getHeaderPatientProfile());

		}
		catch (Exception exception) {
			throw new Exception("clinician cannot proceed to patient's profile page." + "\n" + exception.getMessage());
		}
	}

	// ################################################## When Steps ###################################################

	@When("^then input a new note in the patient profile$")
	public void user_inputs_a_clinician_to_the_search_field() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageMyPatient().getTabPatientNote());
			webElementClick(pages.getPageMyPatient().getTabPatientNote());
			webElementClick(pages.getPageMyPatient().getButtonAddNote());
			waitUntilWebElementVisible(pages.getPageMyPatient().getTextAreaPatientNote());
			webElementSendKeys(pages.getPageMyPatient().getTextAreaPatientNote(), "Sample Test Note");
			webElementClick(pages.getPageMyPatient().getButtonSave());
		}
		catch (Exception exception) {
			throw new Exception("Unable to add note on patient profile" + "\n" + exception.getMessage());
		}
	}

	@When("^clicks cancels the patient note$")
	public void clicks_cancels_the_patient_note() throws Throwable {
		try {
			webElementClick(pages.getPageMyPatient().getButtonCancel());
		}
		catch (Exception exception) {
			throw new Exception("Unable to cancel patient note" + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks on patient notes tab")
	public void user_clicks_on_patient_notes_tab() throws Throwable {
		try {
			webElementClick(pages.getPageMyPatient().getTabPatientNote());
			waitUntilWebElementVisible(pages.getPageMyPatient().getButtonAddNote());
		}
		catch (Exception exception) {
			throw new Exception("notes tab not clickable" + "\n" + exception.getMessage());
		}
	}
	// ################################################## Then Steps ###################################################

	@Then("^views the patient profile tabs$")
	public void views_the_patient_profile_tabs() throws Throwable {
		try {
			Assert.assertTrue(isWebElementDisplayed(pages.getPageMyPatient().getTabPatientBasicInfo()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageMyPatient().getTabPatientMedicalInfo()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageMyPatient().getTabPatientPSA()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageMyPatient().getTabPatientAppointment()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageMyPatient().getTabPatientNote()));

		}
		catch (AssertionError exception) {
			throw new AssertionError("Cannot view patient tabs" + "\n" + exception.getMessage());
		}
	}

	@Then("^sees feedback success message is displayed$")
	public void sees_feedback_success_message_is_displayed() throws Throwable {
		try {
			Assert.assertTrue(isXPathNotExisting("//textarea[contains(@id,'TextArea_PatientNote')]"));
			waitUntilWebElementVisible(pages.getPageMyPatient().getMessageNoteAdded());
			Assert.assertTrue(isWebElementDisplayed(pages.getPageMyPatient().getMessageNoteAdded()));

		}
		catch (AssertionError exception) {
			throw new AssertionError("Patient Note was not successfully saved" + "\n" + exception.getMessage());
		}
	}

	@Then("^page is redirected back to the notes list$")
	public void page_is_redirected_back_to_the_notes_list() throws Throwable {
		try {
			Assert.assertTrue(isXPathNotExisting("//textarea[contains(@id,'TextArea_PatientNote')]"));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to return to notes list" + "\n" + exception.getMessage());
		}
	}

	@Then("^views the most recent notes at the top$")
	public void views_the_most_recent_notes_at_the_top() throws Throwable {
		try {
			Assert.assertTrue(isWebElementDisplayed(pages.getPageMyPatient().getRowFirstData()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("There is no data displayed" + "\n" + exception.getMessage());
		}
	}
}