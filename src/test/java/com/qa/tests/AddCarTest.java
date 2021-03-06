package com.qa.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.AddCarPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class AddCarTest extends BaseClass{

	HomePage homePage;
	LoginPage loginPage;
	AddCarPage addCarPage;
	 
    public 	AddCarTest() {
    	super();
    }
    
    
    @BeforeMethod
     public void setUP() {
    	initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		addCarPage=new AddCarPage();
	 }
    
   
/*    @Test(priority=1 )
    public void verifySelctCategory() throws Exception 
    {
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
    	addCarPage=loginPage.loginForAddCar(prop.getProperty("emailId"), prop.getProperty("password"));
     	Thread.sleep(2000);
     	homePage.clickSellYourCarAdd();
     	Thread.sleep(2000);
     	addCarPage.selectCategory();
    	Thread.sleep(2000);
    
    }
    
    
    @Test(priority=2 )
    public void verifySelctFuel() throws Exception 
    {
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
    	addCarPage=loginPage.loginForAddCar(prop.getProperty("emailId"), prop.getProperty("password"));
     	Thread.sleep(2000);
     	homePage.clickSellYourCarAdd();
     	Thread.sleep(2000);
     	addCarPage.selectCategory();
     	Thread.sleep(2000);
     	addCarPage.selectFuel();;
    	Thread.sleep(2000);
    
    }
    
    @Test(priority=3 )
    public void verifySelctYear() throws Exception 
    {
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
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
    
    }
    
    @Test(priority=4 )
    public void verifySelctMake() throws Exception 
    {
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
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
    }
    */
    /*@Test(priority=5 )
    public void verifySelctModel() throws Exception 
    {
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
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
        Thread.sleep(3000);
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
    }
    
    
    @Test(priority=6 )
    public void verifySelctTrim() throws Exception 
    {
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
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
        Thread.sleep(2000);
    }
    
    @Test(priority=7 )
    public void verifyEnterAdvName() throws Exception 
    {
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
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
        Thread.sleep(2000);
        addCarPage.enterAdvName();
        Thread.sleep(2000);
    }
    
    @Test(priority=8 )
    public void verifyEnterSelling() throws Exception 
    {
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
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
        Thread.sleep(2000);
        addCarPage.enterAdvName();
        Thread.sleep(2000);
        addCarPage.enterSellingPrice();
        Thread.sleep(2000);
    }
    
    @Test(priority=9 )
    public void verifyTransmission() throws Exception 
    {
    	homePage.clickSellYourCarLink();
    	Thread.sleep(2000);
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
    }*/
    
    @Test(priority=10 )
    public void verifyProceedBtn() throws Exception 
    {
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
    }
    
   /* @AfterMethod
	   public void tearDown()
     {
		driver.quit();
	 }*/  
}
