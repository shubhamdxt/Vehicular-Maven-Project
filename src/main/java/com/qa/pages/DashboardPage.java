package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class DashboardPage extends BaseClass{
	
    @FindBy(xpath="//label[contains(text(),'Edit')]")
    WebElement editBtn;
    
    @FindBy(xpath="//input[@class='form-control' and @name='user_nickname']")
    WebElement nameEditField;
    
    @FindBy(xpath="//button[@class='btn btn-success btn-lg' and text()='Save/Update']")
    WebElement saveBtn;
    
    public DashboardPage() {
    	
		PageFactory.initElements(driver, this);
	}
    
    public void clickOnEditBtn() 
    {
    	editBtn.click();
    }
    
    public void nameFieldUpdate() {
    	nameEditField.sendKeys("shubhamkumar");
    }
    
    public void saveAndUpdateBtn() {
    	
    	saveBtn.click();
    }
}
