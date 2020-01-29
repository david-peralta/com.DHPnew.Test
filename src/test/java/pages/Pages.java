package pages;

import helpers.Base;
import pages.Page_Login;

public class Pages extends Base {
	public Pages() {
		
	}
	
	private Page_Home page_Home;
	private Page_Login page_Login;
	private Page_Registration page_Registration;
	private Page_MyInfo page_MyInfo;
	private Page_ConfigManagers page_ConfigManagers;
	private Page_Settings page_Settings;
	private Page_Clinician page_Clinician;
	
	
	public Page_Settings getPageSettings() {
		return (page_Settings == null) ? page_Settings = new Page_Settings() : page_Settings;
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
	
	public Page_Clinician pageClinician() {
		return (page_Clinician == null) ? page_Clinician = new Page_Clinician() : page_Clinician;
	}
	
	
	

}

