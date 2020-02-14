package steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
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

		} catch (AssertionError exception) {
			throw new AssertionError(
					"Clinician Cannot proceed to patient's profile page." + "\n" + exception.getMessage());
		}
	}
	@Given("^the clinicians manager is on clinicians page$")
	public void the_clinicians_manager_is_on_clinicians_page() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			getCurrentUrl().contains(properties.getProperty("url"));
			webElementClick(pages.getPageHome().getLogInButton());

			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(),
					properties.getProperty("ClinicianManagerEmail"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(),
					properties.getProperty("ClinicianManagerPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());
		} catch (Exception exception) {
			throw new AssertionError("Cannot proceed to clinicians manager landing page." + "\n" + exception.getMessage());
		}
	}
	
	// ################################################## When Steps ###################################################
	@When("^user is in the clinicians page$")
	public void user_is_in_the_clinicians_page() throws Throwable {
		try {
			// checks user if in the clinicians page
			waitUntilWebElementVisible(pages.getPageClinician().getCreateClinicianButton());
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getClinicianHeader()));
		} catch (Exception exception) {
			throw new AssertionError("Wrong page redirection." + "\n" + exception.getMessage());
		}

	}

	@When("^user clicks on a specific patient$")
	public void user_clicks_on_a_specific_patient() throws Throwable {

		try {
			waitUntilWebElementVisible(pages.getPageClinician().getPatientSearchField());
			webElementClick(pages.getPageClinician().getPatientSearchField());
			waitUntilWebElementVisible(pages.getPageClinician().getPatientSearchField());
			webElementSendKeys(pages.getPageClinician().getPatientSearchField(), properties.getProperty("PatientFirstName"));
			webElementClick(pages.getPageClinician().getSearchButton());
			Thread.sleep(5000);
			waitUntilWebElementVisible(pages.getPageClinician().getDemethPatientLink());
			webElementClick(pages.getPageClinician().getDemethPatientLink());

		} catch (Exception exception) {
			throw new Exception("Clinician Cannot search a patient's profile page." + "\n" + exception.getMessage());
		}

	}

	@When("^clicks on appointments tab$")
	public void clicks_on_appointments_tab() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageClinician().getPatientNameLabel());
			webElementClick(pages.getPageClinician().getAppointmentsTab());
		} catch (Exception exception) {
			throw new Exception("Unable to locate Appointments tab." + "\n" + exception.getMessage());
		}
	}

	@When("^user inputs an empty clinician to the search field$")
	public void user_inputs_an_empty_clinician_to_the_search_field() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageClinician().getInputSearchField());
			webElementSendKeys(pages.getPageClinician().getInputSearchField(), "All");
			webElementClick(pages.getPageClinician().getSearchButton());
			waitUntilWebElementVisible(pages.getPageClinician().getSearchButton());
		} catch (Exception exception) {
			throw new Exception("Error in searching clinician" + "\n" + exception.getMessage());
		}

	}

	@When("^they click on reset on search field$")
	public void they_click_on_reset_on_search_field() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageClinician().getResetButton());
			webElementClick(pages.getPageClinician().getResetButton());
			waitUntilWebElementVisible(pages.getPageClinician().getSearchButton());
		} catch (Exception exception) {
			throw new Exception("Unable to reset search field" + "\n" + exception.getMessage());
		}

	}

	// ################################################## Then Steps ##################################################
	@Then("^inside the Assessment Results box, they see assessment results of the most recent assessment completed by that patient$")
	public void inside_the_Assessment_Results_box_they_see_assessment_results_of_the_most_recent_assessment_completed_by_that_patient()
			throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageClinician().getAssesstmentOnAppointmentsTabGraph());
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getAnxietyGraphRadioBtn()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getDepressionGraphRadioBtn()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getDistressGraphRadioBtn()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getAnswersOfNeedsQuestionnaire()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getAnswersOfDepressionQuestionnaire()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getAnswersOfAnxietyQuestionnaire()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getAnswersOfPhysicalActivityQuestionnaire()));
		} catch (AssertionError exception) {
			throw new AssertionError("Assessment results is incomplete." + "\n" + exception.getMessage());
		}
	}

	@Then("^inside the Assessment Results box, they see assessment results without physical activity table of the most recent assessment completed by that patient$")
	public void inside_the_Assessment_Results_box_they_see_assessment_results_without_physical_activity_table_of_the_most_recent_assessment_completed_by_that_patient()
			throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageClinician().getAssesstmentOnAppointmentsTabGraph());
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getAnxietyGraphRadioBtn()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getDepressionGraphRadioBtn()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getDistressGraphRadioBtn()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getAnswersOfNeedsQuestionnaire()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getAnswersOfDepressionQuestionnaire()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getAnswersOfAnxietyQuestionnaire()));
			assertTrue(!isWebElementDisplayed(pages.getPageClinician().getAnswersOfPhysicalActivityQuestionnaire()));
		} catch (AssertionError exception) {
			throw new AssertionError("Assessment results is incomplete." + "\n" + exception.getMessage());
		}
	}

	@Then("^the following menu is displayed$")
	public void the_following_menu_is_displayed() throws Throwable {
		try {
			// checks links in the menu
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getClinicianMenuLink()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getClinicianResourcesLink()));
			assertTrue(isWebElementDisplayed(pages.getPageClinician().getClinicianLogoutLink()));
		} catch (AssertionError exception) {
			throw new AssertionError("Menu is not displayed." + "\n" + exception.getMessage());
		}

	}

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

		} catch (AssertionError exception) {
			throw new AssertionError("Tabs under the patient's profile is incomplete." + "\n" + exception.getMessage());
		}
	}

	@Then("^the assesstment table on appointments tab is hidden$")
	public void the_assesstment_table_on_appointments_tab_is_hidden() throws Throwable {
		try {
			assertFalse(isWebElementDisplayed(pages.getPageClinician().getAssesstmentOnAppointmentsTabGraph()));

		} catch (AssertionError exception) {
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

		} catch (AssertionError exception) {
			throw new AssertionError("Tabs under the patient's profile is incomplete." + "\n" + exception.getMessage());
		}
	}

	@Then("^sees the screen elements displayed$")
	public void sees_the_screen_elements_displayed() throws Throwable {
		try {
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinician().getPlaceHolderSelectClinician()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinician().getResetButton()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinician().getSearchButton()));
		} catch (AssertionError exception) {
			throw new Exception("Screen Element are not displayed" + "\n" + exception.getMessage());
		}

	}

	@Then("^check results of records found$")
	public void check_results_of_records_found() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageClinician().getAlertRecordFound());
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinician().getAlertRecordFound()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinician().getLabelRecordFound()));
		} catch (AssertionError exception) {
			throw new Exception("No records to shown" + "\n" + exception.getMessage());
		}

	}

	@Then("^checks result of no records found$")
	public void checks_result_of_no_records_found() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageClinician().getAlertNoRecordFound());
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinician().getAlertNoRecordFound()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinician().getLabelNoRecordFound()));
		} catch (AssertionError exception) {
			throw new Exception("Unable to show records" + "\n" + exception.getMessage());
		}

	}

	@When("^user inputs a clinician to the search field$")
	public void user_inputs_a_clinician_to_the_search_field() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageClinician().getInputSearchField());
			webElementSendKeys(pages.getPageClinician().getInputSearchField(), "User");
			webElementClick(pages.getPageClinician().getSearchButton());
			waitUntilWebElementVisible(pages.getPageClinician().getSearchButton());
		} catch (Exception exception) {
			throw new Exception("No Clinicians is displayed" + "\n" + exception.getMessage());
		}

	}
}