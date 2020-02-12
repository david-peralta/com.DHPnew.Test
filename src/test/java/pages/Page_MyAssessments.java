package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_MyAssessments extends Base {
	public Page_MyAssessments() {
		PageFactory.initElements(webDriver, this);
	}

	// ################################################## Page Objects ##################################################
	@FindBy(xpath = "//div[contains(@id,'Title')]//span[text()='Assessments']")
	private WebElement header_Assessments;

	@FindBy(xpath = "//div[contains(@id,'Title')]//div[text()='Needs']")
	private WebElement header_Needs;

	@FindBy(xpath = "//div[contains(@id,'Title')]//div[text()='Depression']")
	private WebElement header_Depression;

	@FindBy(xpath = "//div[contains(@id,'Title')]//div[text()='Anxiety']")
	private WebElement header_Anxiety;

	@FindBy(xpath = "//div[contains(@id,'Title')]//div[text()='PhysicalActivity']")
	private WebElement header_PhysicalActivity;

	@FindBy(xpath = "//div[contains(@id,'MainContent')]//span[text()='Assessments']")
	private WebElement text_Assessments;

	@FindBy(xpath = "//input[contains(@value,'Begin Health Assessment')]")
	private WebElement button_BeginHealthAssessment;

	@FindBy(xpath = "//input[contains(@value,'Back')]")
	private WebElement button_Back;

	@FindBy(xpath = "//input[contains(@value,'Next')]")
	private WebElement button_Next;

	@FindBy(xpath = "//input[contains(@value,'Save')]")
	private WebElement button_Save;

	@FindBy(xpath = "// div[contains(@id,'WizardItemWrapper')]//div[contains(text(),'Needs')]")
	private WebElement progress_Needs;

	@FindBy(xpath = "// div[contains(@id,'WizardItemWrapper')]//div[contains(text(),'Depression')]")
	private WebElement progress_Depression;

	@FindBy(xpath = "// div[contains(@id,'WizardItemWrapper')]//div[contains(text(),'Anxiety')]")
	private WebElement progress_Anxiety;

	@FindBy(xpath = "// div[contains(@id,'WizardItemWrapper')]//div[contains(text(),'Physical Activity')]")
	private WebElement progress_PhysicalActivity;

	// ############################################## Return Page Objects ###############################################

	public WebElement getHeader_Assessments() {
		return header_Assessments;
	}

	public WebElement getHeader_Needs() {
		return header_Needs;
	}

	public WebElement getHeader_Depression() {
		return header_Depression;
	}

	public WebElement getHeader_Anxiety() {
		return header_Anxiety;
	}

	public WebElement getHeader_PhysicalActivity() {
		return header_PhysicalActivity;
	}

	public WebElement getTextAssessment() {
		return text_Assessments;
	}

	public WebElement getButtonAssessment() {
		return button_BeginHealthAssessment;
	}

	public WebElement getButtonBack() {
		return button_Back;
	}

	public WebElement getButtonNext() {
		return button_Next;
	}

	public WebElement getButtonSave() {
		return button_Save;
	}

	public WebElement getProgress_Needs() {
		return progress_Needs;
	}

	public WebElement getProgress_Depression() {
		return progress_Depression;
	}

	public WebElement getProgress_Anxiety() {
		return progress_Anxiety;
	}

	public WebElement getProgress_PhysicalActivity() {
		return progress_PhysicalActivity;
	}

}
