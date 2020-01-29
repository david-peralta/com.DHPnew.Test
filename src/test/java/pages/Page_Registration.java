package pages;

import helpers.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Registration extends Base {
	public Page_Registration() {
		PageFactory.initElements(webDriver, this);
	}

	// ############### DHP Reborn ###############
	@FindBy(xpath = "//select[contains(@id,'RegistrationData_RegistrationReason')]")
	private WebElement dropdown_WhatBringsYouHere;
	@FindBy(xpath = "//label[text()='What brings you here?']")
	private WebElement label_WhatBringsYouHere;


	// ############### DHP Reborn ###############
	// ############## Page Objects ##############

	public WebElement getDropdownWhatBringsYouHere() {
		return dropdown_WhatBringsYouHere;
	}

	public WebElement getLabelWhatBringsYouHere() {
		return label_WhatBringsYouHere;
	}
}
