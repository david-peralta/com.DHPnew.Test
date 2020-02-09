package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_Details extends Base {
	public Page_Details() {
		PageFactory.initElements(webDriver, this);
	}

	// ############################################## Page Objects ###############################################
	@FindBy(xpath = "//div[text()='General']")
	private WebElement horizontaltab_General;
	@FindBy(xpath = "//div[text()='General' and @class ='tabs-header-item active']")
	private WebElement horizontaltab_GeneralDefault;
	@FindBy(xpath = "//div[text()='Speciality List']")
	private WebElement horizontaltab_SpecialityList;
	@FindBy(xpath = "//div[contains(text(),'Wellness Check')]")
	private WebElement horizontaltab_WellnessCheck;
	@FindBy(xpath = "//span[text()='Health Indicator']")
	private WebElement label_HealthIndicator;
	@FindBy(xpath = "//div[text()='Health Indicator Graph']")
	private WebElement option_HealthIndicatorGraph;
	@FindBy(xpath = "//input[contains(@id,'HealthIndicator')]")
	private WebElement toggle_HealthIndicator;

	/* Welllness Section */
	@FindBy(xpath = "//input[contains(@id,'CheckBox_WellnessCheckSelectAll')]")
	private WebElement checkbox_WellnessSelectAll;

	@FindBy(xpath = "//div[contains(text(),'Question')]")
	private WebElement column_Question;
	@FindBy(xpath = "//div[contains(text(),'Graph Legend')]")
	private WebElement column_GraphLegend;
	@FindBy(xpath = "(//div[contains(text(),'Select All')])[3]")
	private WebElement column_SelectAll;
	// View Questions
	@FindBy(xpath = "//input[contains(@value,'How has your work or leisure life been?')]")
	private WebElement display_Question1;
	@FindBy(xpath = "//input[contains(@value, 'How have you been coping with your continence?')]")
	private WebElement display_Question2;
	@FindBy(xpath = "//input[contains(@value,'How has your mood been')]")
	private WebElement display_Question3;
	@FindBy(xpath = "//input[contains(@value,'How has your relationship with your partner been?')] ")
	private WebElement display_Question4;
	@FindBy(xpath = "//input[contains(@value,'How have you been coping with your sexual function?')]")
	private WebElement display_Question5;
	// Input Questions
	@FindBy(xpath = "(//input[contains(@id,'Input_WellnessQuestion')])[1]")
	private WebElement input_question1;
	@FindBy(xpath = "(//input[contains(@id,'Input_WellnessQuestion')])[2]")
	private WebElement input_question2;
	@FindBy(xpath = "(//input[contains(@id,'Input_WellnessQuestion')])[3]")
	private WebElement input_question3;
	@FindBy(xpath = "(//input[contains(@id,'Input_WellnessQuestion')])[4]")
	private WebElement input_question4;
	@FindBy(xpath = "(//input[contains(@id,'Input_WellnessQuestion')])[5]")
	private WebElement input_question5;
	// Input Graph
	@FindBy(xpath = "(//input[contains(@id,'input_WellnessGraphLegend')])[1]")
	private WebElement input_graph1;
	@FindBy(xpath = "(//input[contains(@id,'input_WellnessGraphLegend')])[2]")
	private WebElement input_graph2;
	@FindBy(xpath = "(//input[contains(@id,'input_WellnessGraphLegend')])[3]")
	private WebElement input_graph3;
	@FindBy(xpath = "(//input[contains(@id,'input_WellnessGraphLegend')])[4]")
	private WebElement input_graph4;
	@FindBy(xpath = "(//input[contains(@id,'input_WellnessGraphLegend')])[5]")
	private WebElement input_graph5;

	@FindBy(xpath = "//a[contains(@class,'SaveRowAction')]")
	private WebElement button_Save;
	@FindBy(xpath = "//a[contains(@class,'CancelRowAction')]")
	private WebElement button_Cancel;

	// ############################################## Return Page Objects ###############################################
	public WebElement getToggleHealthIndicator() {
		return toggle_HealthIndicator;
	}

	public WebElement getoptionHealthIndicatorGraph() {
		return option_HealthIndicatorGraph;
	}

	public WebElement getlabel_HealthIndicator() {
		return label_HealthIndicator;
	}

	public WebElement getHorizontaltabGeneral() {
		return horizontaltab_General;
	}

	public WebElement getHorizontaltabSpecialityList() {
		return horizontaltab_SpecialityList;
	}

	public WebElement getHorizontaltabWellnessCheck() {
		return horizontaltab_WellnessCheck;
	}

	public WebElement getHorizontaltabGeneralDefault() {
		return horizontaltab_GeneralDefault;
	}

	public WebElement getCheckboxWellnessSelectAll() {
		return checkbox_WellnessSelectAll;
	}

	public WebElement getColumnnQuestion() {
		return column_Question;
	}

	public WebElement getColumnGraphLegend() {
		return column_GraphLegend;
	}

	public WebElement getColumnnSelectAll() {
		return column_SelectAll;
	}

	public WebElement getInputQuestion1() {
		return input_question1;
	}

	public WebElement getInputQuestion2() {
		return input_question2;
	}

	public WebElement getInputQuestion3() {
		return input_question3;
	}

	public WebElement getInputQuestion4() {
		return input_question4;
	}

	public WebElement getInputQuestion5() {
		return input_question5;
	}

	public WebElement getInputGraph1() {
		return input_graph1;

	}

	public WebElement getInputGraph2() {
		return input_graph2;

	}

	public WebElement getInputGraph3() {
		return input_graph3;

	}

	public WebElement getInputGraph4() {
		return input_graph4;

	}

	public WebElement getInputGraph5() {
		return input_graph5;

	}

	public WebElement getButtonSave() {
		return button_Save;

	}

	public WebElement getButtonCancel() {
		return button_Cancel;

	}
}
