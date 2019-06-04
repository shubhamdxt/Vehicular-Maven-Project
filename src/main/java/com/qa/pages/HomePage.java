package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//a[text()='New Cars ']")
	WebElement newCarLink;

	@FindBy(xpath = "(//select[@class='form-control BMApi'])[1]")
	WebElement selectBrand;
	
	@FindBy(xpath="(//a[text()=' Sell Your Car'])[1]")
	WebElement sellYorCarLink;

	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() 
	{
		return driver.getTitle();
	}

	public void clickSellYourCarLink() 
	{
		sellYorCarLink.click();
	}

	
}
