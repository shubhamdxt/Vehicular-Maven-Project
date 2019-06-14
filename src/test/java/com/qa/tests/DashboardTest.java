package com.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.AddCarDetailPage;
import com.qa.pages.AddCarPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class DashboardTest extends BaseClass {
	HomePage homePage;
	LoginPage loginPage;
	AddCarPage addCarPage;
	 AddCarDetailPage addCarDetailPage;
	 DashboardPage dashboardPage;
	 
    public 	DashboardTest() {
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
		dashboardPage=new DashboardPage();
	    }
    @Test(priority=1)
    public void verifyEditBtn() throws Exception {
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
         System.out.println("befohtrhtrtrjr");
    	 addCarDetailPage.clicOnDashboardLink();
    	 Thread.sleep(3000);
    	 System.out.println("befor");
    	 dashboardPage.clickOnEditBtn();
    	 System.out.println("after");
    }
  /* 
     @Test(priority=2)
     public void verifyNameField() throws Exception {
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
        	 Thread.sleep(3000);
        	dashboardPage.clickOnEditBtn();
    	 Thread.sleep(3000);
    	 dashboardPage.nameFieldUpdate();
     
     }
     
     @Test(priority=3)
     public void verifySaveAndUpdatBtn() throws Exception 
     {
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
        	 Thread.sleep(3000);
        	dashboardPage.clickOnEditBtn();
    	   Thread.sleep(3000);
    	   dashboardPage.nameFieldUpdate();
    	   Thread.sleep(3000);
    	   dashboardPage.saveAndUpdateBtn(); 
     }*/
}
