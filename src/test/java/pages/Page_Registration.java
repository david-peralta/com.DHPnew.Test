package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_Registration extends Base {
	public Page_Registration() {
		PageFactory.initElements(webDriver, this);
	}

	// ############################################## Page Objects ###############################################
	@FindBy(xpath = "//select[contains(@id,'RegistrationData_RegistrationReason')]")
	private WebElement dropdown_WhatBringsYouHere;
	@FindBy(xpath = "//label[text()='What brings you here?']")
	private WebElement label_WhatBringsYouHere;

	// ############################################## Return Page Objects ###############################################

	public WebElement getDropdownWhatBringsYouHere() {
		return dropdown_WhatBringsYouHere;
	}

	public WebElement getLabelWhatBringsYouHere() {
		return label_WhatBringsYouHere;
	}
}
