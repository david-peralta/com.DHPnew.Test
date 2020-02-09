package steps;

import helpers.Base;

public class Steps extends Base {
	public Steps() {

	}

	private Steps_Home steps_Home;
	private Steps_Login steps_Login;
	private Steps_Registration steps_Registration;
	private Steps_MyInfo steps_MyInfo;
	private Steps_ConfigManagers steps_ConfigManagers;
	private Steps_Settings steps_Settings;
	private Steps_Clinician steps_Clinician;
	private Steps_ContactUs steps_ContactUs;
	private Steps_ClinicianManagers steps_ClinicianManagers;
	private Steps_ClinicianDetails steps_ClinicianDetails;
	private Steps_ChangePassword steps_ChangePassword;

	public Steps_Settings getStepsSettings() {
		return (steps_Settings == null) ? steps_Settings = new Steps_Settings() : steps_Settings;
	}

	public Steps_ConfigManagers getStepsConfigManagers() {
		return (steps_ConfigManagers == null) ? steps_ConfigManagers = new Steps_ConfigManagers() : steps_ConfigManagers;
	}

	public Steps_Home getStepsHome() {
		return (steps_Home == null) ? steps_Home = new Steps_Home() : steps_Home;
	}

	public Steps_Login getStepsLogin() {
		return (steps_Login == null) ? steps_Login = new Steps_Login() : steps_Login;
	}

	public Steps_Registration getStepsRegistration() {
		return (steps_Registration == null) ? steps_Registration = new Steps_Registration() : steps_Registration;
	}

	public Steps_MyInfo getStepsMyInfo() {
		return (steps_MyInfo == null) ? steps_MyInfo = new Steps_MyInfo() : steps_MyInfo;
	}

	public Steps_Clinician getStepsClinician() {
		return (steps_Clinician == null) ? steps_Clinician = new Steps_Clinician() : steps_Clinician;
	}

	public Steps_ContactUs getStepsContactUs() {
		return (steps_ContactUs == null) ? steps_ContactUs = new Steps_ContactUs() : steps_ContactUs;
	}

	public Steps_ClinicianManagers getStepsClinicianManagers() {
		return (steps_ClinicianManagers == null) ? steps_ClinicianManagers = new Steps_ClinicianManagers() : steps_ClinicianManagers;
	}

	public Steps_ClinicianDetails getStepsClinicianDetails() {
		return (steps_ClinicianDetails == null) ? steps_ClinicianDetails = new Steps_ClinicianDetails() : steps_ClinicianDetails;
	}

	public Steps_ChangePassword getStepsChangePassword() {
		return (steps_ChangePassword == null) ? steps_ChangePassword = new Steps_ChangePassword() : steps_ChangePassword;
	}
}
