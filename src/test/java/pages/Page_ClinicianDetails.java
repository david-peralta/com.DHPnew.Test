package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_ClinicianDetails extends Base {
	public Page_ClinicianDetails() {
		PageFactory.initElements(webDriver, this);
	}

	// ################################################## Page Objects ##################################################
	@FindBy(xpath = "//span[text()='Edit Clinician manager']")
	private WebElement header_EditClinicianManager;

	@FindBy(xpath = "//span[text()='Deactivate Admin']")
	private WebElement header_DeactivateAdmin;

	@FindBy(xpath = "//input[contains(@value,'Cancel')]")
	private WebElement button_Cancel;

	@FindBy(xpath = "//input[contains(@value,'Deactivate')]")
	private WebElement button_Deactivate;

	@FindBy(xpath = "//input[contains(@value,'Activate')]")
	private WebElement button_Activate;

	@FindBy(xpath = "//input[contains(@value,'Update')]")
	private WebElement button_Update;

	@FindBy(xpath = "(//input[contains(@value,'Cancel')])[2]")
	private WebElement button_Cancel1;

	@FindBy(xpath = "(//input[contains(@value,'Cancel')])[3]")
	private WebElement button_Cancel2;

	@FindBy(xpath = "(//input[contains(@value,'Confirm')])[1]")
	private WebElement button_Confirm1;

	@FindBy(xpath = "(//input[contains(@value,'Confirm')])[2]")
	private WebElement button_Confirm2;

	@FindBy(xpath = "//span[contains(text(),'Are you sure you want to activate this Admin?')]")
	private WebElement label_PopupActivated;

	@FindBy(xpath = "//span[contains(text(),'Are you sure you want to deactivate this Admin?')]")
	private WebElement label_PopupDeactivated;

	@FindBy(xpath = "//span[contains(text(),'User has been activated successfully.')]")
	private WebElement label_Activated;

	@FindBy(xpath = "//span[contains(text(),'User has been deactivated successfully.')]")
	private WebElement label_Deactivated;

	// ############################################## Return Page Objects ###############################################
	public WebElement getClinicianManagers() {
		return header_EditClinicianManager;
	}

	public WebElement getButtonCancel() {
		return button_Cancel;
	}

	public WebElement getButtonDeactivate() {
		return button_Deactivate;
	}

	public WebElement getButtonActivate() {
		return button_Activate;
	}

	public WebElement getButtonUpdate() {
		return button_Update;
	}

	public WebElement getButtonCancel1() {
		return button_Cancel1;
	}

	public WebElement getButtonCancel2() {
		return button_Cancel2;
	}

	public WebElement getButtonConfirm1() {
		return button_Confirm1;
	}

	public WebElement getButtonConfirm2() {
		return button_Confirm2;
	}

	public WebElement getPopupActivated() {
		return label_PopupActivated;
	}

	public WebElement getPopupDeactivated() {
		return label_PopupDeactivated;
	}

	public WebElement getLabelActivated() {
		return label_Activated;
	}

	public WebElement getLabelDeactivated() {
		return label_Deactivated;
	}

}