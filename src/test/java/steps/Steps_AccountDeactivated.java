package steps;

import org.junit.Assert;
import cucumber.api.java.en.Then;
import helpers.Base;
import pages.Pages;

public class Steps_AccountDeactivated extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();

	// ################################################## Given Steps ##################################################

	// ################################################## When Steps ###################################################

	// ################################################## Then Steps ###################################################
	@Then("^checks that the user has been deactivated$")
	public void user_clicks_on_Contact_Us() throws Throwable {
		try {
			Assert.assertTrue(isWebElementDisplayed(pages.getPageAccountDeactivated().getHeaderDeactivatedUser()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageAccountDeactivated().getLabelDeactivatedContact()));
		}
		catch (AssertionError exception) {
			throw new Exception("User Account is not disabled" + "\n" + exception.getMessage());
		}
	}
}