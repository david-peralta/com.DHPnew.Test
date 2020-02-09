package steps;

import org.junit.Assert;
import cucumber.api.java.en.Then;
import helpers.Base;
import pages.Pages;

public class Steps_ContactUs extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();

	// ################################################## Given Steps ##################################################

	// ################################################## Given Steps ##################################################

	// ################################################## When Steps ###################################################

	// ################################################## Then Steps ###################################################

	@Then("^sees the organisation details displayed on the page footer$")
	public void sees_the_organization_details_displayed_on_the_page_footer() throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageContactUs().getButtonSendMessage());
			Assert.assertTrue(isWebElementDisplayed(pages.getPageContactUs().getfooterAddress1()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageContactUs().getfooterAddress2()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageContactUs().getfooterEmail()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageContactUs().getfooterNumber()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Page footer not visible" + "\n" + exception.getMessage());
		}
	}
}