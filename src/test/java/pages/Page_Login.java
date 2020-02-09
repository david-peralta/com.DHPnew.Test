package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_Login extends Base {
	public Page_Login() {
		PageFactory.initElements(webDriver, this);
	}

	// ############################################## Page Objects ###############################################
	@FindBy(xpath = "//input[@value = 'Register']")
	private WebElement button_RegisterButton;
	@FindBy(xpath = "//input[@value = 'Login']")
	private WebElement button_LoginButton;
	@FindBy(xpath = "//input[contains(@id,'UserNameInput')]")
	private WebElement input_EmailAddress;
	@FindBy(xpath = "//input[contains(@id,'UserNameInput') and contains(@placeholder,'This field can') and contains(@placeholder,'t be empty')]")
	private WebElement input_ValidatedEmptyEmailAddress;
	@FindBy(xpath = "//span[text()='Email address is incorrect. Please try again']")
	private WebElement input_ValidatedInvalidEmailAddress;
	@FindBy(xpath = "//input[contains(@id,'PasswordInput')]")
	private WebElement input_UserPassword;
	@FindBy(xpath = "//input[contains(@id,'PasswordInput') and contains(@placeholder,'This field can') and contains(@placeholder,'t be empty')]")
	private WebElement input_ValidatedEmptyUserPassword;
	@FindBy(xpath = "//span[text()='Password is incorrect. Please try again.']")
	private WebElement input_ValidatedInvalidUserPassword;
	@FindBy(xpath = "//span[contains(text(),'Forgot password?')]")
	private WebElement link_ForgotPassword;
	@FindBy(xpath = "//input[contains(@id,'PasswordInput') and @type = 'password']")
	private WebElement masked_Password;

	// ############################################## Return Page Objects ###############################################
	public WebElement getValidatedInvalidUserPassword() {
		return input_ValidatedInvalidUserPassword;
	}

	public WebElement getValidatedInvalidEmailAddress() {
		return input_ValidatedInvalidEmailAddress;
	}

	public WebElement getValidatedEmptyUserPassword() {
		return input_ValidatedEmptyUserPassword;
	}

	public WebElement getValidatedEmptyEmailAddress() {
		return input_ValidatedEmptyEmailAddress;
	}

	public WebElement getIfPasswordFieldisMasked() {
		return masked_Password;
	}

	public WebElement getButtonRegister() {
		return button_RegisterButton;
	}

	public WebElement getInputEmailAddress() {
		return input_EmailAddress;
	}

	public WebElement getInputUserPassword() {
		return input_UserPassword;
	}

	public WebElement getButtonLogin() {
		return button_LoginButton;
	}

	public WebElement getForgotPasswordlink() {
		return link_ForgotPassword;
	}

}
