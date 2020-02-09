package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_ContactUs extends Base {
	public Page_ContactUs() {
		PageFactory.initElements(webDriver, this);
	}

	// ################################################## Page Objects ##################################################
	@FindBy(xpath = "//span[text()='CONTACT US']")
	private WebElement header_ContactUs;

	@FindBy(xpath = "//span[text()='Send us a message!']")
	private WebElement title_Message;

	@FindBy(xpath = "//select[contains(@id,'cu_topics')]")
	private WebElement dropdown_Topic;
	@FindBy(xpath = "//textarea[contains(@id,'cu_message')]")
	private WebElement textarea_Message;
	@FindBy(xpath = "//input[contains(@id,'cu_checkbox')]")
	private WebElement checkbox_Copy;
	@FindBy(xpath = "//input[contains(@value,'Send Message')]")
	private WebElement button_SendMessage;

	// Footer - Contact
	@FindBy(xpath = "//span[contains(text(),'Level 8 14-20 Blackwood Street')]")
	private WebElement footer_Address1;
	@FindBy(xpath = "//span[contains(text(),'North Melbourne VIC 3051')]")
	private WebElement footer_Address2;
	@FindBy(xpath = "//span[contains(text(),'noreply@apc.org.au')]")
	private WebElement footer_Email;
	@FindBy(xpath = "//span[contains(text(),'+61 (03) 8373 7600')]")
	private WebElement footer_Number;

	// ############################################## Return Page Objects ###############################################
	public WebElement getHeaderContactUs() {
		return header_ContactUs;
	}

	public WebElement getTitleSendMessage() {
		return title_Message;
	}

	public WebElement getfooterAddress1() {
		return footer_Address1;
	}

	public WebElement getfooterAddress2() {
		return footer_Address2;
	}

	public WebElement getfooterEmail() {
		return footer_Email;
	}

	public WebElement getfooterNumber() {
		return footer_Number;
	}

	public WebElement getButtonSendMessage() {
		return button_SendMessage;
	}

}