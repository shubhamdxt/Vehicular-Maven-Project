package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.BaseClass;

 public class AddCarPage extends BaseClass{
	
	@FindBy(xpath="//select[@name='filter_category_id']")
	WebElement selectCategory;
	
	@FindBy(xpath="//select[@name='filter_fuel_id']")
	WebElement selectFuel;
	
	@FindBy(xpath="(//select[@class='BMApi'])[1]")
	WebElement selectYear;
	
	@FindBy(xpath="(//select[@class='form-control BMApi'])[1]")
	WebElement selectMake;
	
	@FindBy(xpath="(//select[@class='BMApi'])[2]")
	WebElement selectModel;
	
	@FindBy(xpath="(//select[@class='BMApi'])[3]")
	WebElement selectTrim;
	 
	@FindBy(xpath="(//input[@class='form-control parsley-error'])[1]")
	WebElement enterAdvName;
	
	@FindBy(xpath="(//input[@class='form-control parsley-error'])[2]")
	WebElement enterSellingPrice;
	
	@FindBy(xpath="(//select[@class='parsley-error'])")
	WebElement selectTransmission;
	
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proceedBtn;
	
	
	 public AddCarPage() 
		{
			PageFactory.initElements(driver, this);
		}
     
	 public String validateHomePageTitle() 
		{
			return driver.getTitle();
		}
	 
	
	 public void selectCategory() 
	 {
		Select selectCat=new Select(selectCategory) ;
		selectCat.selectByVisibleText("new");
		
	 }
	 
	 public void selectFuel() 
	 {
		Select selectCat=new Select(selectFuel) ;
		selectCat.selectByVisibleText("Petrol");
		
	 }
	 
	 public void selectYear() 
	 {
		Select selectCat=new Select(selectYear) ;
		selectCat.selectByVisibleText("1938");
		
	 }
	 
	 public void selectMake() 
	 {
		Select selectCat=new Select(selectMake) ;
		selectCat.selectByVisibleText("abarth");
		
	 }
	 
	 public void selectModel() 
	 {
		Select selectCat=new Select(selectModel) ;
		selectCat.selectByVisibleText("1000 Bialbero");
		

	 }

	 public void selectTrim() 
	 {
		Select selectCat=new Select(selectTrim) ;
		selectCat.selectByVisibleText("Spider Pininfarina");
		
	 }
	 public void enterAdvName() {
		 enterAdvName.sendKeys("my adv");
	 }
	 
	 public void enterSellingPrice() {
		 enterSellingPrice.sendKeys("200");
	 }
	 
	 public void selectTransmission() 
	 {
		Select selectCat=new Select(selectTransmission) ;
		selectCat.selectByVisibleText("Automatic");
		

	 }
}
