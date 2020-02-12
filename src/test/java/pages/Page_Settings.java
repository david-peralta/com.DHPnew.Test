package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_Settings extends Base {
	public Page_Settings() {
		PageFactory.initElements(webDriver, this);
	}

	// ################################################## Page Objects ##################################################
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

	// Appointment
	@FindBy(xpath = "//span[text()='Appointment']")
	private WebElement label_Appointment;
	// Video Conferencing
	@FindBy(xpath = "//div[text()='Enable Video Conferencing']")
	private WebElement option_VideoConferencing;
	@FindBy(xpath = "(//div[contains(@class,'toggle-button')])[3]")
	private WebElement toggle_VideoConferencing;
	@FindBy(xpath = "(//div[contains(@class,'toggle-button toggle-button-checked')])[3]")
	private WebElement toggle_DisableVideoConferencing;
	// Clinic Visit
	@FindBy(xpath = "//div[text()='Enable Clinic Visit']")
	private WebElement option_ClinicVisit;
	@FindBy(xpath = "//div[text() = 'Enable Clinic Visit']/parent::div//following-sibling::div//div[@class = 'toggle-button']")
	private WebElement toggle_EnableClinicVisit;
	@FindBy(xpath = "//div[text() = 'Enable Clinic Visit']/parent::div//following-sibling::div//div[contains(@class, 'toggle-button toggle-button-checked')]")
	private WebElement toggle_DisableClinicVisit;

	// Assessment
	@FindBy(xpath = "//span[contains(text(),'Assessment')]")
	private WebElement label_Assessment;
	@FindBy(xpath = "//div[text()='Enable Assessment']")
	private WebElement option_Assessment;
	@FindBy(xpath = "//div[text() = 'Enable Assessment']/parent::div//following-sibling::div//div[@class = 'toggle-button']")
	private WebElement toggle_Assessment;
	@FindBy(xpath = "//div[text() = 'Enable Assessment']/parent::div//following-sibling::div//div[contains(@class, 'toggle-button toggle-button-checked')]")
	private WebElement toggle_DisableAssessments;

	// Assessment - Needs
	@FindBy(xpath = "//div[text()='Enable Needs']")
	private WebElement option_Needs;
	@FindBy(xpath = "//div[text() = 'Enable Needs']/parent::div//following-sibling::div//div[@class = 'toggle-button']")
	private WebElement toggle_EnableNeeds;
	@FindBy(xpath = "//div[text() = 'Enable Needs']/parent::div//following-sibling::div//div[contains(@class, 'toggle-button toggle-button-checked')]")
	private WebElement toggle_DisableNeeds;
	@FindBy(xpath = "(//div[contains(@class,'toggle-button toggle-button-disabled')])[1]")
	private WebElement disable_Needs;

	// Assessment - Depression
	@FindBy(xpath = "//div[text()='Enable Depression']")
	private WebElement option_Depression;
	@FindBy(xpath = "(//div[contains(@class,'toggle-button')])[11]")
	private WebElement toggle_EnableDepression;
	@FindBy(xpath = "(//div[contains(@class,'toggle-button toggle-button-disabled')])[2]")
	private WebElement disable_Depression;

	// Assessment - Anxiety
	@FindBy(xpath = "//div[text()='Enable Anxiety']")
	private WebElement option_Anxiety;
	@FindBy(xpath = "//div[text() = 'Enable Anxiety']/parent::div//following-sibling::div//div[contains(@class, 'toggle-button toggle-button-checked')]")
	private WebElement toggle_EnableAnxiety;
	@FindBy(xpath = "//div[text() = 'Enable Anxiety']/parent::div//following-sibling::div//div[@class = 'toggle-button']")
	private WebElement toggle_DisabledAnxiety;
	@FindBy(xpath = "(//div[contains(@class,'toggle-button toggle-button-disabled')])[3]")
	private WebElement disable_Anxiety;

	// Assessment - Physical Activity
	@FindBy(xpath = "//div[text()='Enable Physical Activity']")
	private WebElement option_PhysicalActivity;
	@FindBy(xpath = "//div[text() = 'Enable Physical Activity']/parent::div//following-sibling::div//div[contains(@class, 'toggle-button toggle-button-checked')]")
	private WebElement toggle_EnablePhysicalActivity;
	@FindBy(xpath = "//div[text() = 'Enable Physical Activity']/parent::div//following-sibling::div//div[@class = 'toggle-button']")
	private WebElement toggle_DisablePhysicalActivity;
	@FindBy(xpath = "(//div[contains(@class,'toggle-button toggle-button-disabled')])[4]")
	private WebElement disable_PhysicalActivity;

	/* Welllness Section */
	@FindBy(xpath = "//input[contains(@id,'CheckBox_WellnessCheckSelectAll')]")
	private WebElement checkbox_WellnessSelectAll;

	@FindBy(xpath = "//input[contains(@value,'Save')]")
	private WebElement button_Save;
	@FindBy(xpath = "//input[contains(@value,'Cancel')]")
	private WebElement button_Cancel;

	@FindBy(xpath = "//span[contains(text(),'There are unsaved changes. Do you wish to proceed?')]")
	private WebElement popup_UnsavedChanges;
	@FindBy(xpath = "//input[contains(@value,'Yes')]")
	private WebElement popup_Yes;
	@FindBy(xpath = "(//input[contains(@value,'No')])[3]")
	private WebElement popup_No;

	@FindBy(xpath = "//input[contains(@value,'Upload Image')]")
	private WebElement button_UploadImage;

	@FindBy(xpath = "//span[contains(text(), 'Saved Successfully!')]")
	private WebElement message_Saved;

	@FindBy(xpath = "(//div[contains(@id,'ToggleButtonWrapper')])[5]")
	private WebElement toggle_Needs;
	@FindBy(xpath = "//div[text()='Enable Needs']/parent::div/following-sibling::div//div[@class='toggle-button toggle-button-checked']")
	private WebElement toggle_NeedsON;
	@FindBy(xpath = "(//div[contains(@id,'ToggleButtonWrapper')])[6]")
	private WebElement toggle_Depression;
	@FindBy(xpath = "//div[text()='Enable Depression']/parent::div/following-sibling::div//div[@class='toggle-button toggle-button-checked']")
	private WebElement toggle_DepressionON;
	@FindBy(xpath = "(//div[contains(@id,'ToggleButtonWrapper')])[7]")
	private WebElement toggle_Anxiety;
	@FindBy(xpath = "//div[text()='Enable Anxiety']/parent::div/following-sibling::div//div[@class='toggle-button toggle-button-checked']")
	private WebElement toggle_AnxietyON;
	@FindBy(xpath = "//div[text()='Enable Physical Activity']/parent::div/following-sibling::div//div[@class='toggle-button toggle-button-checked']")
	private WebElement toggle_PhysicalActivityON;
	@FindBy(xpath = "(//div[contains(@id,'ToggleButtonWrapper')])[8]")
	private WebElement toggle_PhysicalActivity;

	// ############################################## Return Page Objects ###############################################
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

	public WebElement getCheckboxWellnessSelectAll() {
		return checkbox_WellnessSelectAll;
	}

	public WebElement getButtonSave() {
		return button_Save;
	}

	public WebElement getButtonCancel() {
		return button_Cancel;

	}

	public WebElement getOptionVideoConferencing() {
		return option_VideoConferencing;
	}

	public WebElement getLabelAppointment() {
		return label_Appointment;
	}

	public WebElement getToggleVideo() {
		return toggle_VideoConferencing;
	}

	public WebElement getDisabledVideo() {
		return toggle_DisableVideoConferencing;
	}

	public WebElement getMsgUnsaved() {
		return popup_UnsavedChanges;
	}

	public WebElement getButtonYes() {
		return popup_Yes;
	}

	public WebElement getButtonNo() {
		return popup_No;
	}

	public WebElement getButtonUploadImage() {

		return button_UploadImage;
	}

	public WebElement getLabelAssessment() {
		return label_Assessment;
	}

	public WebElement getOptionAssessment() {
		return option_Assessment;
	}

	public WebElement getOptionNeed() {
		return option_Needs;
	}

	public WebElement getOptionDepression() {
		return option_Depression;
	}

	public WebElement getOptionAnxiety() {
		return option_Anxiety;
	}

	public WebElement getOptionPhysicalActivity() {
		return option_PhysicalActivity;
	}

	public WebElement getToggleAssessment() {
		return toggle_Assessment;
	}

	public WebElement getDisabledAssessment() {
		return toggle_DisableAssessments;
	}

	public WebElement getToggleEnabledNeeds() {
		return toggle_EnableNeeds;
	}

	public WebElement getToggleDisableNeeds() {
		return toggle_DisableNeeds;
	}

	public WebElement getDisabledNeeds() {
		return disable_Needs;
	}

	public WebElement getEnabledDepression() {
		return toggle_EnableDepression;
	}

	public WebElement getDisabledDepression() {
		return disable_Depression;
	}

	public WebElement getToggleAnxiety() {
		return toggle_EnableAnxiety;
	}

	public WebElement getToggleDisableAnxiety() {
		return toggle_DisabledAnxiety;
	}

	public WebElement getDisabledAnxiety() {
		return disable_Anxiety;
	}

	public WebElement getToggleEnableActivity() {
		return toggle_EnablePhysicalActivity;
	}

	public WebElement getToggleDisablePhysicalActivity() {
		return toggle_DisablePhysicalActivity;
	}

	public WebElement getDisabledPhysicalActivity() {
		return disable_PhysicalActivity;
	}

	public WebElement getMessageSave() {
		return message_Saved;
	}

	public WebElement getToggleEnableClinicVisit() {
		return toggle_EnableClinicVisit;
	}

	public WebElement getToggleDisableClinicVisit() {
		return toggle_DisableClinicVisit;
	}

	public WebElement getOptionClinicVisit() {
		return option_ClinicVisit;
	}

	public WebElement getPhysicalActivityOn() {
		return toggle_PhysicalActivityON;
	}

	public WebElement getNeedsToggle() {
		return toggle_Needs;
	}

	public WebElement getNeedsToggleON() {
		return toggle_NeedsON;
	}

	public WebElement getDepressionToggle() {
		return toggle_Depression;
	}

	public WebElement getDepressionToggleOn() {
		return toggle_DepressionON;
	}

	public WebElement getAnxietyToggle() {
		return toggle_Anxiety;
	}

	public WebElement getAnxietyToggleOn() {
		return toggle_AnxietyON;
	}

	public WebElement getPhysicalActivityToggle() {
		return toggle_PhysicalActivity;
	}

}
