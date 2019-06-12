package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class NewCarsPages extends BaseClass{
	
	@FindBy(xpath="(//a[text()='Send Inquiry'])[1]")
	WebElement sendEnqiryBtn;
	
	public NewCarsPages() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateNewCarsPagesTitle() 
	{
		return driver.getTitle();
	}
	public void clickSendEnqryBtn() {
		sendEnqiryBtn.click();
	}
}
