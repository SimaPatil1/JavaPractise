package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class alert {
//Alert interface using accept()and dismiss method
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/alerts");
		 
		 driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 //Verify alert text
		 
	     String alertText=driver.switchTo().alert().getText();
	     String expAlertText="You clicked a button";
	     Assert.assertEquals(alertText, expAlertText);
	     System.out.println("Alert text verified");
	  
	     //Accept the alert
	     driver.switchTo().alert().accept();
	     System.out.println("Alert accepted");
	     
	     //Dismiss the alert
	     driver.findElement(By.id("confirmButton")).click();
	    Thread.sleep(2000);
	    System.out.println("Alert is dismissed");
	
	
	
	}

}
