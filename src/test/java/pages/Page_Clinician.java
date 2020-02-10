package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_Clinician extends Base {
	public Page_Clinician() {
		PageFactory.initElements(webDriver, this);
	}

	// ################################################## Page Objects ##################################################
	@FindBy(xpath = "//span[text()='Clinician managers']")
	private WebElement header_ClinicianManagers;

	@FindBy(xpath = "//input[contains(@value,'Cancel')]")
	private WebElement button_Cancel;

	@FindBy(xpath = "//span[text()='CM']//ancestor::tr//following-sibling::div//span[text()='Active']")
	private WebElement label_ActiveUser;

	@FindBy(xpath = "//span[text()='Aaron']//ancestor::tr//following-sibling::div//span[text()='Deactivated']")
	private WebElement label_DeactivatedUser;

	@FindBy(xpath = "//span[contains(text(),'CM')]//parent::a")
	private WebElement link_ClinicianManager;

	@FindBy(xpath = "(//span[contains(text(),'STATUS')])[1]")
	private WebElement link_FilterStatus;

	@FindBy(xpath = "//input[contains(@value,'Create')]")
	private WebElement button_Create;

	@FindBy(xpath = "//div[@class='img-mask']")
	private WebElement image_UserAccount;

	@FindBy(xpath = "//div[contains(text(),' Change Password')]//parent::a")
	private WebElement link_ChangePassword;

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

	@FindBy(xpath = "//div[@aria-selected='true']//div[@class='lbl_textAlign']//following::span[text()='Basic Info']")
	private WebElement label_BasicInfoTabDefault;
	@FindBy(xpath = "(//span[text()='Basic Info'])[1]")
	private WebElement label_BasicInfoTab;
	@FindBy(xpath = "(//span[text()='Medical Info'])[1]")
	private WebElement label_MedicalInfoTab;
	@FindBy(xpath = "//span[text()='PSA']")
	private WebElement label_PSATab;
	@FindBy(xpath = "//span[text()='Appointments']")
	private WebElement label_AppointmentsTab;
	@FindBy(xpath = "//span[text()='Notes']")
	private WebElement label_NotesTab;
	@FindBy(xpath = "//span[text()='demeth camuin']")
	private WebElement label_PatientName;
	@FindBy(xpath = "//div[contains(@id,'ctn_assessment_graph')]")
	private WebElement graph_AssesstmentOnAppointmentsTab;

	@FindBy(xpath = "//input[@placeholder='Select Clinician']")
	private WebElement placeholder_SelectClinician;

	@FindBy(xpath = "//div[contains(text(),'record')]")
	private WebElement label_RecordFound;
	@FindBy(xpath = "//span[contains(text(),'3 records found')]")
	private WebElement alert_RecordFound;

	@FindBy(xpath = "//div[contains(text(),'record')]")
	private WebElement label_NoRecordFound;
	@FindBy(xpath = "//span[contains(text(),'0 records found')]")
	private WebElement alert_NoRecordFound;

	@FindBy(xpath = "//div[contains(@id,'ctn__Search')]//input[contains(@id,'inputSearch')]")
	private WebElement input_SearchField;

	// ############################################## Return Page Objects ###############################################
	public WebElement getClinicianManagers() {
		return header_ClinicianManagers;
	}

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

	public WebElement getAssesstmentOnAppointmentsTabGraph() {
		return graph_AssesstmentOnAppointmentsTab;
	}

	public WebElement getDefaultTab() {
		return label_BasicInfoTabDefault;
	}

	public WebElement getPatientNameLabel() {
		return label_PatientName;
	}

	public WebElement getBasicInfoTab() {
		return label_BasicInfoTab;
	}

	public WebElement getMedicalInfoTab() {
		return label_MedicalInfoTab;
	}

	public WebElement getPSATab() {
		return label_PSATab;
	}

	public WebElement getAppointmentsTab() {
		return label_AppointmentsTab;
	}

	public WebElement getNotesTab() {
		return label_NotesTab;
	}

	public WebElement getPlaceHolderSelectClinician() {
		return placeholder_SelectClinician;
	}

	public WebElement getLabelRecordFound() {
		return label_RecordFound;
	}

	public WebElement getAlertRecordFound() {
		return alert_RecordFound;
	}

	public WebElement getLabelNoRecordFound() {
		return label_RecordFound;
	}

	public WebElement getAlertNoRecordFound() {
		return alert_RecordFound;
	}

	public WebElement getInputSearchField() {
		return input_SearchField;
	}
}
