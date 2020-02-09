package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_ClinicianManagers extends Base {
	public Page_ClinicianManagers() {
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

	// ############################################## Return Page Objects ###############################################
	public WebElement getClinicianManagers() {
		return header_ClinicianManagers;
	}

	public WebElement getButtonCancel() {
		return button_Cancel;
	}

	public WebElement getActiveUser() {
		return label_ActiveUser;
	}

	public WebElement getDeactivatedUser() {
		return label_DeactivatedUser;
	}

	public WebElement getLabelClinicianManager() {
		return link_ClinicianManager;
	}

	public WebElement getLinkFilterStatus() {
		return link_FilterStatus;
	}

	public WebElement getButtonCreate() {
		return button_Create;
	}

	public WebElement getImageUserAccount() {
		return image_UserAccount;
	}

	public WebElement getLinkChangePassword() {
		return link_ChangePassword;
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
}
