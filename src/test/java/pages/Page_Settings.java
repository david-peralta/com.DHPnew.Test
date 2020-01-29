package pages;

import helpers.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Settings extends Base {
	public Page_Settings() {
		PageFactory.initElements(webDriver, this);
	}

	// ############### DHP Reborn ###############
	@FindBy(xpath = "//div[text()='General']")
	private WebElement horizontaltab_General;
	@FindBy(xpath = "//div[text()='General' and @class ='tabs-header-item active']")
	private WebElement horizontaltab_GeneralDefault;
	@FindBy(xpath = "//div[text()='Speciality List']")
	private WebElement horizontaltab_SpecialityList;
	@FindBy(xpath = "//div[contains(text(),'Wellness Check')]")
	private WebElement horizontaltab_WellnessCheck;
	@FindBy(xpath = "//span[text()='Health Indicator']")
	private WebElement label_HealthIndicator;
	@FindBy(xpath = "//div[text()='Health Indicator Graph']")
	private WebElement option_HealthIndicatorGraph;
	@FindBy(xpath = "(//div[contains(@id,'ToggleButtonWrapper')])[1]")
	private WebElement toggle_HealthIndicator;
	@FindBy(xpath = "//input[contains(@id,'HealthIndicator') and @checked = 'checked']")
	private WebElement toggleON_HealthIndicator;
	@FindBy(xpath = "	//table[contains(@id,'InfoTypeTable')]")
	private WebElement infotable;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement button_Save;
	@FindBy(xpath = "//input[contains(@id,'WellnessCheckSelectAll')]")
	private WebElement checkbox_WellnessCheckSelectAll;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[1]")
	private WebElement WellnessCheckQuestion1;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[2]")
	private WebElement WellnessCheckQuestion2;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[3]")
	private WebElement WellnessCheckQuestion3;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[4]")
	private WebElement WellnessCheckQuestion4;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[5]")
	private WebElement WellnessCheckQuestion5;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[1]//input[@type = 'checkbox']")
	private WebElement checkbox_WellnessCheckQuestion1;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[2]//input[@type = 'checkbox']")
	private WebElement checkbox_WellnessCheckQuestion2;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[3]//input[@type = 'checkbox']")
	private WebElement checkbox_WellnessCheckQuestion3;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[4]//input[@type = 'checkbox']")
	private WebElement checkbox_WellnessCheckQuestion4;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[5]//input[@type = 'checkbox']")
	private WebElement checkbox_WellnessCheckQuestion5;
	@FindBy(xpath = "//i[@class='fa fa-check']")
	private WebElement checkbox_WellnessCheck_CheckIcon;
	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement checkbox_WellnessCheck_XIcon;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[1]//input[contains(@id,'WellnessQuestion')]")
	private WebElement textbox_WellnessCheckQuestion1;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)[1]//input[contains(@id,'WellnessGraphLegend')]")
	private WebElement textbox_WellnessCheckGraphLegend1;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)//input[contains(@id,'WellnessQuestion') and @value='Edited question one']")
	private WebElement textbox_RevertWellnessCheckQuestion1;
	@FindBy(xpath = "(//table[contains(@id, 'WellnessCheckTable')]//tbody//tr)//input[contains(@id,'WellnessGraphLegend') and @value='Edited graph legend one']")
	private WebElement textbox_RevertWellnessCheckGraphLegend1;
	@FindBy(xpath = "//input[@value='PSA']/ancestor::tr//input[@type = 'checkbox']")
	private WebElement checkbox_PSA;
	@FindBy(xpath = "//span[text()='Timeline']")
	private WebElement label_Timeline;
	@FindBy(xpath = "//input[@value='PSA']")
	private WebElement field_PSA;
	
	
	
	
	
	
	
	
	// ############### DHP Reborn ###############
	// ############## Page Objects ##############
	public WebElement getTimelineLabel() {
		return label_Timeline;
	}
	public WebElement getPSAfield() {
		return field_PSA;
	}

	public WebElement getPSACheckbox() {
		return checkbox_PSA;
	}
	public WebElement getRevertWellnessCheckQuestion1Textbox() {
		return textbox_RevertWellnessCheckQuestion1;
	}
	public WebElement getRevertWellnessCheckGraphLegend1Textbox() {
		return textbox_RevertWellnessCheckGraphLegend1;
	}
	
	
	public WebElement getWellnessCheckSelectAll() {
		return checkbox_WellnessCheckSelectAll;
	}
	
	public WebElement getWellnessCheckQuestion1Textbox() {
		return textbox_WellnessCheckQuestion1;
	}
	public WebElement getWellnessCheckGraphLegend1Textbox() {
		return textbox_WellnessCheckGraphLegend1;
	}
	public WebElement getWellnessCheckQuestion1() {
		return WellnessCheckQuestion1;
	}
	public WebElement getWellnessCheckQuestion2() {
		return WellnessCheckQuestion2;
	}
	public WebElement getWellnessCheckQuestion3() {
		return WellnessCheckQuestion3;
	}
	public WebElement getWellnessCheckQuestion4() {
		return WellnessCheckQuestion4;
	}
	public WebElement getWellnessCheckQuestion5() {
		return WellnessCheckQuestion5;
	}
	public WebElement getWellnessCheckQuestion1Checkbox() {
		return checkbox_WellnessCheckQuestion1;
	}
	public WebElement getWellnessCheckQuestion2Checkbox() {
		return checkbox_WellnessCheckQuestion2;
	}
	public WebElement getWellnessCheckQuestion3Checkbox() {
		return checkbox_WellnessCheckQuestion3;
	}
	public WebElement getWellnessCheckQuestion4Checkbox() {
		return checkbox_WellnessCheckQuestion4;
	}
	public WebElement getWellnessCheckQuestion5Checkbox() {
		return checkbox_WellnessCheckQuestion5;
	}
	public WebElement getWellnessCheckCheckIcon() {
		return checkbox_WellnessCheck_CheckIcon;
	}
	public WebElement getWellnessCheckXIcon() {
		return checkbox_WellnessCheck_XIcon;
	}
	
	public WebElement getToggleHealthIndicator() {
		return toggle_HealthIndicator;
	}
	public WebElement getInfoTable() {
		return infotable;
	}
	
	public WebElement getToggleONHealthIndicator() {
		return toggleON_HealthIndicator;
	}
	
	public WebElement getButtonSave() {
		return button_Save;
	}
	
	public WebElement getoptionHealthIndicatorGraph() {
		return option_HealthIndicatorGraph;
	}
	public WebElement getlabel_HealthIndicator() {
		return label_HealthIndicator;
	}
	public WebElement getHorizontaltabGeneral() {
		return horizontaltab_General;
	}
	public WebElement getHorizontaltabSpecialityList() {
		return horizontaltab_SpecialityList;
	}
	public WebElement getHorizontaltabWellnessCheck() {
		return horizontaltab_WellnessCheck;
	}
	public WebElement getHorizontaltabGeneralDefault() {
		return horizontaltab_GeneralDefault;
	}
	
	
}
