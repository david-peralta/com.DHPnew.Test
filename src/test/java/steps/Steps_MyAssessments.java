
package steps;

import org.junit.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Base;
import pages.Pages;

public class Steps_MyAssessments extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();

	// ################################################## Given Steps ##################################################

	// ################################################## When Steps ###################################################

	@When("^they click start the assessment$")
	public void they_click_start_the_assessment() throws Throwable {
		try {
			webElementClick(pages.getPageMyInfo().getMenubarAssessments());
			waitUntilWebElementVisible(pages.getPageMyAssessments().getButtonAssessment());
			webElementClick(pages.getPageMyAssessments().getButtonAssessment());
		}
		catch (Exception exception) {
			throw new Exception("Unable to start the assessments" + "\n" + exception.getMessage());
		}
	}

	// ################################################## Then Steps ###################################################
	@Then("^sees that the needs section is disabled in the progress bar$")
	public void sees_that_the_needs_section_is_disabled_in_the_progress_bar() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageMyInfo().getMenubarAssessments());
			Assert.assertFalse(isWebElementDisplayed(pages.getPageMyAssessments().getProgress_Needs()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageMyAssessments().getProgress_Depression()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageMyAssessments().getProgress_Anxiety()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageMyAssessments().getProgress_PhysicalActivity()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Needs section is not disabled in progress bar" + "\n" + exception.getMessage());
		}
	}
}