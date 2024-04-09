package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNG7DataParameterization {

	WebDriver driver;
	
	@BeforeClass
	public void setEnv() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	     driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");	
	}
	@DataProvider
	public Object[][] dataSet() throws Exception{
		   //specify the location of properties file
		File src3=new File("C:\\Users\\TORK\\eclipse-workspace\\JavaPractise\\Repository\\testdata.properties");
		//file FileInputStream
		FileInputStream fis=new FileInputStream(src3);
	    //properties class
		Properties pro1=new Properties();
	    pro1.load(fis);
		
	    Object arr[][]=new Object[3][2];
	    arr[0][0]=pro1.getProperty("TestData1");
	    arr[0][1]=pro1.getProperty("TestData2");
	    
	    arr[1][0]="TestData2";
	    arr[1][1]="TestData2";
	    
	    arr[2][0]="TestData2";
	    arr[2][1]="TestData3";
	    
	    
	    
	    
	    return arr;
	}
	
	@Test(dataProvider="dataSet")
	public void enterData(String userName, String password) throws Exception {
	Thread.sleep(2000);
	driver.findElement(By.id("email")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys(userName);
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys(password);
	Thread.sleep(2000);
	
	}
}   

