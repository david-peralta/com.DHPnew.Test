package steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Base;
import pages.Pages;

public class Steps_Clinician extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();

	// ################################################## Given Steps ##################################################
	@Given("^the clinician is on the patient's profile page$")
	public void the_clinician_is_on_the_patient_s_profile_page() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			webElementClick(pages.getPageHome().getLogInButton());
			Thread.sleep(5000);
			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(), properties.getProperty("DoctorEmail"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(), properties.getProperty("DoctorPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());
			webElementClick(pages.getPageClinician().getPatientsMenubar());

		}
		catch (AssertionError exception) {
			throw new AssertionError("Clinician Cannot proceed to patient's profile page." + "\n" + exception.getMessage());
		}
	}
	// ################################################## When Steps ###################################################

	@When("^user clicks on a specific patient$")
	public void user_clicks_on_a_specific_patient() throws Throwable {

		try {
			webElementClick(pages.getPageClinician().getPatientSearchField());
			waitUntilWebElementVisible(pages.getPageClinician().getPatientSearchField());
			webElementSendKeys(pages.getPageClinician().getPatientSearchField(), properties.getProperty("PatientFirstName"));
			webElementClick(pages.getPageClinician().getSearchButton());
			Thread.sleep(5000);
			waitUntilWebElementVisible(pages.getPageClinician().getDemethPatientLink());
			webElementClick(pages.getPageClinician().getDemethPatientLink());

		}
		catch (Exception exception) {
			throw new Exception("Clinician Cannot search a patient's profile page." + "\n" + exception.getMessage());
		}

	}

	@When("^clicks on appointments tab$")
	public void clicks_on_appointments_tab() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageClinician().getPatientNameLabel());
			webElementClick(pages.getPageClinician().getAppointmentsTab());
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate Appointments tab." + "\n" + exception.getMessage());
		}
	}
	// ################################################## Then Steps ##################################################

	@Then("^the clinician see the following four tabs under the patient's profile$")
	public void the_clinician_see_the_following_four_tabs_under_the_patient_s_profile() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageClinician().getPatientNameLabel());
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getDefaultTab()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getBasicInfoTab()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getMedicalInfoTab()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getPSATab()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getAppointmentsTab()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getNotesTab()));

		}
		catch (AssertionError exception) {
			throw new AssertionError("Tabs under the patient's profile is incomplete." + "\n" + exception.getMessage());
		}
	}

	@Then("^the assesstment table on appointments tab is hidden$")
	public void the_assesstment_table_on_appointments_tab_is_hidden() throws Throwable {
		try {
			assertFalse(isWebElementDisplayed(pages.getPageClinician().getAssesstmentOnAppointmentsTabGraph()));

		}
		catch (AssertionError exception) {
			throw new AssertionError("Assesstment table on appointments tab is not hidden." + "\n" + exception.getMessage());
		}
	}

	@Then("^the clinician see the following three tabs under the patient's profile$")
	public void the_clinician_see_the_following_three_tabs_under_the_patient_s_profile() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageClinician().getPatientNameLabel());
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getDefaultTab()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getBasicInfoTab()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getMedicalInfoTab()));
			assertFalse(isWebElementDisplayed(pages.getPageClinician().getPSATab()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getAppointmentsTab()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getNotesTab()));

		}
		catch (AssertionError exception) {
			throw new AssertionError("Tabs under the patient's profile is incomplete." + "\n" + exception.getMessage());
		}
	}
}