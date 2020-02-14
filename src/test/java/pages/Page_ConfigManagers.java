package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_ConfigManagers extends Base {
	public Page_ConfigManagers() {
		PageFactory.initElements(webDriver, this);
	}

	// ############################################## Page Objects ###############################################
	@FindBy(xpath = "//div[text()='Settings']")
	private WebElement menubar_Settings;
	@FindBy(xpath = "//div[text()='Admin']")
	private WebElement menubar_Admin;
	@FindBy(xpath = "//div[text()='Contentful']")
	private WebElement menubar_Contentful;
	@FindBy(xpath = "//div[text()='Logout']")
	private WebElement menubar_Logout;
	@FindBy(xpath = "//input[contains(@id,'Button_Yes')]")
	private WebElement button_YesMeLogout;
	@FindBy(xpath = "//input[contains(@id,'Button_No')]")
	private WebElement button_CancelLogout;
	@FindBy(xpath = "//div[contains(@id,'Content')]//div[contains(text(),'Hello')]")
	private WebElement button_ProfileMenu;
	@FindBy(xpath = "//span[contains(@class,'fa fa-fw fa-sign-out')]")
	private WebElement link_ProfileMenuLogout;
	@FindBy(xpath = "//div[contains(text(),'Hello') and contains(text(),'DBHSuper Admin')]")
	private WebElement label_WelcomeProfileName;
	@FindBy(xpath = "(//span[contains(@class,'fa fa-fw fa-angle-down')])[2]")
	private WebElement caretDownIcon_ProfileMenu;
	@FindBy(xpath = "(//span[text()='LAST NAME'])[1]")
	private WebElement label_columnLastName;
	@FindBy(xpath = "(//span[text()='FIRST NAME'])[1]")
	private WebElement label_columnFirstName;
	@FindBy(xpath = "(//span[text()='EMAIL'])[1]")
	private WebElement label_columnEmail;
	@FindBy(xpath = "(//span[text()='STATUS'])[1]")
	private WebElement label_columnStatus;
	@FindBy(xpath = "//input[@value='Create']")
	private WebElement button_CreateAdminConfigManager;
	@FindBy(xpath = "//input[@value='Cancel']")
	private WebElement button_CancelAdminConfigManager;
	@FindBy(xpath = "//label[text()='First Name']//following::input[contains(@id,'Admin_entry_Firstname')and @maxlength = '50']")
	private WebElement field_CreateAdminFirstName;
	@FindBy(xpath = "//label[text()='Last Name']//following::input[contains(@id,'Admin_entry_LastName')and @maxlength = '50']")
	private WebElement field_CreateAdminLastName;
	@FindBy(xpath = "//label[text()='Email']//following::input[contains(@id,'Email')and @maxlength = '50']")
	private WebElement field_CreateAdminEmail;
	@FindBy(xpath = "(//input[contains(@id,'Admin_entry_Firstname')]//following::span//following::span[contains(text(),'This field can') and contains(text(),'t be empty.')])[1]")
	private WebElement validation_EmptyCreateAdminFirstName;
	@FindBy(xpath = "(//input[contains(@id,'Admin_entry_LastName')]//following::span//following::span[contains(text(),'This field can') and contains(text(),'t be empty.')])[1]")
	private WebElement validation_EmptyCreateAdminLastName;
	@FindBy(xpath = "//input[contains(@id,'Email')]//following::span//following::span[contains(text(),'This field can') and contains(text(),'t be empty.')]")
	private WebElement validation_EmptyCreateAdmiEmail;
	@FindBy(xpath = "//span[text()='Account successfully created.']")
	private WebElement label_CreationSuccesspopup;
	@FindBy(xpath = "//input[@value='Okay']")
	private WebElement button_CreationSuccesspopup;
	@FindBy(xpath = "//span[text()='There are unsaved changes on this page. Do you wish to proceed?']")
	private WebElement label_UnsaveChangespopup;
	@FindBy(xpath = "//input[@value='No']")
	private WebElement button_UnsaveChangespopupNo;
	@FindBy(xpath = "//input[@value='Yes']")
	private WebElement button_UnsaveChangespopupYes;
	@FindBy(xpath = "//span[text()='Clinician managers']")
	private WebElement label_ClinicianManager;
	@FindBy(xpath = "//span[text()='Edit Clinician manager']")
	private WebElement label_EditClinicianManager;
	@FindBy(xpath = "(//span[text()='a'])[1]")
	private WebElement label_Alastname;
	@FindBy(xpath = "//input[contains(@id,'Admin_entry_Firstname') and @maxlength = '50']")
	private WebElement field_FirstName;
	@FindBy(xpath = "//input[contains(@id,'Admin_entry_LastName') and @maxlength = '50']")
	private WebElement field_LastName;
	@FindBy(xpath = "//input[contains(@id,'Admin_entry_Email') and @readonly = 'readonly']")
	private WebElement field_EmailReadOnly;
	@FindBy(xpath = "//input[@value='Update']")
	private WebElement button_Update;
	@FindBy(xpath = "//input[@value='Cancel']")
	private WebElement button_Cancel;
	@FindBy(xpath = "//span[text()='Account successfully updated.']")
	private WebElement label_SuccessMessage;
	@FindBy(xpath = "//input[@value='Okay']")
	private WebElement button_Okay;
	@FindBy(xpath = "//div[contains(@id,'Tabs_Header')]//div[contains(text(),'Wellness Check')]")
	private WebElement label_WellnessCheckMenu;
	@FindBy(xpath = "//div[contains(@id,'Tabs_Header')]//div[text()='Speciality List']")
	private WebElement label_SpecialityListMenu;
	@FindBy(xpath = "//div[contains(@id,'SpecialityClinician')]//span[text()='Speciality - Clinician']")
	private WebElement table_SpecialityClinician;
	@FindBy(xpath = "//div[contains(@id,'SpecialityClinician')]//div[contains(text(),'Speciality Name')]")
	private WebElement label_ClinicianSpecialityNameColumn;
	@FindBy(xpath = "//div[contains(@id,'SpecialityClinician')]//th//span[contains(text(),'Select All')]")
	private WebElement label_ClinicianSpecialitySelectAllColumn;
	@FindBy(xpath = "(//div[contains(@id,'SpecialityClinician')]//th//span[contains(text(),'Select All')]//following::input[@class='checkbox' and @checked='checked'])[1]")
	private WebElement checkbox_ClinicianSpecialitySelectAllCheckbox;
	@FindBy(xpath = "//td[@class='RowWithAddAction']//a[contains(@id,'SpecialityClinicianTable_AddRow')]")
	private WebElement link_AddClinicianSpeciality;
	@FindBy(xpath = "//a[@class='SaveRowAction']//i[@class='fa fa-check']")
	private WebElement button_SaveAddClinicianSpeciality;
	@FindBy(xpath = "//a[@class='CancelRowAction']//i[@class='fa fa-times']")
	private WebElement button_CancelAddClinicianSpeciality;
	@FindBy(xpath = "//input[contains(@id,'TextBox_Users') and @class='input OSFillParent InEditMode']")
	private WebElement field_SpecialityClinician;
	@FindBy(xpath = "//input[@value='Pathologist']")
	private WebElement label_ClinicianSpecialityPathologist;
	@FindBy(xpath = "//span[text()='This field cannot be blank']")
	private WebElement validation_AddSpecialityClinician;
	@FindBy(xpath = "//input[@value='Registered Nurse']")
	private WebElement label_RN;
	@FindBy(xpath = "//input[@value='Plantologist']")
	private WebElement label_Plantologist;
	@FindBy(xpath = "//input[@value='Biologist']")
	private WebElement label_Biologist;
	@FindBy(xpath = "//div[contains(@id,'SpecialityTreatment2')]//span[contains(text(),'Speciality - Treatment')]")
	private WebElement table_SpecialityTreatment;
	@FindBy(xpath = "//table[contains(@id,'SpecialityTreatmentTable')]//div[contains(text(),'Speciality Name')]")
	private WebElement label_TreatmentSpecialityNameColumn;
	@FindBy(xpath = "//table[contains(@id,'SpecialityTreatmentTable')]//div[contains(text(),'Select All')]")
	private WebElement label_TreatmentSpecialitySelectAllColumn;
	@FindBy(xpath = "//div[contains(@id,'CheckBox_TreatmentSelectAll')]//input[@type='checkbox' and @checked='checked']")
	private WebElement checkbox_TreatmentSpecialitySelectAllCheckbox;
	@FindBy(xpath = "//div[contains(@id,'CheckBox_TreatmentSelectAll')]//input[@type='checkbox']")
	private WebElement checkbox_TreatmentSpecialityDeselectAllCheckbox;
	@FindBy(xpath = "//a[contains(@id,'SpecialityTreatmentTable_AddRow')]")
	private WebElement link_AddTreatmentSpeciality;
	@FindBy(xpath = "//table[contains(@id,'SpecialityTreatmentTable')]//a[@class='SaveRowAction']")
	private WebElement button_SaveAddTreatmentSpeciality;
	@FindBy(xpath = "//table[contains(@id,'SpecialityTreatmentTable')]//a[@class='CancelRowAction']")
	private WebElement button_CancelAddTreatmentSpeciality;
	@FindBy(xpath = "//table[contains(@id,'SpecialityTreatmentTable')]//input[contains(@id,'Treatment') and contains(@class,'InEditMode') and contains(@name,'TextBox_Treatment')]")
	private WebElement field_SpecialityTreatment;
	@FindBy(xpath = "//table[contains(@id,'SpecialityTreatmentTable')]//span[text()='This field cannot be blank']")
	private WebElement validation_AddSpecialityTreatment;
	@FindBy(xpath = "//a[contains(@id,'pecialityAppointmentTable2_AddRow')]")
	private WebElement link_AddAppointmentSpeciality;
	@FindBy(xpath = "//input[@value='Surgery - Plastic']")
	private WebElement label_TreatmentSpecialitySurgeryPlastic;
	@FindBy(xpath = "//input[@value='Surgery - Plastics']")
	private WebElement label_TreatmentSpecialitySurgeryPlastics;
	@FindBy(xpath = "//input[@value='Natural Therapy']")
	private WebElement label_TreatmentSpecialityNutrition;
	@FindBy(xpath = "//a[contains(@id,'SpecialityPMITable_AddRow')]")
	private WebElement link_AddPatientMedInfoSpeciality;
	@FindBy(xpath = "//div[contains(@id,'SpecialityAppointment')]//span[contains(text(),'Speciality - Appointment')]")
	private WebElement table_SpecialityAppointment;
	@FindBy(xpath = "//div[contains(@id,'SpecialityAppointment')]//div[contains(text(),'Speciality Name')]")
	private WebElement label_AppointmentSpecialityNameColumn;
	@FindBy(xpath = "//div[contains(@id,'SpecialityAppointment')]//div[contains(text(),'Select All')]")
	private WebElement label_AppointmentSpecialitySelectAllColumn;
	@FindBy(xpath = "//div[contains(@id,'CheckBox_AppointmentSelectAll')]//input[@type='checkbox' and @checked='checked']")
	private WebElement checkbox_AppointmentSpecialitySelectAllCheckbox;
	@FindBy(xpath = "//div[contains(@id,'CheckBox_AppointmentSelectAll')]//input[@type='checkbox']")
	private WebElement checkbox_AppointmentSpecialityDeselectAllCheckbox;
	@FindBy(xpath = "//table[contains(@id,'SpecialityAppointmentTable2')]//a[@class='SaveRowAction']")
	private WebElement button_SaveAddAppointmentSpeciality;
	@FindBy(xpath = "//table[contains(@id,'SpecialityAppointmentTable2')]//a[@class='CancelRowAction']")
	private WebElement button_CancelAddAppointmentSpeciality;
	@FindBy(xpath = "//table[contains(@id,'SpecialityAppointmentTable2')]//input[contains(@id,'TextBox_Appointment') and contains(@class,'InEditMode') and contains(@name,'TextBox_Appointment')]")
	private WebElement field_SpecialityAppointment;
	@FindBy(xpath = "//table[contains(@id,'SpecialityAppointmentTable2')]//span[text()='This field cannot be blank']")
	private WebElement validation_AddSpecialityAppointment;
	@FindBy(xpath = "//input[@value='Sociologist']")
	private WebElement label_AppointmentSpecialitySociologist;
	@FindBy(xpath = "//input[@value='Sociologistic']")
	private WebElement label_AppointmentSpecialitySociologistic;
	@FindBy(xpath = "//input[@value='Urologist']")
	private WebElement label_AppointmentSpecialityUrologist;
	@FindBy(xpath = "//input[@value='Radiation Oncologistic']")
	private WebElement label_AppointmentSpecialityRO;
	@FindBy(xpath = "//div[contains(@id,'Tabs_Header')]//div[text()='General']")
	private WebElement label_GeneralMenu;

	// ############################################## Return Page Objects ###############################################
	public WebElement getButtonUpdate() {
		return button_Update;
	}

	public WebElement getSuccessMessageLabel() {
		return label_SuccessMessage;
	}

	public WebElement getOkayButton() {
		return button_Okay;
	}

	public WebElement getCancelButton() {
		return button_Cancel;
	}

	public WebElement getEmailReadOnlyField() {
		return field_EmailReadOnly;
	}

	public WebElement getFirstNameField() {
		return field_FirstName;
	}

	public WebElement getLastNameField() {
		return field_LastName;
	}

	public WebElement getUnsaveChangespopupLabel() {
		return label_UnsaveChangespopup;
	}

	public WebElement getlabelClinicianManager() {
		return label_ClinicianManager;
	}

	public WebElement getUnsaveChangespopupButtonYES() {
		return button_UnsaveChangespopupYes;
	}

	public WebElement getUnsaveChangespopupButtonNO() {
		return button_UnsaveChangespopupNo;
	}

	public WebElement getCreationSuccesspopupLabel() {
		return label_CreationSuccesspopup;
	}

	public WebElement getCreationSuccesspopupButton() {
		return button_CreationSuccesspopup;
	}

	public WebElement getEmptyCreateAdmiEmailValidation() {
		return validation_EmptyCreateAdmiEmail;
	}

	public WebElement getEmptyCreateAdminLastNameValidation() {
		return validation_EmptyCreateAdminLastName;
	}

	public WebElement getEmptyCreateAdminFirstNameValidation() {
		return validation_EmptyCreateAdminFirstName;
	}

	public WebElement getCreateAdminLastNameField() {
		return field_CreateAdminLastName;
	}

	public WebElement getCreateAdminEmailField() {
		return field_CreateAdminEmail;
	}

	public WebElement getCreateAdminFirstNameField() {
		return field_CreateAdminFirstName;
	}

	public WebElement getCreateAdminConfigManagerButton() {
		return button_CreateAdminConfigManager;
	}

	public WebElement getCancelAdminConfigManagerButton() {
		return button_CancelAdminConfigManager;
	}

	public WebElement getcolumnEmailLabel() {
		return label_columnEmail;
	}

	public WebElement getcolumnStatusLabel() {
		return label_columnStatus;
	}

	public WebElement getcolumnLastNameLabel() {
		return label_columnLastName;
	}

	public WebElement getcolumnFirstNameLabel() {
		return label_columnFirstName;
	}

	public WebElement getProfileMenuCaretDownIcon() {
		return caretDownIcon_ProfileMenu;
	}

	public WebElement getProfileNameWelcome() {
		return label_WelcomeProfileName;
	}

	public WebElement getProfileMenuButton() {
		return button_ProfileMenu;
	}

	public WebElement getProfileMenuLogoutLink() {
		return link_ProfileMenuLogout;
	}

	public WebElement getYesMeLogout() {
		return button_YesMeLogout;
	}

	public WebElement getCancelLogout() {
		return button_CancelLogout;
	}

	public WebElement getMenubarSettings() {
		return menubar_Settings;
	}

	public WebElement getMenubarAdmin() {
		return menubar_Admin;
	}

	public WebElement getMenubarContentful() {
		return menubar_Contentful;
	}

	public WebElement getMenubarLogout() {
		return menubar_Logout;
	}

	public WebElement getEditClinicianManagerLabel() {
		return label_EditClinicianManager;
	}

	public WebElement getAlastNameLabel() {
		return label_Alastname;
	}

	public WebElement getSpecialityListHorizontalMenu() {
		return label_SpecialityListMenu;
	}

	public WebElement getGeneralHorizontalMenu() {
		return label_GeneralMenu;
	}

	public WebElement getWellnessCheckHorizontalMenu() {
		return label_WellnessCheckMenu;
	}

	public WebElement getSpecialityClinicianTable() {
		return table_SpecialityClinician;
	}

	public WebElement getClinicianSpecialityNameColumn() {
		return label_ClinicianSpecialityNameColumn;
	}

	public WebElement getClinicianSpecialitySelectAllColumn() {
		return label_ClinicianSpecialitySelectAllColumn;
	}

	public WebElement getClinicianSpecialitySelectAllCheckbox() {
		return checkbox_ClinicianSpecialitySelectAllCheckbox;
	}

	public WebElement getAddClinicianSpeciality() {
		return link_AddClinicianSpeciality;
	}

	public WebElement getSaveAddClinicianSpeciality() {
		return button_SaveAddClinicianSpeciality;
	}

	public WebElement getCancelAddClinicianSpeciality() {
		return button_CancelAddClinicianSpeciality;
	}

	public WebElement getInputClinicianSpeciality() {
		return field_SpecialityClinician;
	}

	public WebElement getAddClinicianSpecialityValidation() {
		return validation_AddSpecialityClinician;
	}

	public WebElement getClinicianSpecialityRegisteredNurse() {
		return label_RN;
	}

	public WebElement getClinicianSpecialityPlantologist() {
		return label_Plantologist;
	}

	public WebElement getClinicianSpecialityBiologist() {
		return label_Biologist;
	}

	public WebElement getSpecialityTreatmentTable() {
		return table_SpecialityTreatment;
	}

	public WebElement getTreatmentSpecialityNameColumn() {
		return label_TreatmentSpecialityNameColumn;
	}

	public WebElement getTreatmentSpecialitySelectAllColumn() {
		return label_TreatmentSpecialitySelectAllColumn;
	}

	public WebElement getTreatmentSpecialitySelectAllCheckbox() {
		return checkbox_TreatmentSpecialitySelectAllCheckbox;
	}

	public WebElement getTreatmentSpecialityDeselectAllCheckbox() {
		return checkbox_TreatmentSpecialityDeselectAllCheckbox;
	}

	public WebElement getAddTreatmentSpeciality() {
		return link_AddTreatmentSpeciality;
	}

	public WebElement getSaveAddTreatmentSpeciality() {
		return button_SaveAddTreatmentSpeciality;
	}

	public WebElement getCancelAddTreatmentSpeciality() {
		return button_CancelAddTreatmentSpeciality;
	}

	public WebElement getInputTreatmentSpeciality() {
		return field_SpecialityTreatment;
	}

	public WebElement getAddTreatmentSpecialityValidation() {
		return validation_AddSpecialityTreatment;
	}

	public WebElement getAddAppointmentSpeciality() {
		return link_AddAppointmentSpeciality;
	}

	public WebElement getTreatmentSpecialitySurgeryPlastic() {
		return label_TreatmentSpecialitySurgeryPlastic;
	}

	public WebElement getTreatmentSpecialitySurgeryPlastics() {
		return label_TreatmentSpecialitySurgeryPlastics;
	}

	public WebElement getTreatmentSpecialityNutrition() {
		return label_TreatmentSpecialityNutrition;
	}

	public WebElement getAddPatientMedInfoSpeciality() {
		return link_AddPatientMedInfoSpeciality;
	}

	public WebElement getSpecialityAppointmentTable() {
		return table_SpecialityAppointment;
	}

	public WebElement getAppointmentSpecialityNameColumn() {
		return label_AppointmentSpecialityNameColumn;
	}

	public WebElement getAppointmentSpecialitySelectAllColumn() {
		return label_AppointmentSpecialitySelectAllColumn;
	}

	public WebElement getAppointmentSpecialitySelectAllCheckbox() {
		return checkbox_AppointmentSpecialitySelectAllCheckbox;
	}

	public WebElement getAppointmentSpecialityDeselectAllCheckbox() {
		return checkbox_AppointmentSpecialityDeselectAllCheckbox;
	}

	public WebElement getSaveAddAppointmentSpeciality() {
		return button_SaveAddAppointmentSpeciality;
	}

	public WebElement getCancelAddAppointmentSpeciality() {
		return button_CancelAddAppointmentSpeciality;
	}

	public WebElement getInputAppointmentSpeciality() {
		return field_SpecialityAppointment;
	}

	public WebElement getAddAppointmentSpecialityValidation() {
		return validation_AddSpecialityAppointment;
	}

	public WebElement getAppointmentSpecialitySociologist() {
		return label_AppointmentSpecialitySociologist;
	}

	public WebElement getAppointmentSpecialitySociologistic() {
		return label_AppointmentSpecialitySociologistic;
	}

	public WebElement getAppointmentSpecialityUrologist() {
		return label_AppointmentSpecialityUrologist;
	}

	public WebElement getAppointmentSpecialityRO() {
		return label_AppointmentSpecialityRO;
	}

}
