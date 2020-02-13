package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_MyPatient extends Base {
	public Page_MyPatient() {
		PageFactory.initElements(webDriver, this);
	}

	// ################################################## Page Objects ##################################################
	@FindBy(xpath = "//span[text()='My patients']")
	private WebElement header_MyPatients;

	@FindBy(xpath = "//input[contains(@id,'InputSearchName')]")
	private WebElement input_SearchName;
	@FindBy(xpath = "//input[contains(@id,'btn_Search')]")
	private WebElement button_Search;
	@FindBy(xpath = "//input[contains(@value,'Reset')]")
	private WebElement button_Reset;
	@FindBy(xpath = "(//input[contains(@value,'Cancel')])[2]")
	private WebElement button_Cancel;
	@FindBy(xpath = "(//input[contains(@value,'Save')])[2]")
	private WebElement button_Save;
	@FindBy(xpath = "//input[contains(@value,'Add New Note')]")
	private WebElement button_AddNewNote;

	@FindBy(xpath = "//a[text()='demeth']")
	private WebElement link_PatientUser;
	@FindBy(xpath = "//span[text()='demeth camuin']")
	private WebElement header_PatientProfile;

	@FindBy(xpath = "//div[contains(@id,'Title')]//span[text()='Basic Info']")
	private WebElement tab_PatientBasicInfo;
	@FindBy(xpath = "//div[contains(@id,'Title')]//span[text()='Medical Info']")
	private WebElement tab_PatientMedicalInfo;
	@FindBy(xpath = "//span[text()='PSA']")
	private WebElement tab_PatientPSA;
	@FindBy(xpath = "//span[text()='Appointments']")
	private WebElement tab_PatientAppointment;
	@FindBy(xpath = "//span[text()='Notes']")
	private WebElement tab_PatientNote;

	@FindBy(xpath = "//textarea[contains(@id,'TextArea_PatientNote')]")
	private WebElement textarea_PatientNote;
	@FindBy(xpath = "//span[contains(text(),'Patient note successfully saved!')]")
	private WebElement message_NoteAdded;
	// @FindBy(xpath = "(//span[contains(text(),'07/02/20')]//ancestor::tr])[1]")
	@FindBy(xpath = "//span[contains(text(),'13/02/20')]//ancestor::tr//following::span[contains(text(),'Sample Test Note')]")
	private WebElement row_FirstData;

	// ############################################## Return Page Objects ###############################################
	public WebElement getHeaderMyPatients() {
		return header_MyPatients;
	}

	public WebElement getSearchButton() {
		return button_Search;
	}

	public WebElement getResetButton() {
		return button_Reset;
	}

	public WebElement getInputSearchName() {
		return input_SearchName;
	}

	public WebElement getLinkPatientUser() {
		return link_PatientUser;
	}

	public WebElement getHeaderPatientProfile() {
		return header_PatientProfile;
	}

	public WebElement getTabPatientBasicInfo() {
		return tab_PatientBasicInfo;
	}

	public WebElement getTabPatientMedicalInfo() {
		return tab_PatientMedicalInfo;
	}

	public WebElement getTabPatientPSA() {
		return tab_PatientPSA;
	}

	public WebElement getTabPatientAppointment() {
		return tab_PatientAppointment;
	}

	public WebElement getTabPatientNote() {
		return tab_PatientNote;
	}

	public WebElement getTextAreaPatientNote() {
		return textarea_PatientNote;
	}

	public WebElement getButtonAddNote() {
		return button_AddNewNote;
	}

	public WebElement getMessageNoteAdded() {
		return message_NoteAdded;
	}

	public WebElement getButtonSave() {
		return button_Save;
	}

	public WebElement getButtonCancel() {
		return button_Cancel;
	}

	public WebElement getRowFirstData() {
		return row_FirstData;
	}

}
