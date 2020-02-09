package runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "steps" }, monochrome = true, strict = true, dryRun = false, // Change dryRun to true to check for unimplemented steps.
	plugin = { "com.cucumber.listener.ExtentCucumberFormatter:reports\\Extent-Report.html" },
	// Specify which folder or file to check.
	features = "src\\test\\resources\\features\\",
	// Comment tags for easy change.
	tags = { "@Regression" })
// tags = { "@Regression", "~@WIP" })
// tags = { "@ModuleUsers" })
// tags = { "@WIP" })

public class Runner {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig("src\\test\\resources\\configurations\\Extent-Config.xml");
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10 - 64 Bit");
		Reporter.setSystemInfo("Selenium", "3.14.0");
		Reporter.setSystemInfo("Maven", "3.8.0");
	}
}