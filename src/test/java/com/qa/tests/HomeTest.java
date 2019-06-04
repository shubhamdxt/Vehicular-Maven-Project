package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomeTest extends BaseClass{
	
	HomePage homePage;
	LoginPage loginPage;
	 
    public 	HomeTest() {
    	super();
    }
    
    
    @BeforeMethod
     public void setUP() {
    	initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
	 }
    
    @Test(priority=1)
    public void virfySellYourCarLink() throws Exception {
    	
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
    }
    
    @Test(priority=2)
    public void verifyLogin() throws Exception {
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
    	homePage=loginPage.login(prop.getProperty("emailId"), prop.getProperty("password"));
    }
    
       @AfterMethod
	   public void tearDown()
    {
		driver.quit();
	}
}
