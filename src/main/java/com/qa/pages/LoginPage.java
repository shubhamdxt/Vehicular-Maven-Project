package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;


  public class LoginPage extends BaseClass{
	
  @FindBy(xpath="//a[text()='Login']")
   WebElement loginLink;

   @FindBy(xpath="(//input[contains(@name ,'email')])[2]")
   WebElement emailId;

   @FindBy(xpath="(//input[@name='password'])[2]")
   WebElement password;


   @FindBy(xpath="//a[text()='Forgot your password?']")
   WebElement forgotPasswordLink;

   @FindBy(xpath="(//button[text()='Login'])[1]")
   WebElement loginBtn;


   public LoginPage()   {
	PageFactory.initElements(driver, this);
   }

   public String validateLoginPageTitle(){
		return driver.getTitle();
	}
   
   public void clickLoginLink() {
	   
	   loginLink.click();
	   
   }   
   
   
   public HomePage login(String emid, String pwd){
	emailId.clear();
	emailId.sendKeys(emid);
	password.clear();
	password.sendKeys(pwd);
	loginBtn.click();
	    	
	return new HomePage();
}
   
   public AddCarPage loginForAddCar(String emid, String pwd){
		emailId.clear();
		emailId.sendKeys(emid);
		password.clear();
		password.sendKeys(pwd);
		loginBtn.click();
		    	
		return new AddCarPage();
	}
}
