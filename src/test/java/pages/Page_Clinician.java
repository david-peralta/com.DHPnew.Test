package pages;

import helpers.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Clinician extends Base {
	public Page_Clinician() {
		PageFactory.initElements(webDriver, this);
	}

	// ############### DHP Reborn ###############
	@FindBy(xpath = "//div[text()='Patients']")
	private WebElement menubar_Patients;
	@FindBy(xpath = "//a[text()='demeth']")
	private WebElement link_DemethPatient;
	@FindBy(xpath = "//input[contains(text(),'InputSearchName')]")
	private WebElement field_Search;
	@FindBy(xpath = "//input[contains(@id,'btn_Search')]")
	private WebElement button_Search;
	@FindBy(xpath = "//input[contains(@value,'Reset')]")
	private WebElement button_Reset;
	
	
	
	// ############### DHP Reborn ###############
	// ############## Page Objects ##############
	public WebElement getPatientsMenubar() {
		return menubar_Patients;
	}
	public WebElement getSearchButton() {
		return button_Search;
	}
	public WebElement getResetButton() {
		return button_Reset;
	}
	public WebElement getPatientSearchField() {
		return field_Search;
	}
	public WebElement getDemethPatientLink() {
		return link_DemethPatient;
	}
	
}
