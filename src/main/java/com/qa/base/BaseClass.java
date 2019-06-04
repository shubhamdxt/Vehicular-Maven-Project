package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.util.TestUtil;
import com.qa.util.WebEventListener;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public BaseClass() {
		try {
		
			prop=new Properties();
		
			FileInputStream fileInputStream=new FileInputStream("G:\\New folder\\VehicularMavenProject\\src\\main\\java\\com\\qa\\config\\config.properties");
		     prop.load(fileInputStream);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\New folder\\EBikeDemo\\chromedriver.exe");
			driver=new ChromeDriver();
			
			
			e_driver = new EventFiringWebDriver(driver);
			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver = e_driver;
			
			driver.manage().window().maximize();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
			
			driver.get(prop.getProperty("url"));
			
		}
	}

}
