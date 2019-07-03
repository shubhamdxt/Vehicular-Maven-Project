package com.qa.tests;

import org.openqa.selenium.support.CacheLookup;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginTest extends BaseClass{
	HomePage homePage;
	LoginPage loginPage;
	 
    public 	LoginTest() {
    	super();
    }
    
    
    @BeforeMethod
    
    public void setUP() {
    	initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
    }
    
	@Test(priority=1)
	public void verifyLoginPageTitle() 
	{
		
		//String title=loginPage.validateLoginPageTitle();
	//	Assert.assertEquals(true, loginPage.validateLoginPageTitle());
	}
	
    
    @Test(priority=2)
    public void verifyLoginLink() throws Exception 
    {
    	Thread.sleep(2000);
    	loginPage.clickLoginLink();
    	Thread.sleep(2000);
    }
    
    @Test(priority=3)
    public void verifyLogin() throws Exception {
    	Thread.sleep(2000);
    	loginPage.clickLoginLink();
    	Thread.sleep(2000);
    	   try 
    	   {
    		if(prop.getProperty("emailId").isEmpty() && prop.getProperty("password").isEmpty())
    		{
    			System.out.println("Please Enter email id && password");
    		}
    		else {
    			homePage=loginPage.login(prop.getProperty("emailId"), prop.getProperty("password"));
			}
    	
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		
    		System.out.println("Emaild not found: " + e.getMessage());
		}
    	Thread.sleep(2000);
    	Assert.assertEquals(prop.get("url"), driver.getCurrentUrl());
    }
    
    @AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
