package steps;


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

	// ################################################## Given Steps
	// ##################################################
	@Given("^the user is on configuration managers landing page$")
	public void the_user_is_on_configuration_managers_landing_page() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			webElementClick(pages.getPageHome().getLogInButton());
			Thread.sleep(5000);
			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(),
					properties.getProperty("ConfigManagerEmail"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(),
					properties.getProperty("ConfigManagerPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());
//			waitUntilWebElementVisible(pages.getpage);
//			assert.assertEquals(getPageTitle(), actual);
		} catch (AssertionError exception) {
			throw new AssertionError(
					"Cannot proceed to clinicians manager landing page." + "\n" + exception.getMessage());
		}
	}

	// ################################################## When Steps
	// ###################################################
	@When("^user clicks on settings menubar$")
	public void user_clicks_on_settings_menubar() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getMenubarSettings());
			Thread.sleep(5000);
		} catch (Exception exception) {
			throw new Exception("Unable to locate settings menubar." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks on admin menubar$")
	public void user_clicks_on_admin_menubar() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getMenubarAdmin());
			Thread.sleep(5000);
		} catch (Exception exception) {
			throw new Exception("Unable to locate admin menubar." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks on create admin button inside the admin creation page$")
	public void user_clicks_on_create_admin_button_inside_the_admin_creation_page() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getCreateAdminConfigManagerButton());
			waitUntilWebElementVisible(pages.pageConfigManagers().getCreateAdminEmailField());
		} catch (Exception exception) {
			throw new Exception("Unable to locate create admin button." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks cancel button inside the admin creation page$")
	public void user_clicks_cancel_button_inside_the_admin_creation_page() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getCancelAdminConfigManagerButton());
			waitUntilWebElementVisible(pages.pageConfigManagers().getUnsaveChangespopupLabel());
		} catch (Exception exception) {
			throw new Exception("Unable to locate cancel button." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks no on prompt message for unsaved changes$")
	public void user_clicks_no_on_prompt_message_for_unsaved_changes() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getUnsaveChangespopupButtonNO());
		} catch (Exception exception) {
			throw new Exception("Unable to locate no  button." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks yes on prompt message for unsaved changes$")
	public void user_clicks_yes_on_prompt_message_for_unsaved_changes() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getUnsaveChangespopupButtonYES());
		} catch (Exception exception) {
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
			
			//assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getCreationSuccesspopupLabel()));
			// switchFrameByXPath("//span[text()='Account successfully created.']");

			webElementClick(pages.pageConfigManagers().getCreationSuccesspopupButton());

		} catch (AssertionError exception) {
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

		} catch (AssertionError exception) {
			throw new AssertionError("Unable to create administrator." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks on cancel admin button inside the admin creation page$")
	public void user_clicks_on_cancel_admin_button_inside_the_admin_creation_page() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getCancelAdminConfigManagerButton());
			Thread.sleep(5000);
		} catch (Exception exception) {
			throw new Exception("Unable to locate create admin button." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks on create admin button$")
	public void user_clicks_on_create_admin_button() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getCreateAdminConfigManagerButton());
			Thread.sleep(5000);
		} catch (Exception exception) {
			throw new Exception("Unable to locate create admin button." + "\n" + exception.getMessage());
		}
	}

	@When("^user logsout the configuration managers page$")
	public void user_logsout_the_configuration_managers_page() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getMenubarLogout());
			Thread.sleep(5000);
			switchFrameByXPath("//input[contains(@id,'Button_Yes')]");
			webElementClick(pages.pageConfigManagers().getYesMeLogout());
			Thread.sleep(1000);
			webDriver.quit();
		} catch (Exception exception) {
			throw new Exception("Unable to locate logout menubar." + "\n" + exception.getMessage());
		}
	}

	@When("^user logsout the configuration managers page without closing the browser$")
	public void user_logsout_the_configuration_managers_page_without_closing_the_browser() throws Throwable {
		try {
			webElementClick(pages.pageConfigManagers().getMenubarLogout());
			Thread.sleep(5000);
			switchFrameByXPath("//input[contains(@id,'Button_Yes')]");
			webElementClick(pages.pageConfigManagers().getYesMeLogout());
			Thread.sleep(1000);
		} catch (Exception exception) {
			throw new Exception("Unable to locate logout menubar." + "\n" + exception.getMessage());
		}
	}

	@When("^user logsout the configuration managers page using profile menu without closing the browser$")
	public void user_logsout_the_configuration_managers_page_using_profile_menu_without_closing_the_browser()
			throws Throwable {
		try {

			webElementClick(pages.pageConfigManagers().getProfileMenuButton());
			Thread.sleep(5000);
			webElementClick(pages.pageConfigManagers().getProfileMenuLogoutLink());
			Thread.sleep(5000);
			switchFrameByXPath("//input[contains(@id,'Button_Yes')]");
			webElementClick(pages.pageConfigManagers().getYesMeLogout());
			Thread.sleep(1000);
		} catch (Exception exception) {
			throw new Exception("Unable to locate logout on profile menu." + "\n" + exception.getMessage());
		}
	}

	// ################################################## Then Steps
	// ###################################################

	@Then("^user sees validations on all required fields$")
	public void user_sees_validations_on_all_required_fields() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.pageConfigManagers().getEmptyCreateAdmiEmailValidation());
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getEmptyCreateAdminFirstNameValidation()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getEmptyCreateAdminLastNameValidation()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getEmptyCreateAdmiEmailValidation()));
		} catch (AssertionError exception) {
			throw new AssertionError("validations on required field is missing" + "\n" + exception.getMessage());
		}
	}

	@Then("^user is redirected back to list view of Admins$")
	public void user_is_redirected_back_to_list_view_of_Admins() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.pageConfigManagers().getlabelClinicianManager());
			assertTrue(isXPathNotExisting("//span[text()='Create Clinician manager']"));
			assertFalse(isXPathNotExisting("//span[text()='Clinician managers']"));

		} catch (AssertionError exception) {
			throw new AssertionError(
					"User is not redirected back to list of admin page" + "\n" + exception.getMessage());
		}
	}

	@Then("^the browser's prompt message for unsaved changes is displayed$")
	public void the_browser_s_prompt_message_for_unsaved_changes_is_displayed() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getUnsaveChangespopupLabel()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getUnsaveChangespopupButtonYES()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getUnsaveChangespopupButtonNO()));

		} catch (AssertionError exception) {
			throw new AssertionError(
					"Prompt message for unsaved changes is not displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^the browser's prompt message for unsaved changes will be hidden$")
	public void the_browser_s_prompt_message_for_unsaved_changes_will_be_hidden() throws Throwable {
		try {
			assertFalse(!isWebElementDisplayed(pages.pageConfigManagers().getUnsaveChangespopupLabel()));
			assertFalse(!isWebElementDisplayed(pages.pageConfigManagers().getUnsaveChangespopupButtonYES()));
			assertFalse(!isWebElementDisplayed(pages.pageConfigManagers().getUnsaveChangespopupButtonNO()));

		} catch (AssertionError exception) {
			throw new AssertionError(
					"Prompt message for unsaved changes is still displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^profile name with caret down icon is displayed on the profile menu corner$")
	public void profile_name_with_caret_down_icon_is_displayed_on_the_profile_menu_corner() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getProfileNameWelcome()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getProfileMenuCaretDownIcon()));

		} catch (AssertionError exception) {
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
		} catch (AssertionError exception) {
			throw new AssertionError("Columns inside the admins table is incomplete" + "\n" + exception.getMessage());
		}
	}

	@Then("^field for creating admin is complete$")
	public void field_for_creating_admin_is_complete() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getCreateAdminFirstNameField()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getCreateAdminLastNameField()));
			assertTrue(isWebElementDisplayed(pages.pageConfigManagers().getCreateAdminEmailField()));
		} catch (AssertionError exception) {
			throw new AssertionError(
					"Fields inside the creation of admin is incomplete" + "\n" + exception.getMessage());
		}
	}
}