package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_MyInfo extends Base {
	public Page_MyInfo() {
		PageFactory.initElements(webDriver, this);
	}

	// ################################################## Page Objects ##################################################
	@FindBy(xpath = "(//select[contains(@id,'LIFEEVENTTYPEID')])[1]")
	private WebElement dropdown_InfoType;
	@FindBy(xpath = "(//label[text()='Info Type'])[1]")
	private WebElement label_InfoType;
	@FindBy(xpath = "//input[@value='Add Info']")
	private WebElement button_AddInfo;
	@FindBy(xpath = "//div[contains(@id,'Title')]//span[contains(text(),'Wellness Check')]")
	private WebElement tab_WellnessCheck;
	@FindBy(xpath = "//div[contains(@id,'Title')]//div[contains(text(),'Timeline')]")
	private WebElement tab_Timeline;
	@FindBy(xpath = "//input[@value='Start Wellness Check']")
	private WebElement button_StartWellnessCheck;
	@FindBy(xpath = "//span[text()='How has your work or leisure life been?']")
	private WebElement label_WellnessCheckQuestion1;
	@FindBy(xpath = "//span[text()='Edited question one']")
	private WebElement label_WellnessCheckQuestion1Updated;
	@FindBy(xpath = "//span[text()='How have you been coping with your continence?']")
	private WebElement label_WellnessCheckQuestion2;
	@FindBy(xpath = "//span[text()='How has your mood been?']")
	private WebElement label_WellnessCheckQuestion3;
	@FindBy(xpath = "//span[text()='How has your relationship with your partner been?']")
	private WebElement label_WellnessCheckQuestion4;
	@FindBy(xpath = "//span[text()='How have you been coping with your sexual function?']")
	private WebElement label_WellnessCheckQuestion5;
	@FindBy(xpath = "//span[text()='My Info']//following::div//span[text()='Wellness Check']")
	private WebElement getWellnessCheckTabOnMyInfoPage;
	@FindBy(xpath = "(//span[text()='My Info']//following::div//span[text()='PSA'])[1]")
	private WebElement getPSATabOnMyInfoPage;

	@FindBy(xpath = "//img[contains(@src,'data:image/jpg;base64,iVBOR')]")
	private WebElement image_Logo;

	// Links - Footer
	@FindBy(xpath = "//img[contains(@src,'data:image/jpg;base64,iVBOR')]")
	private WebElement link_AboutUs;
	@FindBy(xpath = "//a[contains(text(),'Copyright and Disclaimer')]")
	private WebElement link_CopyRightAndDisclaimer;
	@FindBy(xpath = "//a[contains(text(),'Privacy')]")
	private WebElement link_Privacy;
	@FindBy(xpath = "//a[contains(text(),'Terms and Condition')]")
	private WebElement link_TermsAndCondition;
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	private WebElement link_ContactUs;
	@FindBy(xpath = "//a[contains(text(),'DB Results')]")
	private WebElement link_DBResults;

	// ################################################## Return Page Objects ##################################################
	public WebElement getPSATabOnMyInfoPage() {
		return getPSATabOnMyInfoPage;
	}

	public WebElement getWellnessCheckTabOnMyInfoPage() {
		return getWellnessCheckTabOnMyInfoPage;
	}

	public WebElement getWellnessCheckQuestion1() {
		return label_WellnessCheckQuestion1;
	}

	public WebElement getWellnessCheckQuestion1Updated() {
		return label_WellnessCheckQuestion1Updated;
	}

	public WebElement getWellnessCheckQuestion2() {
		return label_WellnessCheckQuestion2;
	}

	public WebElement getWellnessCheckQuestion3() {
		return label_WellnessCheckQuestion3;
	}

	public WebElement getWellnessCheckQuestion4() {
		return label_WellnessCheckQuestion4;
	}

	public WebElement getWellnessCheckQuestion5() {
		return label_WellnessCheckQuestion4;
	}

	public WebElement getStartWellnessCheckbutton() {
		return button_StartWellnessCheck;
	}

	public WebElement getTimelineTab() {
		return tab_Timeline;
	}

	public WebElement getWellnessCheckTab() {
		return tab_WellnessCheck;
	}

	public WebElement getLabelInfoType() {
		return label_InfoType;
	}

	public WebElement getButtonAddInfo() {
		return button_AddInfo;
	}

	public WebElement getDropdownInfoType() {
		return dropdown_InfoType;
	}

	public WebElement getImageLogo() {
		return image_Logo;
	}

	public WebElement getLinkContactUs() {
		return link_ContactUs;
	}
}
