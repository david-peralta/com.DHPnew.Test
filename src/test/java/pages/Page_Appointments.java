package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_Appointments extends Base {
	public Page_Appointments() {
		PageFactory.initElements(webDriver, this);
	}

	// ################################################## Page Objects ##################################################
	@FindBy(xpath = "//div[contains(@id,'Label') and text()='Appointments']")
	private WebElement menu_AppointmentsLink;
	@FindBy(xpath = "//input[@value='Request Appointment']")
	private WebElement button_RequestAppointments;
	@FindBy(xpath = "//span[text()='Appointments']")
	private WebElement label_AppointmentHeader;
	@FindBy(xpath = "(//div[contains(@id,'Consultation')]//following::div[contains(@id,'Content')])[1]")
	private WebElement label_AppointmentQuestion;
	@FindBy(xpath = "//span[contains(@id,'RequestAppointment_Label')]")
	private WebElement label_RequestAppointment;
	@FindBy(xpath = "//span[text()='Select Clinician']")
	private WebElement label_SelectClinicianHeader;
	@FindBy(xpath = "(//input[@value='See available time'])[1]")
	private WebElement button_BookClinician;
	@FindBy(xpath = "//div[contains(@id,'ClinicianDropDown_chosen')]")
	private WebElement dropdown_SelectAnotherClinician;
	@FindBy(xpath = "//span[text()='You may also select another Clinician']")
	private WebElement label_SelectAnotherClinician;
	@FindBy(xpath = "//div[@role='tablist']//div[text()='Select Clinician']")
	private WebElement label_SelectClinicianTimeline;
	@FindBy(xpath = "//div[@role='tablist']//div[text()='Select Clinician']")
	private WebElement label_SelectClinicianTimeline1stPage;

	@FindBy(xpath = "//td[@class='is-today']")
	private WebElement button_IsToday;
	@FindBy(xpath = "//div[contains(@id,'datetimecontainer')]")
	private WebElement container_AppointmentDateTime;
	@FindBy(xpath = "(//a[contains(text(),'-')])[1]")
	private WebElement button_AppointmentTime;
	@FindBy(xpath = "//span[text()='In Clinic Visit']")
	private WebElement button_InClinicVisit;
	@FindBy(xpath = "//input[@value='Next']")
	private WebElement button_AppointmentNext;
	@FindBy(xpath = "//input[contains(@id,'Terms')]")
	private WebElement checkbox_RequestAppointmentConsent;
	@FindBy(xpath = "//input[@value='Send Request']")
	private WebElement button_SendRequest;
	@FindBy(xpath = "//div[@class='light-modal-title' and contains(text(),'Thank you')]")
	private WebElement popup_SuccessAppointmentRequest;
	@FindBy(xpath = "//div[@class='button-ctn-modal']//input[@value='Close']")
	private WebElement button_CloseSuccessAppointmentRequest;
	@FindBy(xpath = "//input[@value='Start Assessment']")
	private WebElement button_StartAssesment;

	// ############################################## Return Page Objects ###############################################
	public WebElement getAppointmentsLink() {
		return menu_AppointmentsLink;
	}

	public WebElement getRequestAppointmentButton() {
		return button_RequestAppointments;
	}

	public WebElement getAppointmentHeader() {
		return label_AppointmentHeader;
	}

	public WebElement getAppointmentQuestion() {
		return label_AppointmentQuestion;
	}

	public WebElement getRequestAppointmentLabel() {
		return label_RequestAppointment;
	}

	public WebElement getSelectClinicianHeader() {
		return label_SelectClinicianHeader;
	}

	public WebElement getBookClinician() {
		return button_BookClinician;
	}

	public WebElement getSelectAnotherClinician() {
		return dropdown_SelectAnotherClinician;
	}

	public WebElement getSelectAnotherClinicianLabel() {
		return label_SelectAnotherClinician;
	}

	public WebElement getSelectClinicianTimeline() {
		return label_SelectClinicianTimeline;
	}

	public WebElement getSelectClinicianTimeline1stPage() {
		return label_SelectClinicianTimeline1stPage;
	}

	public WebElement getAppointmentDateIsToday() {
		return button_IsToday;
	}

	public WebElement getAppointmentDateTimeContainer() {
		return container_AppointmentDateTime;
	}

	public WebElement getAppointmentTime() {
		return button_AppointmentTime;
	}

	public WebElement getButtonClinicVisit() {
		return button_InClinicVisit;
	}

	public WebElement getButtonNext() {
		return button_AppointmentNext;
	}

	public WebElement getCheckboxRequestAppointmentConsent() {
		return checkbox_RequestAppointmentConsent;
	}

	public WebElement getButtonSendRequest() {
		return button_SendRequest;
	}

	public WebElement getSuccessAppointmentRequest() {
		return popup_SuccessAppointmentRequest;
	}

	public WebElement getCloseSuccessAppointmentRequest() {
		return button_CloseSuccessAppointmentRequest;
	}

	public WebElement getStartAssesment() {
		return button_StartAssesment;
	}
}