package steps;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Base;
import pages.Pages;

public class Steps_Home extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();

	// ################################################## Given Steps ##################################################
	@Given("^the user is on home page$")
	public void the_user_is_on_home_page() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			Assert.assertTrue(getCurrentUrl().contains(properties.getProperty("url")));
		}
		catch (Exception exception) {
			throw new Exception("The proceed to homepage." + "\n" + exception.getMessage());
		}
	}

	@When("^the user clicks login quick link in the footer$")
	public void the_user_clicks_login_quick_link_in_the_footer() throws Throwable {
		try {
			webElementClick(pages.getPageHome().getLogInLinkOnFooter());
			Thread.sleep(5000);
		}
		catch (Exception exception) {
			throw new Exception("Unable to locate link on footer" + "\n" + exception.getMessage());
		}
	}

	@Given("^a user with \"([^\"]*)\" credentials is logged in$")
	public void a_user_with_credentials_is_logged_in(String arg1) throws Throwable {
		try {
			if (arg1.equals("Admin")) {
				if (!getPageTitle().equals("Login") && !isWebElementDisplayed(pages.getPageHome().getButtonUsers())) {
					the_user_logs_out();
				}

				if (getPageTitle().equals("Login")) {
					steps.getStepsLogin().the_user_logs_in_with_credentials("Admin");
				}

				related_controls_are_shown_on_the_landing_page("Admin");
			}
			else if (arg1.equals("Manager")) {
				if (!getPageTitle().equals("Login") && (!isWebElementDisplayed(pages.getPageHome().getButtonNotifications()) || !isWebElementDisplayed(pages.getPageHome().getButtonProjects()))) {
					the_user_logs_out();
				}

				if (getPageTitle().equals("Login")) {
					steps.getStepsLogin().the_user_logs_in_with_credentials("Manager");
				}

				related_controls_are_shown_on_the_landing_page("Manager");
			}
			else if (arg1.equals("User")) {
				if (!getPageTitle().equals("Login") && !isWebElementDisplayed(pages.getPageHome().getButtonNotifications())) {
					the_user_logs_out();
				}

				if (isWebElementDisplayed(pages.getPageHome().getButtonProjects())) {
					the_user_logs_out();
				}

				if (getPageTitle().equals("Login")) {
					steps.getStepsLogin().the_user_logs_in_with_credentials("User");
				}

				related_controls_are_shown_on_the_landing_page("User");
			}
		}
		catch (AssertionError exception) {
			throw new AssertionError("The user logged in has incorrect credentials." + "\n" + exception.getMessage());
		}
	}

	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			Assert.assertTrue(getCurrentUrl().contains(properties.getProperty("url")));
			waitUntilWebElementVisible(pages.getPageHome().getRegisterButton());
		}
		catch (AssertionError exception) {
			throw new AssertionError("Cannot open browers" + "\n" + exception.getMessage());
		}
	}

	// ################################################## When Steps ###################################################
	@When("^the user logs out$")
	public void the_user_logs_out() throws Throwable {

		try {
			webElementClick(pages.getPageHome().getButtonLogout());
		}
		catch (Exception exception) {
			throw new Exception("The logout button is not available." + "\n" + exception.getMessage());
		}
	}

	@When("^the user navigates to the users page$")
	public void the_user_navigates_to_the_users_page() throws Throwable {

		try {
			webElementClick(pages.getPageHome().getButtonUsers());
		}
		catch (Exception exception) {
			throw new Exception("The link to the users page is not available." + "\n" + exception.getMessage());
		}

	}

	// ################################################## Then Steps ###################################################

	@Then("^user clicks login button on homepage$")
	public void user_clicks_login_button_on_homepage() throws Throwable {
		try {
			webElementClick(pages.getPageHome().getLogInButton());
			Thread.sleep(5000);
		}
		catch (Exception exception) {
			throw new Exception("The link to the homepage page is not available." + "\n" + exception.getMessage());
		}

	}

	@Then("^user clicks register button on homepage$")
	public void user_clicks_register_button_on_homepage() throws Throwable {
		try {
			webElementClick(pages.getPageHome().getRegisterButton());
			Thread.sleep(5000);
		}
		catch (Exception exception) {
			throw new Exception("The register button is not available." + "\n" + exception.getMessage());
		}
	}

	@Then("^\"([^\"]*)\" related controls are shown on the landing page$")
	public void related_controls_are_shown_on_the_landing_page(String arg1) throws Throwable {
		try {
			waitUntilWebElementVisible(pages.getPageHome().getButtonHome());

			if (arg1.equals("Admin")) {
				Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getButtonUsers()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getButtonProjects()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getButtonTimeSheets()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getButtonReports()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getButtonMaintenance()));
				Assert.assertTrue(!isWebElementDisplayed(pages.getPageHome().getButtonNotifications()));
			}
			else if (arg1.equals("Manager")) {
				Assert.assertTrue(!isWebElementDisplayed(pages.getPageHome().getButtonUsers()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getButtonProjects()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getButtonTimeSheets()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getButtonReports()));
				Assert.assertTrue(!isWebElementDisplayed(pages.getPageHome().getButtonMaintenance()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getButtonNotifications()));
			}
			else if (arg1.equals("User")) {
				Assert.assertTrue(!isWebElementDisplayed(pages.getPageHome().getButtonUsers()));
				Assert.assertTrue(!isWebElementDisplayed(pages.getPageHome().getButtonProjects()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getButtonTimeSheets()));
				Assert.assertTrue(!isWebElementDisplayed(pages.getPageHome().getButtonReports()));
				Assert.assertTrue(!isWebElementDisplayed(pages.getPageHome().getButtonMaintenance()));
				Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getButtonNotifications()));
			}
		}
		catch (AssertionError exception) {
			throw new AssertionError("The controls for the logged in user are incorrect." + "\n" + exception.getMessage());
		}
	}

	@Then("^link to the users page is available$")
	public void link_to_the_users_page_is_available() throws Throwable {
		try {
			Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getButtonUsers()) && isWebElementEnabled(pages.getPageHome().getButtonUsers()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("The link to the users page is not available." + "\n" + exception.getMessage());
		}
	}

	@Then("^link to the users page is not displayed$")
	public void link_to_the_users_page_is_not_displayed() throws Throwable {
		try {
			Assert.assertTrue(!isWebElementDisplayed(pages.getPageHome().getButtonUsers()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("The link to the users page is displayed." + "\n" + exception.getMessage());
		}
	}

	@Then("^checks hero text is displayed$")
	public void checks_hero_text_is_displayed() throws Throwable {
		try {
			Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getHeaderHeroText()));
			Assert.assertTrue(isWebElementDisplayed(pages.getPageHome().getHeaderHeroSubText()));
		}
		catch (AssertionError exception) {
			throw new AssertionError("The link to the users page is displayed." + "\n" + exception.getMessage());
		}
	}
}