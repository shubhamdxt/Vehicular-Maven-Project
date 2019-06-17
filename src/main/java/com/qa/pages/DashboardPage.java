package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class DashboardPage extends BaseClass{
	
    @FindBy(xpath="//label[contains(text(),'Edit')]")
    WebElement editBtn;
    
    @FindBy(xpath="(//input[contains(@name , 'user_nickname')])[1]")
    
   // @FindBy(xpath="//*[@id=\"formAccount\"]/div/div[1]/div/div[2]/div[1]/div/div/input")
  //  @FindBy(xpath="//input[@name='user_reg_number']")
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
