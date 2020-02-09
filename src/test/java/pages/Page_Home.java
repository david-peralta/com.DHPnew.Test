package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_Home extends Base {
	public Page_Home() {
		PageFactory.initElements(webDriver, this);
	}

	// ################################################## Page Objects ##################################################
	@FindBy(xpath = "//span[text() = 'Home']//parent::a")
	private WebElement button_Home;

	@FindBy(xpath = "//a[text() = 'Logout']")
	private WebElement button_Logout;

	@FindBy(xpath = "//span[text() = 'Maintenance']//parent::a")
	private WebElement button_Maintenance;

	@FindBy(xpath = "//a[contains(@class, 'notification')]")
	private WebElement button_Notifications;

	@FindBy(xpath = "//span[text() = 'Projects']//parent::a")
	private WebElement button_Projects;

	@FindBy(xpath = "//span[text() = 'Reports']//parent::a")
	private WebElement button_Reports;

	@FindBy(xpath = "//span[text() = 'Time Sheets']//parent::a")
	private WebElement button_TimeSheets;

	@FindBy(xpath = "//span[text() = 'Users']//parent::a")
	private WebElement button_Users;

	// DHP Reborned
	@FindBy(xpath = "//input[contains(@id,'btnLogin')]")
	private WebElement button_LogIn;
	@FindBy(xpath = "//input[contains(@id,'btnRegister')]")
	private WebElement button_Register;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement link_LogInOnFooter;

	// ############################################## Return Page Objects ###############################################
	public WebElement getLogInLinkOnFooter() {
		return link_LogInOnFooter;
	}

	public WebElement getLogInButton() {
		return button_LogIn;
	}

	public WebElement getRegisterButton() {
		return button_Register;
	}

	public WebElement getButtonHome() {
		return button_Home;
	}

	public WebElement getButtonLogout() {
		return button_Logout;
	}

	public WebElement getButtonMaintenance() {
		return button_Maintenance;
	}

	public WebElement getButtonNotifications() {
		return button_Notifications;
	}

	public WebElement getButtonProjects() {
		return button_Projects;
	}

	public WebElement getButtonReports() {
		return button_Reports;
	}

	public WebElement getButtonTimeSheets() {
		return button_TimeSheets;
	}

	public WebElement getButtonUsers() {
		return button_Users;
	}
}