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

	@FindBy(xpath = "//span[text()='I want more information about my condition']")
	private WebElement button_Reason1;
	@FindBy(xpath = "//span[text()='I want to speak about treatment side effects']")
	private WebElement button_Reason2;
	@FindBy(xpath = "//span[text()='I want to speak about my mood and relationships']")
	private WebElement button_Reason3;
	@FindBy(xpath = "//span[text()='I am not sure']")
	private WebElement button_Reason4;
	@FindBy(xpath = "(//input[@value='Begin Health Assessment'])[1]")
	private WebElement button_StartAssessmentTOP;

	@FindBy(xpath = "//div[text()='Assessments']")
	private WebElement menubar_Assessment;

	@FindBy(xpath = "//div[text()='Appointments']")
	private WebElement menubar_Appointments;
	@FindBy(xpath = "//input[@value='Request Appointment']")
	private WebElement button_RequestAppointment;
	@FindBy(xpath = "//span[text()='What would you like to talk about?']")
	private WebElement label_SelectReason;

	@FindBy(xpath = "//div[text()='Anxiety']")
	private WebElement progressBar_Anxiety;
	@FindBy(xpath = "(//div[text()='1'])[1]")
	private WebElement progressBar_1;
	@FindBy(xpath = "//input[@value='Anxiety']")
	private WebElement checkbox_Anxiety;

	@FindBy(xpath = "//span[contains(text(),'Anxiety')]")
	private WebElement label_AnxietyResults;
	@FindBy(xpath = "//span[contains(text(),'Physical Activity')]")
	private WebElement label_PhysicalActivityResults;
	@FindBy(xpath = "//span[text()='Assessment Results']")
	private WebElement label_AssessmentResults;
	@FindBy(xpath = "(//div[text()='1'])[1]/following::div[text()='Needs']")
	private WebElement label_FirstPageNeeds;
	@FindBy(xpath = "(//div[text()='2'])[1]/following::div[text()='Depression']")
	private WebElement label_SecondPageDepression;
	@FindBy(xpath = "(//div[text()='3'])[1]/following::div[text()='Anxiety']")
	private WebElement label_ThirdPageAnxiety;
	@FindBy(xpath = "(//div[text()='4'])[1]/following::div[text()='Physical Activity']")
	private WebElement label_FourthPagePhysicalActivity;
	@FindBy(xpath = "(//div[text()='Physical Activity'])[1]")
	private WebElement label_PhysicalActivityQuestions;

	@FindBy(xpath = "//div[text()='Assessments']")
	private WebElement menubar_Assessments;

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

	public WebElement getButtonReason1() {
		return button_Reason1;
	}

	public WebElement getStartAssessmentTOPButton() {
		return button_StartAssessmentTOP;
	}

	public WebElement getButtonReason2() {
		return button_Reason2;
	}

	public WebElement getButtonReason3() {
		return button_Reason3;
	}

	public WebElement getButtonReason4() {
		return button_Reason4;
	}

	public WebElement getAssessmentMenubar() {
		return menubar_Assessment;
	}

	public WebElement getSelectReasonQuestion() {
		return label_SelectReason;
	}

	public WebElement getPhysicalActivityResultsLabel() {
		return label_PhysicalActivityResults;
	}

	public WebElement getAnxietyResultsLabel() {
		return label_AnxietyResults;
	}

	public WebElement getPhysicalActivityQuestionsLabel() {
		return label_PhysicalActivityQuestions;
	}

	public WebElement getFirstPageNeeds() {
		return label_FirstPageNeeds;
	}

	public WebElement getFourthPagePhysicalActivity() {
		return label_FourthPagePhysicalActivity;
	}

	public WebElement getThirdPageAnxiety() {
		return label_ThirdPageAnxiety;
	}

	public WebElement getSecondPageDepression() {
		return label_SecondPageDepression;
	}

	public WebElement getAssessmentResultsLabel() {
		return label_AssessmentResults;
	}

	public WebElement getAnxietyProgressBar() {
		return progressBar_Anxiety;
	}

	public WebElement getAnxietyCheckbox() {
		return checkbox_Anxiety;
	}

	public WebElement getProgressBar1() {
		return progressBar_1;
	}

	public WebElement getRequestAppointmentButton() {
		return button_RequestAppointment;
	}

	public WebElement getAppointmentsMenubar() {
		return menubar_Appointments;
	}

	public WebElement getMenubarAssessments() {
		return menubar_Assessments;
	}

}
