package pages;

import helpers.Base;

public class Pages extends Base {
	public Pages() {

	}

	private Page_Home page_Home;
	private Page_Login page_Login;
	private Page_Registration page_Registration;
	private Page_MyInfo page_MyInfo;
	private Page_ConfigManagers page_ConfigManagers;
	private Page_Settings page_Settings;
	private Page_ContactUs page_ContactUs;
	private Page_Clinician page_Clinician;
	private Page_ClinicianManagers page_ClinicianManagers;
	private Page_ClinicianDetails page_ClinicianDetails;
	private Page_ChangePassword page_ChangePassword;
	private Page_MyPatient page_MyPatient;
	private Page_AccountDeactivated page_AccountDeactivated;
	private Page_MyAssessments page_MyAssessments;
	private Page_Appointments page_Appointments;

	public Page_Settings getPageSettings() {
		return (page_Settings == null) ? page_Settings = new Page_Settings() : page_Settings;
	}

	public Page_Appointments getpageAppointments() {
		return (page_Appointments == null) ? page_Appointments = new Page_Appointments() : page_Appointments;
	}

	public Page_Home getPageHome() {
		return (page_Home == null) ? page_Home = new Page_Home() : page_Home;
	}

	public Page_Login getPageLogin() {
		return (page_Login == null) ? page_Login = new Page_Login() : page_Login;
	}

	public Page_Registration getPageRegistration() {
		return (page_Registration == null) ? page_Registration = new Page_Registration() : page_Registration;
	}

	public Page_MyInfo getPageMyInfo() {
		return (page_MyInfo == null) ? page_MyInfo = new Page_MyInfo() : page_MyInfo;
	}

	public Page_ConfigManagers pageConfigManagers() {
		return (page_ConfigManagers == null) ? page_ConfigManagers = new Page_ConfigManagers() : page_ConfigManagers;
	}

	public Page_ContactUs getPageContactUs() {
		return (page_ContactUs == null) ? page_ContactUs = new Page_ContactUs() : page_ContactUs;
	}

	public Page_ClinicianManagers getPageClinicianManagers() {
		return (page_ClinicianManagers == null) ? page_ClinicianManagers = new Page_ClinicianManagers() : page_ClinicianManagers;
	}

	public Page_Clinician getPageClinician() {
		return (page_Clinician == null) ? page_Clinician = new Page_Clinician() : page_Clinician;
	}

	public Page_ClinicianDetails getPageClinicianDetails() {
		return (page_ClinicianDetails == null) ? page_ClinicianDetails = new Page_ClinicianDetails() : page_ClinicianDetails;
	}

	public Page_ChangePassword getPageChangePassword() {
		return (page_ChangePassword == null) ? page_ChangePassword = new Page_ChangePassword() : page_ChangePassword;
	}

	public Page_MyPatient getPageMyPatient() {
		return (page_MyPatient == null) ? page_MyPatient = new Page_MyPatient() : page_MyPatient;
	}

	public Page_AccountDeactivated getPageAccountDeactivated() {
		return (page_AccountDeactivated == null) ? page_AccountDeactivated = new Page_AccountDeactivated() : page_AccountDeactivated;
	}

	public Page_MyAssessments getPageMyAssessments() {
		return (page_MyAssessments == null) ? page_MyAssessments = new Page_MyAssessments() : page_MyAssessments;
	}

}
