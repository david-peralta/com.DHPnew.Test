package steps;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import helpers.Base;
import pages.Pages;

public class Steps_Clinician extends Base {
	Pages pages = new Pages();
	Steps steps = new Steps();

	// ################################################## Given Steps
	// ##################################################
	@Given("^the clinician is on the patient's profile page$")
	public void the_clinician_is_on_the_patient_s_profile_page() throws Throwable {
		try {
			Base.initialization();
			launchURL(properties.getProperty("url"));
			webElementClick(pages.getPageHome().getLogInButton());
			Thread.sleep(5000);
			webElementSendKeys(pages.getPageLogin().getInputEmailAddress(),
					properties.getProperty("DoctorEmail"));
			webElementSendKeys(pages.getPageLogin().getInputUserPassword(),
					properties.getProperty("DoctorPassword"));
			webElementClick(pages.getPageLogin().getButtonLogin());
			webElementClick(pages.pageClinician().getPatientsMenubar());
			

		} catch (AssertionError exception) {
			throw new AssertionError(
					"Clinician Cannot proceed to patient's profile page." + "\n" + exception.getMessage());
		}
	}
	// ################################################## When Steps
	// ###################################################
	@When("^user clicks on a specific patient$")
	public void user_clicks_on_a_specific_patient() throws Throwable {
	   String PatientFirstName = "Demeth";
	   webElementSendKeys(pages.pageClinician().getPatientSearchField(),properties.getProperty(PatientFirstName));
	   webElementClick(pages.pageClinician().getSearchButton());
	   webElementClick(pages.pageClinician().getDemethPatientLink());
	   
	}
	// ################################################## Then Steps
		// ###################################################
}