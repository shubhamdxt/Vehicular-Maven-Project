package com.qa.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.AddCarDetailPage;
import com.qa.pages.AddCarPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class AddCarDetailsTest extends BaseClass{
	
	HomePage homePage;
	LoginPage loginPage;
	AddCarPage addCarPage;
	 AddCarDetailPage addCarDetailPage;
	 
    public 	AddCarDetailsTest() {
    	super();
    }
    
    
    @BeforeMethod
     public void setUP() 
        {
    	initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		addCarPage=new AddCarPage();
		addCarDetailPage=new AddCarDetailPage();
		
	    }
    
     @Test(priority=1)
     public void verifyDashboardLink() throws Exception {
     	homePage.clickSellYourCarLink();
     	try {
 			Thread.sleep(5000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
     	addCarPage=loginPage.loginForAddCar(prop.getProperty("emailId"), prop.getProperty("password"));
      	Thread.sleep(2000);
      	homePage.clickSellYourCarAdd();
         Thread.sleep(2000);
      	addCarPage.selectCategory();
      	Thread.sleep(2000);
      	addCarPage.selectFuel();;
     	Thread.sleep(2000);
         addCarPage.selectYear();
         Thread.sleep(2000);
         addCarPage.selectMake();
         Thread.sleep(2000);
         addCarPage.selectModel();
         Thread.sleep(2000);
         addCarPage.selectTrim();
         Thread.sleep(3000);
         addCarPage.enterAdvName();
         Thread.sleep(3000);
         addCarPage.enterSellingPrice();
         Thread.sleep(3000);
         addCarPage.selectTransmission();
         Thread.sleep(3000);
         addCarPage.clickProceedBtn();
         Thread.sleep(3000);
    	 addCarDetailPage.clicOnDashboardLink();
    	 
     }
}
