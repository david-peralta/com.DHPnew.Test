package steps;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Base;
import pages.Pages;

public class Steps_ClinicianManagers extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();

	// ################################################## Given Steps ##################################################

	@Given("^config manager select a clinician manager$")
	public void config_manager_select_a_clinician_manager() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			getCurrentUrl().contains(properties.getProperty("url"));
			webElementClick(pages.getPageHome().getLogInButton());

			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(), properties.getProperty("ConfigManagerEmail"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(), properties.getProperty("ConfigManagerPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());

			waitUntilWebElementVisible(pages.getPageClinicianManagers().getButtonCreate());

			scrollToCoordinates(0, 300);
			webElementClick(pages.getPageClinicianManagers().getLabelClinicianManager());

			webElementClick(pages.getPageClinicianDetails().getButtonActivate());
			waitUntilWebElementVisible(pages.getPageClinicianDetails().getPopupActivated());
			webElementClick(pages.getPageClinicianDetails().getButtonConfirm2());

			webElementClick(pages.pageConfigManagers().getMenubarAdmin());
			waitUntilWebElementVisible(pages.getPageClinicianManagers().getLabelClinicianManager());
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianManagers().getLabelClinicianManager()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to select clinician manager" + "\n" + exception.getMessage());
		}
	}

	// ################################################## When Steps ###################################################

	@When("^user clicks a clinicians manager$")
	public void user_clicks_status_filter_in_clinicians_manager() throws Throwable {
		try {
			scrollToCoordinates(0, 500);
			webElementClick(pages.getPageClinicianManagers().getLabelClinicianManager());
		}
		catch (Exception exception) {
			throw new Exception("Unable to click Clinician Manager" + "\n" + exception.getMessage());
		}
	}

	@When("^they click on user accounts$")
	public void they_click_on_user_account() throws Throwable {
		try {
			webElementClick(pages.getPageClinicianManagers().getImageUserAccount());
			waitUntilWebElementVisible(pages.getPageClinicianManagers().getLinkChangePassword());
			webElementClick(pages.getPageClinicianManagers().getLinkChangePassword());

		}
		catch (Exception exception) {
			throw new Exception("Cannot click on user info" + "\n" + exception.getMessage());
		}
	}

	// ################################################## Then Steps ###################################################

	@Then("^sees a clinician manager that is deactived$")
	public void sees_a_clinician_manager_that_is_deactived() throws Throwable {
		try {
			scrollToCoordinates(0, 500);
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianManagers().getDeactivatedUser()));
			webElementClick(pages.getPageClinicianManagers().getLabelClinicianManager());
		}
		catch (AssertionError exception) {
			throw new AssertionError("There is no clinician manager selected" + "\n" + exception.getMessage());
		}
	}

	@Then("^sees clinician manager is deactived$")
	public void sees_clinician_manager_is_deactived() throws Throwable {
		try {
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianManagers().getDeactivatedUser()));

		}
		catch (AssertionError exception) {
			throw new AssertionError("Logo is not visible" + "\n" + exception.getMessage());
		}
	}

	@Then("^sees clinician manager status will be presented as deactivated$")
	public void sees_clinician_manager_status_will_be_presented_as_deactivated() throws Throwable {
		try {
			scrollToCoordinates(0, 800);
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianManagers().getDeactivatedUser()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Logo is not visible" + "\n" + exception.getMessage());
		}
	}

}