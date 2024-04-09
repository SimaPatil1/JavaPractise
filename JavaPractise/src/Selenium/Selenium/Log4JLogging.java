package Selenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JLogging {

	public static void main(String[] args) {
		//create Logger instance 
		Logger logger=Logger.getLogger("Log4JLogging");
	
		//config log4j properties file		
	  PropertyConfigurator.configure("C:\\Users\\TORK\\eclipse-workspace\\JavaPractise\\target\\log4j.properties");
	
	//Open browser
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		 logger.info("chrome Browser Instance Opened");
	 
		 //Maximize the window
		 driver.manage().window().maximize();
		 logger.info("Window Maximzed");
		 
		 //Implicit wait
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     logger.info("Implicit wait Given");
	     
	     //Open URL
	     driver.get("https://www.facebook.com/");
	     logger.info("Application opened");
	 
	     
	     //Check if the web element is displayed or not
	     try {
			driver.findElement(By.id("emails")).isDisplayed();
			 logger.info("Web Element Displayed");
		} catch (Exception e) {
		logger.info("Failure- 'emails' webelement is not displayed");
		}
	
	}
}
