package steps;

import org.junit.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Base;
import pages.Pages;

public class Steps_ClinicianDetails extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();

	// ################################################## Given Steps ##################################################

	// ################################################## When Steps ###################################################
	@When("^user clicks on clinician to deactivate$")
	public void user_clicks_on_clinician_to_deactivate() throws Throwable {
		try {
			if (isWebElementDisplayed(pages.getPageClinicianDetails().getButtonDeactivate())) {
				webElementClick(pages.getPageClinicianDetails().getButtonDeactivate());
				waitUntilWebElementVisible(pages.getPageClinicianDetails().getPopupDeactivated());
				webElementClick(pages.getPageClinicianDetails().getButtonConfirm1());

				waitUntilWebElementVisible(pages.getPageClinicianDetails().getLabelDeactivated());
			}
			else if (isWebElementDisplayed(pages.getPageClinicianDetails().getButtonActivate())) {
				webElementClick(pages.getPageClinicianDetails().getButtonActivate());
				waitUntilWebElementVisible(pages.getPageClinicianDetails().getPopupActivated());
				webElementClick(pages.getPageClinicianDetails().getButtonConfirm2());
			}
		}
		catch (Exception exception) {
			throw new Exception("unable to deactivate clinician manager" + "\n" + exception.getMessage());
		}
	}

	@When("^user cancels on confirmation mesage$")
	public void user_cancels_on_confirmation_mesage() throws Throwable {
		try {

			if (isWebElementDisplayed(pages.getPageClinicianDetails().getButtonDeactivate())) {
				webElementClick(pages.getPageClinicianDetails().getButtonDeactivate());
				Assert.assertTrue(getWebElementCssValue(pages.getPageClinicianDetails().getButtonCancel1(), "background-color").contains("255, 255, 255, 1"));
				webElementClick(pages.getPageClinicianDetails().getButtonCancel1());
			}
			else if (isWebElementDisplayed(pages.getPageClinicianDetails().getButtonActivate())) {
				webElementClick(pages.getPageClinicianDetails().getButtonActivate());
				Assert.assertTrue(getWebElementCssValue(pages.getPageClinicianDetails().getButtonCancel1(), "background-color").contains("255, 255, 255, 1"));
				webElementClick(pages.getPageClinicianDetails().getButtonCancel2());
			}
		}
		catch (Exception exception) {
			throw new Exception("Cannot cancel confirmation message" + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks a clinicians manager to deactivate$")
	public void user_clicks_a_clinicians_manager_to_deactivate() throws Throwable {
		try {
			scrollToCoordinates(0, 300);
			webElementClick(pages.getPageClinicianManagers().getLabelClinicianManager());

			webElementClick(pages.getPageClinicianDetails().getButtonDeactivate());
			waitUntilWebElementVisible(pages.getPageClinicianDetails().getPopupDeactivated());
			webElementClick(pages.getPageClinicianDetails().getButtonConfirm1());

			waitUntilWebElementVisible(pages.getPageClinicianDetails().getLabelDeactivated());

		}
		catch (Exception exception) {
			throw new Exception("There are no buttons displayed" + "\n" + exception.getMessage());
		}
	}

	// ################################################## Then Steps ###################################################

	@Then("^checks if the buttons are displayed$")
	public void checks_if_the_buttons_are_displayed() throws Throwable {
		try {
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getButtonCancel()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getButtonDeactivate()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getButtonUpdate()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("There are no buttons displayed" + "\n" + exception.getMessage());
		}
	}

	@Then("^sees confirmation to deactivate user$")
	public void sees_confirmation_to_deactivate_user() throws Throwable {
		try {
			// switchFrameByXPath("//span[contains(text(),'Are you sure you want to deactivate this Admin?')]");
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getPopupDeactivated()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getButtonCancel1()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getButtonConfirm1()));
			Thread.sleep(3000);
			webElementClick(pages.getPageClinicianDetails().getButtonCancel1());
			Thread.sleep(3000);
			webElementClick(pages.getPageClinicianDetails().getButtonDeactivate());
			Thread.sleep(3000);
			webElementClick(pages.getPageClinicianDetails().getButtonConfirm1());
			Thread.sleep(3000);
		}
		catch (AssertionError exception) {
			throw new AssertionError("Cannot see confirmation to deactivate" + "\n" + exception.getMessage());
		}
	}

	@Then("^checks that clinician manager has been successfully deactivated$")
	public void checks_that_clinician_manager_has_been_successfully_deactivated() throws Throwable {
		try {
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getLabelDeactivated()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Clinician was not deativated successfully" + "\n" + exception.getMessage());
		}
	}

	@Then("^sees confirmation to activate user$")
	public void sees_confirmation_to_activate_user() throws Throwable {
		try {
			// switchFrameByXPath("//span[contains(text(),'Are you sure you want to deactivate this Admin?')]");
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getPopupActivated()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getButtonCancel2()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getButtonConfirm2()));
			Thread.sleep(3000);
			webElementClick(pages.getPageClinicianDetails().getButtonCancel2());
			Thread.sleep(3000);
			webElementClick(pages.getPageClinicianDetails().getButtonActivate());
			Thread.sleep(3000);
			webElementClick(pages.getPageClinicianDetails().getButtonConfirm2());
			Thread.sleep(3000);
		}
		catch (AssertionError exception) {
			throw new AssertionError("Cannot see confirmation to activate" + "\n" + exception.getMessage());
		}
	}

	@Then("^checks that clinician manager has been successfully activated$")
	public void checks_that_clinician_manager_has_been_successfully_activated() throws Throwable {
		try {
			Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getLabelActivated()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Clinician was not deativated successfully" + "\n" + exception.getMessage());
		}
	}

	@Then("^sees clinician manager status$")
	public void sees_clinician_manager_status() throws Throwable {
		try {
			if (isWebElementDisplayed(pages.getPageClinicianDetails().getButtonDeactivate())) {
				Assert.assertFalse(isWebElementDisplayed(pages.getPageClinicianDetails().getPopupDeactivated()));

				Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getButtonCancel()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getButtonDeactivate()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getButtonUpdate()));
			}
			else if (isWebElementDisplayed(pages.getPageClinicianDetails().getButtonActivate())) {
				Assert.assertFalse(isWebElementDisplayed(pages.getPageClinicianDetails().getPopupActivated()));

				Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getButtonCancel()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getButtonActivate()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageClinicianDetails().getButtonUpdate()));
			}
		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to check status of clinician manager" + "\n" + exception.getMessage());
		}
	}

}