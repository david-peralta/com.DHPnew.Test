package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_AccountDeactivated extends Base {
	public Page_AccountDeactivated() {
		PageFactory.initElements(webDriver, this);
	}

	// ################################################## Page Objects ##################################################
	@FindBy(xpath = "//span[text()='your user account has been deactivated']")
	private WebElement header_DeactivatedUser;

	@FindBy(xpath = "//span[text()='Please contact your system admin to reactivate your user account.']")
	private WebElement laben_ContactAdmin;

	// ############################################## Return Page Objects ###############################################
	public WebElement getHeaderDeactivatedUser() {
		return header_DeactivatedUser;
	}

	public WebElement getLabelDeactivatedContact() {
		return laben_ContactAdmin;
	}

}