package steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Base;
import pages.Pages;

public class Steps_Settings extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();

	// ################################################## Given Steps
	// ##################################################

	// ################################################## When Steps
	// ###################################################
	@When("^user clicks on general horizontal tab$")
	public void user_clicks_on_general_horizontal_tab() throws Throwable {
		try {
			webElementClick(pages.getPageSettings().getHorizontaltabGeneral());
			Thread.sleep(5000);
		} catch (Exception exception) {
			throw new Exception("Unable to locate General Horizontal tab." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks on wellness check horizontal tab$")
	public void user_clicks_on_wellness_check_horizontal_tab() throws Throwable {
		try {
			webElementClick(pages.getPageSettings().getHorizontaltabWellnessCheck());
			Thread.sleep(10000);
		} catch (Exception exception) {
			throw new Exception("Unable to locate Wellness check Horizontal tab." + "\n" + exception.getMessage());
		}
	}

	@When("^user clicks on select all checkbox inside the wellness check horizontal tab$")
	public void user_clicks_on_select_all_checkbox_inside_the_wellness_check_horizontal_tab() throws Throwable {
		try {
			if (isXPathNotExisting("//input[contains(@id,'WellnessCheckSelectAll') and @checked = 'checked']")) {
				webElementClick(pages.getPageSettings().getWellnessCheckSelectAll());
				Thread.sleep(5000);
			} else {
				Thread.sleep(100);
			}
		} catch (Exception exception) {
			throw new Exception(
					"Unable to click select all on Wellness check Horizontal tab." + "\n" + exception.getMessage());
		}
	}

	@When("^user disables question number one on wellness check$")
	public void user_disables_question_number_one_on_wellness_check() throws Throwable {
		try {
			if (isXPathNotExisting(
					"(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[1]//input[@type = 'checkbox' and @checked='checked']")) {
				Thread.sleep(100);
			} else {
				webElementClick(pages.getPageSettings().getWellnessCheckQuestion1());
				Thread.sleep(500);
				webElementClick(pages.getPageSettings().getWellnessCheckQuestion1Checkbox());
				Thread.sleep(500);
				webElementClick(pages.getPageSettings().getWellnessCheckCheckIcon());
			}
		} catch (Exception exception) {
			throw new Exception("Unable to disable question number one on wellness check settings page." + "\n"
					+ exception.getMessage());

		}

	}

	@Then("^user enables PSA toggle on info type settings page$")
	public void user_enables_PSA_toggle_on_info_type_settings_page() throws Throwable {
		try {
			if (isXPathNotExisting(
					"//input[@value='PSA']/ancestor::tr//input[@type = 'checkbox' and @checked='checked']")) {
				scrollToWebElement(pages.getPageSettings().getTimelineLabel());
				webElementClick(pages.getPageSettings().getPSAfield());
				waitUntilWebElementVisible(pages.getPageSettings().getWellnessCheckCheckIcon());
				webElementClick(pages.getPageSettings().getPSACheckbox());
				webElementClick(pages.getPageSettings().getWellnessCheckCheckIcon());
			}
		} catch (Exception exception) {
			throw new Exception("Unable to enable PSA." + "\n" + exception.getMessage());

		}
	}

	@Then("^user disables PSA toggle on info type settings page$")
	public void user_disables_PSA_toggle_on_info_type_settings_page() throws Throwable {
		try {
			if (!isXPathNotExisting(
					"//input[@value='PSA']/ancestor::tr//input[@type = 'checkbox' and @checked='checked']")) {
				scrollToWebElement(pages.getPageSettings().getTimelineLabel());
				webElementClick(pages.getPageSettings().getPSAfield());
				waitUntilWebElementVisible(pages.getPageSettings().getWellnessCheckCheckIcon());
				webElementClick(pages.getPageSettings().getPSACheckbox());
				webElementClick(pages.getPageSettings().getWellnessCheckCheckIcon());
			}
			scrollToWebElement(pages.getPageSettings().getButtonSave());
			Thread.sleep(5000);
			webElementClick(pages.getPageSettings().getButtonSave());
			Thread.sleep(5000);
		} catch (Exception exception) {
			throw new Exception("Unable to enable PSA." + "\n" + exception.getMessage());

		}
	}

	@When("^user disables question number two on wellness check$")
	public void user_disables_question_number_two_on_wellness_check() throws Throwable {
		try {
			if (isXPathNotExisting(
					"(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[2]//input[@type = 'checkbox' and @checked='checked']")) {
				Thread.sleep(100);
			} else {
				webElementClick(pages.getPageSettings().getWellnessCheckQuestion2());
				Thread.sleep(500);
				webElementClick(pages.getPageSettings().getWellnessCheckQuestion2Checkbox());
				Thread.sleep(500);
				webElementClick(pages.getPageSettings().getWellnessCheckCheckIcon());
			}
		} catch (Exception exception) {
			throw new Exception("Unable to disable question number two on wellness check settings page." + "\n"
					+ exception.getMessage());
		}
	}

	@When("^user disables question number three on wellness check$")
	public void user_disables_question_number_three_on_wellness_check() throws Throwable {
		try {
			if (isXPathNotExisting(
					"(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[3]//input[@type = 'checkbox' and @checked='checked']")) {
				Thread.sleep(100);
			} else {
				webElementClick(pages.getPageSettings().getWellnessCheckQuestion3());
				Thread.sleep(500);
				webElementClick(pages.getPageSettings().getWellnessCheckQuestion3Checkbox());
				Thread.sleep(500);
				webElementClick(pages.getPageSettings().getWellnessCheckCheckIcon());
			}
		} catch (Exception exception) {
			throw new Exception("Unable to disable question number three on wellness check settings page." + "\n"
					+ exception.getMessage());
		}
	}

	@When("^user disables question number four on wellness check$")
	public void user_disables_question_number_four_on_wellness_check() throws Throwable {
		try {
			if (isXPathNotExisting(
					"(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[4]//input[@type = 'checkbox' and @checked='checked']")) {
				Thread.sleep(100);
			} else {
				webElementClick(pages.getPageSettings().getWellnessCheckQuestion4());
				Thread.sleep(500);
				webElementClick(pages.getPageSettings().getWellnessCheckQuestion4Checkbox());
				Thread.sleep(500);
				webElementClick(pages.getPageSettings().getWellnessCheckCheckIcon());
			}
		} catch (Exception exception) {
			throw new Exception("Unable to disable question number four on wellness check settings page." + "\n"
					+ exception.getMessage());
		}
	}

	@When("^user disables question number five on wellness check$")
	public void user_disables_question_number_five_on_wellness_check() throws Throwable {
		try {
			if (isXPathNotExisting(
					"(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[5]//input[@type = 'checkbox' and @checked='checked']")) {
				Thread.sleep(100);
			} else {
				webElementClick(pages.getPageSettings().getWellnessCheckQuestion5());
				Thread.sleep(500);
				webElementClick(pages.getPageSettings().getWellnessCheckQuestion5Checkbox());
				Thread.sleep(500);
				webElementClick(pages.getPageSettings().getWellnessCheckCheckIcon());
			}
		} catch (Exception exception) {
			throw new Exception("Unable to disable question number five on wellness check settings page." + "\n"
					+ exception.getMessage());
		}
	}

	@When("^user toggles off health indicator option on settings page$")
	public void user_toggles_off_health_indicator_option_on_settings_page() throws Throwable {

		try {
			scrollToWebElement(pages.getPageSettings().getInfoTable());
			if (isXPathNotExisting("//input[contains(@id,'HealthIndicator') and @checked = 'checked']")) {
				scrollToWebElement(pages.getPageSettings().getButtonSave());
				Thread.sleep(5000);
				webElementClick(pages.getPageSettings().getButtonSave());
				Thread.sleep(5000);
			} else {
				webElementClick(pages.getPageSettings().getToggleHealthIndicator());
				Thread.sleep(5000);
				webElementClick(pages.getPageSettings().getButtonSave());
			}
		} catch (Exception exception) {
			throw new Exception("Unable to toggle on health indicator option" + "\n" + exception.getMessage());
		}
	}
	@When("^user toggles on health indicator option on settings page$")
	public void user_toggles_on_health_indicator_option_on_settings_page() throws Throwable {

		try {
			scrollToWebElement(pages.getPageSettings().getInfoTable());
			if (!isXPathNotExisting("//input[contains(@id,'HealthIndicator') and @checked = 'checked']")) {
				scrollToWebElement(pages.getPageSettings().getButtonSave());
				Thread.sleep(5000);
				webElementClick(pages.getPageSettings().getButtonSave());
				Thread.sleep(5000);
			} else {
				webElementClick(pages.getPageSettings().getToggleHealthIndicator());
				Thread.sleep(5000);
				scrollToWebElement(pages.getPageSettings().getButtonSave());
				Thread.sleep(5000);
				webElementClick(pages.getPageSettings().getButtonSave());
				Thread.sleep(5000);
			}
		} catch (Exception exception) {
			throw new Exception("Unable to toggle off health indicator option" + "\n" + exception.getMessage());
		}
	}
	// ################################################## Then Steps
	// ###################################################
	@Then("^user inputs \"([^\"]*)\" as question and \"([^\"]*)\" as graph legend for question number one$")
	public void user_inputs_as_question_and_as_graph_legend_for_question_number_one(String arg1, String arg2)
			throws Throwable {
		try {
			webElementClick(pages.getPageSettings().getWellnessCheckQuestion1());
			Thread.sleep(500);
			webElementClear(pages.getPageSettings().getWellnessCheckQuestion1Textbox());
			webElementSendKeys(pages.getPageSettings().getWellnessCheckQuestion1Textbox(), arg1);
			Thread.sleep(500);
			webElementClear(pages.getPageSettings().getWellnessCheckGraphLegend1Textbox());
			webElementSendKeys(pages.getPageSettings().getWellnessCheckGraphLegend1Textbox(), arg2);
			Thread.sleep(500);
			webElementClick(pages.getPageSettings().getWellnessCheckCheckIcon());
			Thread.sleep(5000);
		} catch (Exception exception) {
			throw new Exception(
					"Unable to edit question one of the wellness check details." + "\n" + exception.getMessage());
		}
	}

	@Then("^user reverts back values \"([^\"]*)\" as question and \"([^\"]*)\" as graph legend for question number one$")
	public void user_reverts_back_values_as_question_and_as_graph_legend_for_question_number_one(String arg1,
			String arg2) throws Throwable {
		try {
			webElementClick(pages.getPageSettings().getRevertWellnessCheckQuestion1Textbox());
			Thread.sleep(500);
			webElementClear(pages.getPageSettings().getRevertWellnessCheckQuestion1Textbox());
			webElementSendKeys(pages.getPageSettings().getRevertWellnessCheckQuestion1Textbox(), arg1);
			Thread.sleep(500);
			webElementClear(pages.getPageSettings().getRevertWellnessCheckGraphLegend1Textbox());
			webElementSendKeys(pages.getPageSettings().getRevertWellnessCheckGraphLegend1Textbox(), arg2);
			Thread.sleep(500);
			webElementClick(pages.getPageSettings().getWellnessCheckCheckIcon());
			Thread.sleep(5000);
		} catch (Exception exception) {
			throw new Exception(
					"Unable to edit question one of the wellness check details." + "\n" + exception.getMessage());
		}
	}

	@Then("^horizontal tabs on settings page is complete$")
	public void horizontal_tabs_on_settings_page_is_complete() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.getPageSettings().getHorizontaltabGeneral()));
			assertTrue(isWebElementDisplayed(pages.getPageSettings().getHorizontaltabSpecialityList()));
			assertTrue(isWebElementDisplayed(pages.getPageSettings().getHorizontaltabWellnessCheck()));
		} catch (AssertionError exception) {
			throw new AssertionError("Horizontal tabs on settings page is incomplete" + "\n" + exception.getMessage());
		}
	}

	@Then("^user checks if general horizontal tab is set to default$")
	public void user_checks_if_general_horizontal_tab_is_set_to_default() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.getPageSettings().getHorizontaltabGeneralDefault()));

		} catch (AssertionError exception) {
			throw new AssertionError("General horizontal tabs is not set to default" + "\n" + exception.getMessage());
		}
	}

	@Then("^user sees health indicator option$")
	public void user_sees_health_indicator_option() throws Throwable {
		try {
			assertTrue(isWebElementDisplayed(pages.getPageSettings().getlabel_HealthIndicator()));
			assertTrue(isWebElementDisplayed(pages.getPageSettings().getoptionHealthIndicatorGraph()));
			assertTrue(isWebElementDisplayed(pages.getPageSettings().getToggleHealthIndicator()));
		} catch (AssertionError exception) {
			throw new AssertionError("Unable to locate health indicator" + "\n" + exception.getMessage());
		}

	}

}