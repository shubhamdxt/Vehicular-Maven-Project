package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.AddCarPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomeTest extends BaseClass{
	
	HomePage homePage;
	LoginPage loginPage;
	AddCarPage addCarPage; 
    public 	HomeTest() {
    	super();
    }
    
    
    @BeforeMethod
     public void setUP() {
    	initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		addCarPage=new AddCarPage();
	 }
    
    @Test(priority=1)
    public void verifyHomePageTitle() {
    	String title=homePage.validateHomePageTitle();
    	Assert.assertEquals(title, driver.getTitle());
    }
    
    
    @Test(priority=2)
    public void virfySellYourCarLink() throws Exception {
    	
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
    }
    
    @Test(priority=3)
    public void verifyLoginAddCar() throws Exception {
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
    	addCarPage=loginPage.loginForAddCar(prop.getProperty("emailId"), prop.getProperty("password"));
    }
    
    @Test(priority=4)
    public void verifySellYorCarAdd() throws Exception {
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
    	addCarPage=loginPage.loginForAddCar(prop.getProperty("emailId"), prop.getProperty("password"));
    	Thread.sleep(2000);
    	homePage.clickSellYourCarAdd();
    }
       @AfterMethod
	   public void tearDown()
    {
		driver.quit();
	}
}
