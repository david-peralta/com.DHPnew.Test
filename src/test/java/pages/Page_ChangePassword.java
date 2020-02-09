package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_ChangePassword extends Base {
	public Page_ChangePassword() {
		PageFactory.initElements(webDriver, this);
	}

	// ################################################## Page Objects ##################################################
	@FindBy(xpath = "//span[text()='Change password']")
	private WebElement header_ChangePassword;

	@FindBy(xpath = "//input[contains(@id,'Input_CurrentPassword')]")
	private WebElement input_CurrentPassword;

	@FindBy(xpath = "//input[contains(@id,'Input_NewPassword')]")
	private WebElement input_NewPassword;

	@FindBy(xpath = "//input[contains(@id,'Input_ConfirmPassword')]")
	private WebElement input_ConfirmPassword;

	@FindBy(xpath = "//input[contains(@value,'Cancel')]")
	private WebElement button_Cancel;

	@FindBy(xpath = "//input[contains(@value,'Submit')]")
	private WebElement button_Submit;

	// ############################################## Return Page Objects ###############################################
	public WebElement getHeaderChangePassword() {
		return header_ChangePassword;
	}

	public WebElement getInputCurrentPassword() {
		return input_CurrentPassword;
	}

	public WebElement getInputNewPassword() {
		return input_NewPassword;
	}

	public WebElement getInputConfirmPassword() {
		return input_ConfirmPassword;
	}
}