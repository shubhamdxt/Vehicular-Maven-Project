package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.BaseClass;

public class AddCarDetailPage extends BaseClass{
	
  @FindBy(xpath="//a[text()='Dashboard']")
   WebElement dashboardLink;
	
	public AddCarDetailPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateAddCarDetailPageTitle() 
	{
		//Assert.assertEquals("https://vehicular.co.za/home/detail/myadv/?ref=99", driver.getCurrentUrl());
		return driver.getTitle();
	}
	
	
	public DashboardPage clicOnDashboardLink() 
	{
		dashboardLink.click();
		
		return new DashboardPage();
	}
	
	
}
