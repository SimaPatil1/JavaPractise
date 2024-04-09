package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		//specify location of properties files
       File src1=new File("C:\\Users\\TORK\\eclipse-workspace\\JavaPractise\\Repository\\config.properties");
       File src2=new File("C:\\Users\\TORK\\eclipse-workspace\\JavaPractise\\Repository\\locators.properties");
       File src3=new File("C:\\Users\\TORK\\eclipse-workspace\\JavaPractise\\Repository\\testdata.properties");
	
       //create fileInputStram class object to load the file
       FileInputStream fis1=new FileInputStream(src1);
       FileInputStream fis2=new FileInputStream(src2);
   	   FileInputStream fis3=new FileInputStream(src3);
	 
   	  //create properties class object to read properties file
   		Properties pro1=new Properties();	   
	    pro1.load(fis1);
	 
	    Properties pro2=new Properties();
	    pro2.load(fis2);
	    
	    Properties pro3=new Properties();
	    pro3.load(fis3);
	    System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	   
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get(pro1.getProperty("URL"));
	     //driver.get(pro1.getProperty("URL2"));
	 //getProperty method will accept key and return value of the key
	     driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
	     driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
	}

}
