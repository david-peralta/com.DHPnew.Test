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

	// ############################################## Return Page Objects ###############################################
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

}
