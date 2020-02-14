package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Base;
import pages.Pages;

public class Steps_ConfigManagers extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();

	// ################################################## Given Steps ##################################################
	@Given("^the user is on configuration managers landing page$")
	public void the_user_is_on_configuration_managers_landing_page() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			webElementClick(pages.getPageHome().getLogInButton());
			Thread.sleep(5000);
			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(), properties.getProperty("ConfigManagerEmail"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(), properties.getProperty("ConfigManagerPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());
			// waitUntilWebElementVisible(pages.getpage);
			// assert.assertEquals(getPageTitle(), actual);
		}
		catch (AssertionError exception) {
			throw new AssertionError("Cannot proceed to clinicians manager landing page." + "\n" + exception.getMessage());
		}
	}

	// ################################################## When Steps ###################################################
	@When("^they click on the last name of Clinician Manager that they want to edit$")
	public void they_click_on_the_last_name_of_Clinician_Manager_that_they_want_to_edit() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getAlastNameLabel());

		}
		catch (Exception exception) {
			throw new Exception("Unable to locate clinician A lastname." + "\n" + exception.getMessage());
		}
	}

	@When("^they save the details without making any changes$")
	public void they_save_the_details_without_making_any_changes() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getButtonUpdate());
		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to locate save button." + "\n" + exception.getMessage());
		}
	}

	@When("^clear the mandatory field before updating$")
	public void clear_the_mandatory_field_before_updating() throws Throwable {
		try {
			webElementClear(pages.pageConfigManagers().getFirstNameField());
			webElementClear(pages.pageConfigManagers().getLastNameField());
			webElementClick(pages.pageConfigManagers().getButtonUpdate());
		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to clear one of the mandatory fields." + "\n" + exception.getMessage());
		}
	}

	@When("^the following feedback error message is displayed for each mandatory field not filled in$")
	public void the_following_feedback_error_message_is_displayed_for_each_mandatory_field_not_filled_in() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.pageConfigManagers().getEmptyCreateAdminFirstNameValidation());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getEmptyCreateAdminFirstNameValidation()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getEmptyCreateAdminLastNameValidation()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("validations on required field is missing" + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks on settings menubar$")
	public void user_clicks_on_settings_menubar() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getMenubarSettings());
			Thread.sleep(5000);
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate settings menubar." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks on admin menubar$")
	public void user_clicks_on_admin_menubar() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getMenubarAdmin());
			Thread.sleep(5000);
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate admin menubar." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks on create admin button inside the admin creation page$")
	public void user_clicks_on_create_admin_button_inside_the_admin_creation_page() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getCreateAdminConfigManagerButton());
			waitUntilWebElementVisible(pages.pageConfigManagers().getCreateAdminEmailField());
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate create admin button." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks cancel button inside the admin creation page$")
	public void user_clicks_cancel_button_inside_the_admin_creation_page() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getCancelAdminConfigManagerButton());
			waitUntilWebElementVisible(pages.pageConfigManagers().getUnsaveChangespopupLabel());
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate cancel button." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks no on prompt message for unsaved changes$")
	public void user_clicks_no_on_prompt_message_for_unsaved_changes() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getUnsaveChangespopupButtonNO());
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate no  button." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks yes on prompt message for unsaved changes$")
	public void user_clicks_yes_on_prompt_message_for_unsaved_changes() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getUnsaveChangespopupButtonYES());
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate yes button." + "\n" + exception.getMessage());
		}
	}

	@When("^user creates an administrator$")
	public void user_creates_an_administrator() throws Throwable {
		try {
			String FirstName = "First Name Admin" + getStringDateTimeNow("_MMddyy_HHmm");
			String LastName = "Last Name Admin" + getStringDateTimeNow("_MMddyy_HHmm");
			String Email = "Admin" + getStringDateTimeNow("_MMddyy_HHmm") + "@Admin.Admin";

			webElementClick(pages.pageConfigManagers().getCreateAdminConfigManagerButton());
			waitUntilWebElementVisible(pages.pageConfigManagers().getCreateAdminFirstNameField());
			webElementClear(pages.pageConfigManagers().getCreateAdminFirstNameField());
			webElementSendKeys(pages.pageConfigManagers().getCreateAdminFirstNameField(), FirstName);
			webElementClear(pages.pageConfigManagers().getCreateAdminLastNameField());
			webElementSendKeys(pages.pageConfigManagers().getCreateAdminLastNameField(), LastName);
			webElementClear(pages.pageConfigManagers().getCreateAdminEmailField());
			webElementSendKeys(pages.pageConfigManagers().getCreateAdminEmailField(), Email);
			webElementClick(pages.pageConfigManagers().getCreateAdminConfigManagerButton());
			waitUntilWebElementVisible(pages.pageConfigManagers().getCreationSuccesspopupButton());

			// assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getCreationSuccesspopupLabel()));
			// switchFrameByXPath("//span[text()='Account successfully created.']");

			webElementClick(pages.pageConfigManagers().getCreationSuccesspopupButton());

		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to create administrator." + "\n" + exception.getMessage());
		}
	}

	@When("^user creates an administrator without saving$")
	public void user_creates_an_administrator_without_saving() throws Throwable {
		try {

			String FirstName = "First Name Admin" + getStringDateTimeNow("_MMddyy_HHmm");

			webElementClick(pages.pageConfigManagers().getCreateAdminConfigManagerButton());
			waitUntilWebElementVisible(pages.pageConfigManagers().getCreateAdminFirstNameField());
			webElementClear(pages.pageConfigManagers().getCreateAdminFirstNameField());
			webElementSendKeys(pages.pageConfigManagers().getCreateAdminFirstNameField(), FirstName);
			webElementClick(pages.pageConfigManagers().getCancelAdminConfigManagerButton());

		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to create administrator." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks on cancel admin button inside the admin creation page$")
	public void user_clicks_on_cancel_admin_button_inside_the_admin_creation_page() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getCancelAdminConfigManagerButton());
			Thread.sleep(5000);
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate create admin button." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks on create admin button$")
	public void user_clicks_on_create_admin_button() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getCreateAdminConfigManagerButton());
			Thread.sleep(5000);
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate create admin button." + "\n" + exception.getMessage());
		}
	}

	@When("^user logsout the configuration managers page$")
	public void user_logsout_the_configuration_managers_page() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getMenubarLogout());
			Thread.sleep(5000);
			switchFrameByWebElement(pages.pageConfigManagers().getYesMeLogout());
			webElementClick(pages.pageConfigManagers().getYesMeLogout());
			Thread.sleep(1000);
			webDriver.quit();
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate logout menubar." + "\n" + exception.getMessage());
		}
	}

	@When("^user logsout the configuration managers page without closing the browser$")
	public void user_logsout_the_configuration_managers_page_without_closing_the_browser() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getMenubarLogout());
			Thread.sleep(5000);
			switchFrameByWebElement(pages.pageConfigManagers().getYesMeLogout());
			webElementClick(pages.pageConfigManagers().getYesMeLogout());
			Thread.sleep(1000);
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate logout menubar." + "\n" + exception.getMessage());
		}
	}

	@When("^user logsout the configuration managers page using profile menu without closing the browser$")
	public void user_logsout_the_configuration_managers_page_using_profile_menu_without_closing_the_browser() throws Throwable {
		try {

			webElementClick(pages.pageConfigManagers().getProfileMenuButton());
			Thread.sleep(5000);
			webElementClick(pages.pageConfigManagers().getProfileMenuLogoutLink());
			Thread.sleep(5000);
			switchFrameByWebElement(pages.pageConfigManagers().getYesMeLogout());
			webElementClick(pages.pageConfigManagers().getYesMeLogout());
			Thread.sleep(1000);
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate logout on profile menu." + "\n" + exception.getMessage());
		}
	}

	@When("^they click on the 'Cancel' option without making any changes$")
	public void they_click_on_the_Cancel_option_without_making_any_changes() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getCancelButton());
		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to locate cancel button." + "\n" + exception.getMessage());
		}
	}

	@When("^they click on the 'Cancel' option with  unsaved changes$")
	public void they_click_on_the_Cancel_option_with_unsaved_changes() throws Throwable {
		try {
			webElementClear(pages.pageConfigManagers().getFirstNameField());
			webElementClick(pages.pageConfigManagers().getCancelButton());
		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to locate cancel button." + "\n" + exception.getMessage());
		}
	}

	@When("^user navigate to Speciality List page$")
	public void user_nvaigate_to_Speciality_List_page() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getMenubarSettings());
			Thread.sleep(5000);
			webElementClick(pages.pageConfigManagers().getSpecialityListHorizontalMenu());

		}
		catch (Exception exception) {
			throw new Exception("Wrong page redirection" + "\n" + exception.getMessage());
		}
	}

	@When("^user add speciality item for clinician$")
	public void user_add_speciality_item_for_clinician() throws Throwable {
		String speciality = "Plantologist";
		try {
			// click settings in the menu
			webElementClick(pages.pageConfigManagers().getMenubarSettings());
			// check and click speciality in the horizontal menu
			waitUntilWebElementVisible(pages.pageConfigManagers().getSpecialityListHorizontalMenu());
			webElementClick(pages.pageConfigManagers().getSpecialityListHorizontalMenu());
			// check and click on the add speciality
			scrollToWebElement(pages.pageConfigManagers().getClinicianSpecialityRegisteredNurse());
			waitUntilWebElementVisible(pages.pageConfigManagers().getAddClinicianSpeciality());
			webElementClick(pages.pageConfigManagers().getAddClinicianSpeciality());
			// check save and cancel speciality
			waitUntilWebElementVisible(pages.pageConfigManagers().getSaveAddClinicianSpeciality());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getSaveAddClinicianSpeciality()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getCancelAddClinicianSpeciality()));
			// enter speciality
			webElementClick(pages.pageConfigManagers().getInputClinicianSpeciality());
			webElementSendKeys(pages.pageConfigManagers().getInputClinicianSpeciality(), speciality);
			// save speciality
			webElementClick(pages.pageConfigManagers().getSaveAddClinicianSpeciality());

		}
		catch (Exception exception) {
			throw new Exception("No clinician speciality was added" + "\n" + exception.getMessage());
		}
	}

	@When("^user edits an speciality for clinician$")
	public void user_edits_an_speciality_for_clinician() throws Throwable {

		String speciality = "Biologist";

		try {
			// click settings in the menu
			webElementClick(pages.pageConfigManagers().getMenubarSettings());
			// check and click speciality in the horizontal menu
			waitUntilWebElementVisible(pages.pageConfigManagers().getSpecialityListHorizontalMenu());
			webElementClick(pages.pageConfigManagers().getSpecialityListHorizontalMenu());
			// click on the speciality to be edited
			webElementClick(pages.pageConfigManagers().getClinicianSpecialityPlantologist());
			// edit value for the exsting speciality
			waitUntilWebElementVisible(pages.pageConfigManagers().getAddClinicianSpeciality());
			webElementClear(pages.pageConfigManagers().getClinicianSpecialityPlantologist());
			webElementSendKeys(pages.pageConfigManagers().getClinicianSpecialityPlantologist(), speciality);
			// save speciality
			webElementClick(pages.pageConfigManagers().getSaveAddClinicianSpeciality());

		}
		catch (Exception exception) {
			throw new Exception("No clinician speciality was edited" + "\n" + exception.getMessage());
		}

	}

	@When("^user add speciality item for treatment$")
	public void user_add_speciality_item_for_treatment() throws Throwable {
		String speciality = "Surgery - Cells";
		try {
			// click settings in the menu
			webElementClick(pages.pageConfigManagers().getMenubarSettings());

			// check and click treatment speciality in the horizontal menu
			waitUntilWebElementVisible(pages.pageConfigManagers().getSpecialityListHorizontalMenu());
			webElementClick(pages.pageConfigManagers().getSpecialityListHorizontalMenu());

			// check and click on the add treatment speciality
			scrollToBottom();
			waitUntilWebElementVisible(pages.pageConfigManagers().getAddTreatmentSpeciality());
			webElementClick(pages.pageConfigManagers().getAddTreatmentSpeciality());

			// check save and cancel treatment speciality
			waitUntilWebElementVisible(pages.pageConfigManagers().getSaveAddTreatmentSpeciality());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getSaveAddTreatmentSpeciality()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getCancelAddTreatmentSpeciality()));

			// enter treatment speciality
			webElementClick(pages.pageConfigManagers().getInputTreatmentSpeciality());
			webElementSendKeys(pages.pageConfigManagers().getInputTreatmentSpeciality(), speciality);

			// save treatment speciality
			webElementClick(pages.pageConfigManagers().getSaveAddTreatmentSpeciality());

		}
		catch (Exception exception) {
			throw new Exception("No treatment speciality was added" + "\n" + exception.getMessage());
		}
	}

	@When("^user edits a speciality for treatment$")
	public void user_edits_a_speciality_for_treatment() throws Throwable {
		String speciality = "Surgery - Plastics";

		try {
			// click settings in the menu
			webElementClick(pages.pageConfigManagers().getMenubarSettings());
			// check and click speciality in the horizontal menu
			waitUntilWebElementVisible(pages.pageConfigManagers().getSpecialityListHorizontalMenu());
			webElementClick(pages.pageConfigManagers().getSpecialityListHorizontalMenu());
			// click on the treatment speciality to be edited
			scrollToWebElement(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastic());
			webElementClick(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastic());
			// edit value for the exsting treatment speciality
			waitUntilWebElementVisible(pages.pageConfigManagers().getSaveAddTreatmentSpeciality());
			webElementClear(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastic());
			webElementSendKeys(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastic(), speciality);
			// save treatment speciality
			webElementClick(pages.pageConfigManagers().getSaveAddTreatmentSpeciality());

		}
		catch (Exception exception) {
			throw new Exception("No treatment speciality was edited" + "\n" + exception.getMessage());
		}
	}

	@When("^user add speciality item for appointment$")
	public void user_add_speciality_item_for_appointment() throws Throwable {
		String speciality = "Sociologist";
		try {
			// click settings in the menu
			webElementClick(pages.pageConfigManagers().getMenubarSettings());

			// check and click treatment speciality in the horizontal menu
			waitUntilWebElementVisible(pages.pageConfigManagers().getSpecialityListHorizontalMenu());
			webElementClick(pages.pageConfigManagers().getSpecialityListHorizontalMenu());

			// check and click on the add treatment speciality
			scrollToWebElement(pages.pageConfigManagers().getAppointmentSpecialityUrologist());
			waitUntilWebElementVisible(pages.pageConfigManagers().getAddAppointmentSpeciality());
			webElementClick(pages.pageConfigManagers().getAddAppointmentSpeciality());

			// check save and cancel treatment speciality
			waitUntilWebElementVisible(pages.pageConfigManagers().getSaveAddAppointmentSpeciality());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getSaveAddAppointmentSpeciality()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getCancelAddAppointmentSpeciality()));

			// enter treatment speciality
			webElementClick(pages.pageConfigManagers().getInputAppointmentSpeciality());
			webElementSendKeys(pages.pageConfigManagers().getInputAppointmentSpeciality(), speciality);

			// save treatment speciality
			webElementClick(pages.pageConfigManagers().getSaveAddAppointmentSpeciality());

		}
		catch (Exception exception) {
			throw new Exception("No treatment speciality was added" + "\n" + exception.getMessage());
		}
	}

	@When("^user edits a speciality for appointment$")
	public void user_edits_a_speciality_for_appointment() throws Throwable {
		String speciality = "Sociologistic";

		try {
			// click settings in the menu
			webElementClick(pages.pageConfigManagers().getMenubarSettings());
			// check and click speciality in the horizontal menu
			waitUntilWebElementVisible(pages.pageConfigManagers().getSpecialityListHorizontalMenu());
			webElementClick(pages.pageConfigManagers().getSpecialityListHorizontalMenu());
			// click on the treatment speciality to be edited
			scrollToWebElement(pages.pageConfigManagers().getAppointmentSpecialityRO());
			webElementClick(pages.pageConfigManagers().getAppointmentSpecialitySociologist());
			// edit value for the exsting treatment speciality
			waitUntilWebElementVisible(pages.pageConfigManagers().getSaveAddAppointmentSpeciality());
			webElementClear(pages.pageConfigManagers().getAppointmentSpecialitySociologist());
			webElementSendKeys(pages.pageConfigManagers().getAppointmentSpecialitySociologist(), speciality);
			// save treatment speciality
			webElementClick(pages.pageConfigManagers().getSaveAddAppointmentSpeciality());

		}
		catch (Exception exception) {
			throw new Exception("No treatment speciality was edited" + "\n" + exception.getMessage());
		}
	}

	// ################################################## Then Steps ###################################################
	@Then("^edited appointment speciality is displayed in the table$")
	public void edited_appointment_speciality_is_displayed_in_the_table() throws Throwable {
		String speciality1 = "Sociologist";
		try {

			// checks for the edited treatment speciality if displayed
			waitUntilWebElementVisible(pages.pageConfigManagers().getAppointmentSpecialitySociologistic());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getAppointmentSpecialitySociologistic()));
			// Scenario: Cancel edit
			// click on the treatment speciality to be edited
			webElementClick(pages.pageConfigManagers().getAppointmentSpecialitySociologistic());
			// click on cancel edit
			webElementClick(pages.pageConfigManagers().getCancelAddAppointmentSpeciality());
			// checks on value if still exist
			waitUntilWebElementVisible(pages.pageConfigManagers().getAppointmentSpecialitySociologistic());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getAppointmentSpecialitySociologistic()));

			// ----------------------------------------- Revert Steps for WHEN steps of Scenario 4 -----------------------------------------
			// click on the treatment speciality to be edited
			webElementClick(pages.pageConfigManagers().getAppointmentSpecialitySociologistic());
			// edit value for the exsting treatment speciality
			waitUntilWebElementVisible(pages.pageConfigManagers().getSaveAddAppointmentSpeciality());
			webElementClear(pages.pageConfigManagers().getAppointmentSpecialitySociologistic());
			webElementSendKeys(pages.pageConfigManagers().getAppointmentSpecialitySociologistic(), speciality1);
			// save treatment speciality
			webElementClick(pages.pageConfigManagers().getSaveAddAppointmentSpeciality());
			// checks for the edited treatment speciality if displayed
			waitUntilWebElementVisible(pages.pageConfigManagers().getAppointmentSpecialitySociologist());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getAppointmentSpecialitySociologist()));

		}
		catch (Exception exception) {
			throw new Exception("Edited appointment speciality is not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^an error message is displayed for add appointment speciality$")
	public void an_error_message_is_displayed_for_add_appointment_speciality() throws Throwable {
		try {
			// check and click on add treatment speciality
			Thread.sleep(5000);
			webElementClick(pages.pageConfigManagers().getAddAppointmentSpeciality());
			// click on save treatment speciality
			waitUntilWebElementVisible(pages.pageConfigManagers().getSaveAddAppointmentSpeciality());
			webElementClick(pages.pageConfigManagers().getSaveAddAppointmentSpeciality());
			// check on in field validation
			waitUntilWebElementVisible(pages.pageConfigManagers().getAddAppointmentSpecialityValidation());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getAddAppointmentSpecialityValidation()));

		}
		catch (Exception exception) {
			throw new Exception("Error message is not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^appointment speciality table is displayed$")
	public void appointment_speciality_table_is_displayed() throws Throwable {
		try {
			scrollToWebElement(pages.pageConfigManagers().getAddPatientMedInfoSpeciality());
			waitUntilWebElementVisible(pages.pageConfigManagers().getAddPatientMedInfoSpeciality());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getSpecialityAppointmentTable()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getAppointmentSpecialityNameColumn()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getAppointmentSpecialitySelectAllColumn()));

			if (isWebElementDisplayed(pages.pageConfigManagers().getAppointmentSpecialitySelectAllCheckbox())) {
				assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getAppointmentSpecialitySelectAllCheckbox()));
			}
			else if (isWebElementDisplayed(pages.pageConfigManagers().getAppointmentSpecialityDeselectAllCheckbox())) {
				waitUntilWebElementVisible(pages.pageConfigManagers().getAppointmentSpecialityDeselectAllCheckbox());
				webElementClick(pages.pageConfigManagers().getAppointmentSpecialityDeselectAllCheckbox());
				waitUntilWebElementVisible(pages.pageConfigManagers().getAppointmentSpecialitySelectAllCheckbox());
				assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getAppointmentSpecialitySelectAllCheckbox()));
			}

		}
		catch (Exception exception) {
			throw new Exception("Table objects are not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^edited treatment speciality is displayed in the table$")
	public void edited_treatment_speciality_is_displayed_in_the_table() throws Throwable {
		String speciality1 = "Surgery - Plastic";
		try {

			// checks for the edited treatment speciality if displayed
			waitUntilWebElementVisible(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastics());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastics()));
			// Scenario: Cancel edit
			// click on the treatment speciality to be edited
			webElementClick(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastics());
			// click on cancel edit
			webElementClick(pages.pageConfigManagers().getCancelAddTreatmentSpeciality());
			// checks on value if still exist
			waitUntilWebElementVisible(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastics());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastics()));

			// ----------------------------------------- Revert Steps for WHEN steps of Scenario 4 -----------------------------------------
			// click on the treatment speciality to be edited
			webElementClick(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastics());
			// edit value for the exsting treatment speciality
			waitUntilWebElementVisible(pages.pageConfigManagers().getSaveAddTreatmentSpeciality());
			webElementClear(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastics());
			webElementSendKeys(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastics(), speciality1);
			// save treatment speciality
			webElementClick(pages.pageConfigManagers().getSaveAddTreatmentSpeciality());
			// checks for the edited treatment speciality if displayed
			waitUntilWebElementVisible(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastic());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getTreatmentSpecialitySurgeryPlastic()));

		}
		catch (Exception exception) {
			throw new Exception("Edited treatment speciality is not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^an error message is displayed for add treatment speciality$")
	public void an_error_message_is_displayed_for_add_treatment_speciality() throws Throwable {
		try {
			// check and click on add treatment speciality
			Thread.sleep(5000);
			webElementClick(pages.pageConfigManagers().getAddTreatmentSpeciality());
			// click on save treatment speciality
			waitUntilWebElementVisible(pages.pageConfigManagers().getSaveAddTreatmentSpeciality());
			webElementClick(pages.pageConfigManagers().getSaveAddTreatmentSpeciality());
			// check on in field validation
			waitUntilWebElementVisible(pages.pageConfigManagers().getAddTreatmentSpecialityValidation());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getAddTreatmentSpecialityValidation()));

		}
		catch (Exception exception) {
			throw new Exception("Error message is not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^treatment speciality table is displayed$")
	public void treatment_speciality_table_is_displayed() throws Throwable {
		try {
			scrollToWebElement(pages.pageConfigManagers().getAddAppointmentSpeciality());
			waitUntilWebElementVisible(pages.pageConfigManagers().getAddAppointmentSpeciality());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getSpecialityTreatmentTable()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getTreatmentSpecialityNameColumn()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getTreatmentSpecialitySelectAllColumn()));

			if (isWebElementDisplayed(pages.pageConfigManagers().getTreatmentSpecialitySelectAllCheckbox())) {
				assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getTreatmentSpecialitySelectAllCheckbox()));
			}
			else if (isWebElementDisplayed(pages.pageConfigManagers().getTreatmentSpecialityDeselectAllCheckbox())) {
				waitUntilWebElementVisible(pages.pageConfigManagers().getTreatmentSpecialityDeselectAllCheckbox());
				webElementClick(pages.pageConfigManagers().getTreatmentSpecialityDeselectAllCheckbox());
				waitUntilWebElementVisible(pages.pageConfigManagers().getTreatmentSpecialitySelectAllCheckbox());
				assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getTreatmentSpecialitySelectAllCheckbox()));
			}

		}
		catch (Exception exception) {
			throw new Exception("Table objects are not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^edited speciality is displayed in the table$")
	public void edited_speciality_is_displayed_in_the_table() throws Throwable {
		String speciality1 = "Plantologist";
		try {

			// checks for the edited speciality if displayed
			waitUntilWebElementVisible(pages.pageConfigManagers().getClinicianSpecialityBiologist());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getClinicianSpecialityBiologist()));
			// Scenario: Cancel edit
			// click on the speciality to be edited
			webElementClick(pages.pageConfigManagers().getClinicianSpecialityBiologist());
			// click on cancel edit
			webElementClick(pages.pageConfigManagers().getCancelAddClinicianSpeciality());
			// checks on value if still exist
			waitUntilWebElementVisible(pages.pageConfigManagers().getClinicianSpecialityBiologist());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getClinicianSpecialityBiologist()));

			// ----------------------------------------- Revert Steps for WHEN steps of Scenario 4 -----------------------------------------
			// click on the speciality to be edited
			webElementClick(pages.pageConfigManagers().getClinicianSpecialityBiologist());
			// edit value for the exsting speciality
			waitUntilWebElementVisible(pages.pageConfigManagers().getAddClinicianSpeciality());
			webElementClear(pages.pageConfigManagers().getClinicianSpecialityBiologist());
			webElementSendKeys(pages.pageConfigManagers().getClinicianSpecialityBiologist(), speciality1);
			// save speciality
			webElementClick(pages.pageConfigManagers().getSaveAddClinicianSpeciality());
			// checks for the edited speciality if displayed
			waitUntilWebElementVisible(pages.pageConfigManagers().getClinicianSpecialityPlantologist());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getClinicianSpecialityPlantologist()));

		}
		catch (Exception exception) {
			throw new Exception("Edited speciality is not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^an error message is displayed$")
	public void an_error_message_is_displayed() throws Throwable {
		try {
			// check and click on add speciality
			scrollToWebElement(pages.pageConfigManagers().getClinicianSpecialityRegisteredNurse());
			waitUntilWebElementVisible(pages.pageConfigManagers().getAddClinicianSpeciality());
			webElementClick(pages.pageConfigManagers().getAddClinicianSpeciality());
			// click on save speciality
			waitUntilWebElementVisible(pages.pageConfigManagers().getSaveAddClinicianSpeciality());
			webElementClick(pages.pageConfigManagers().getSaveAddClinicianSpeciality());
			// check on in field validation
			waitUntilWebElementVisible(pages.pageConfigManagers().getAddClinicianSpecialityValidation());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getAddClinicianSpecialityValidation()));

		}
		catch (Exception exception) {
			throw new Exception("Error message is not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^speciality table is displayed$")
	public void speciality_table_is_displayed() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getSpecialityClinicianTable()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getClinicianSpecialityNameColumn()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getClinicianSpecialitySelectAllColumn()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getClinicianSpecialitySelectAllCheckbox()));

		}
		catch (Exception exception) {
			throw new Exception("Table objects are not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^horizontal menu is displayed$")
	public void horizontal_menu_is_displayed() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.pageConfigManagers().getGeneralHorizontalMenu());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getGeneralHorizontalMenu()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getSpecialityListHorizontalMenu()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getWellnessCheckHorizontalMenu()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Menu is not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^the browser's prompt message is displayed stating \"([^\"]*)\"$")
	public void the_browser_s_prompt_message_is_displayed_stating(String arg1) throws Throwable {
		try {
			waitUntilWebElementVisible(pages.pageConfigManagers().getUnsaveChangespopupLabel());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getUnsaveChangespopupLabel()));

		}
		catch (AssertionError exception) {
			throw new AssertionError("There is no pop up for unsaved changes appeared." + "\n" + exception.getMessage());
		}
	}

	@Then("^following feedback success message Saved Successfully is displayed$")
	public void following_feedback_success_message_Saved_Successfully_is_displayed() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.pageConfigManagers().getSuccessMessageLabel());

			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getSuccessMessageLabel()));
			webElementClick(pages.pageConfigManagers().getOkayButton());
		}
		catch (AssertionError exception) {
			throw new AssertionError("THere is no success message appeared." + "\n" + exception.getMessage());
		}
	}

	@Then("^they will be taken to the edit Clinician Manager page with First name, Last name, email fields$")
	public void they_will_be_taken_to_the_edit_Clinician_Manager_page_with_First_name_Last_name_email_fields() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.pageConfigManagers().getEditClinicianManagerLabel());
			assertEquals("Clinician Manager Details", getPageTitle());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getFirstNameField()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getLastNameField()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getEmailReadOnlyField()));

		}
		catch (AssertionError exception) {
			throw new AssertionError("validations on required field is missing" + "\n" + exception.getMessage());
		}
	}

	// ################################################## Then Steps ###################################################
	@Then("^they will be taken to the EDIT Clinician Manager page with First name, Last name, email fields$")
	public void they_will_be_taken_to_the_EDIT_Clinician_Manager_page_with_First_name_Last_name_email_fields() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.pageConfigManagers().getEditClinicianManagerLabel());
			assertEquals("Clinician Manager Details", getPageTitle());

		}
		catch (AssertionError exception) {
			throw new AssertionError("validations on required field is missing" + "\n" + exception.getMessage());
		}
	}

	@Then("^user sees validations on all required fields$")
	public void user_sees_validations_on_all_required_fields() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.pageConfigManagers().getEmptyCreateAdmiEmailValidation());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getEmptyCreateAdminFirstNameValidation()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getEmptyCreateAdminLastNameValidation()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getEmptyCreateAdmiEmailValidation()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("validations on required field is missing" + "\n" + exception.getMessage());
		}
	}

	@Then("^user is redirected back to list view of Admins$")
	public void user_is_redirected_back_to_list_view_of_Admins() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.pageConfigManagers().getlabelClinicianManager());
			assertTrue(isXPathNotExisting("//span[text()='Create Clinician manager']"));
			assertFalse(isXPathNotExisting("//span[text()='Clinician managers']"));

		}
		catch (AssertionError exception) {
			throw new AssertionError("User is not redirected back to list of admin page" + "\n" + exception.getMessage());
		}
	}

	@Then("^the browser's prompt message for unsaved changes is displayed$")
	public void the_browser_s_prompt_message_for_unsaved_changes_is_displayed() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getUnsaveChangespopupLabel()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getUnsaveChangespopupButtonYES()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getUnsaveChangespopupButtonNO()));

		}
		catch (AssertionError exception) {
			throw new AssertionError("Prompt message for unsaved changes is not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^the browser's prompt message for unsaved changes will be hidden$")
	public void the_browser_s_prompt_message_for_unsaved_changes_will_be_hidden() throws Throwable {
		try {
			assertFalse(!isWebElementDisplayed(pages.pageConfigManagers().getUnsaveChangespopupLabel()));
			assertFalse(!isWebElementDisplayed(pages.pageConfigManagers().getUnsaveChangespopupButtonYES()));
			assertFalse(!isWebElementDisplayed(pages.pageConfigManagers().getUnsaveChangespopupButtonNO()));

		}
		catch (AssertionError exception) {
			throw new AssertionError("Prompt message for unsaved changes is still displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^profile name with caret down icon is displayed on the profile menu corner$")
	public void profile_name_with_caret_down_icon_is_displayed_on_the_profile_menu_corner() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getProfileNameWelcome()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getProfileMenuCaretDownIcon()));

		}
		catch (AssertionError exception) {
			throw new AssertionError("Profile name is not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^columns for admins list is complete$")
	public void columns_for_admins_list_is_complete() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getcolumnLastNameLabel()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getcolumnFirstNameLabel()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getcolumnEmailLabel()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getcolumnStatusLabel()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Columns inside the admins table is incomplete" + "\n" + exception.getMessage());
		}
	}

	@Then("^field for creating admin is complete$")
	public void field_for_creating_admin_is_complete() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getCreateAdminFirstNameField()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getCreateAdminLastNameField()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getCreateAdminEmailField()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Fields inside the creation of admin is incomplete" + "\n" + exception.getMessage());
		}
	}
}