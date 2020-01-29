package steps;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.Base;
import junit.framework.Assert;

@SuppressWarnings({ "deprecation" })
public class CommonSteps extends Base {
	@After
	public void afterScenario(Scenario scenario) throws Exception {
		if (scenario.isFailed()) {
			String strFilePath = "";
			
			try {
				strFilePath = takeScreenshot(scenario.getId().substring(0, scenario.getId().indexOf(":")).toUpperCase() + "-S" + scenario.getName().substring(0, scenario.getName().indexOf(":")) + "-" + getStringDateTimeNow("dd.MM.yyyy_HHmm"));
				strFilePath = strFilePath.substring(strFilePath.indexOf("screenshots"), strFilePath.length());
				
				Reporter.addScreenCaptureFromPath(strFilePath);
			}
			catch (Exception exception) {
				throw new Exception("Unable to take screenshot of failed scenario.");
			}
		}
	}
	
	@After("@End")
	public void end() {
		//webDriver.quit();
	}
	
	// ################################################## Given Steps ##################################################
	@Given("^a web browser is launched$")
	public void a_web_browser_is_launched() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			Assert.assertTrue(getCurrentUrl().contains(properties.getProperty("url")));
		}
		catch (AssertionError exception) {
			throw new AssertionError("Unable to launch URL on the web browser." + "\n" + exception.getMessage());
		}
	}
	
	// ################################################## When Steps ###################################################
	
	// ################################################## Then Steps ###################################################
	@Then("^the web browser is on \"([^\"]*)\" page$")
	public void the_web_browser_is_on_Page(String arg1) throws Throwable {
		try {
			
			Assert.assertEquals(arg1, getPageTitle());
		}
		catch (AssertionError exception) {
			throw new AssertionError("The web browser is not on the expected page." + "\n" + exception.getMessage());
		}
	}
	
	@Then("^the web browser is not on \"([^\"]*)\" page$")
	public void the_web_browser_is_not_on_page(String arg1) throws Throwable {
		try {
			Assert.assertNotSame(arg1, getPageTitle());
		}
		catch (AssertionError exception) {
			throw new AssertionError("The web browser is on the page." + "\n" + exception.getMessage());
		}
	}
}