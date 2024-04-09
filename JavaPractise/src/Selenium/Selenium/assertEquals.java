package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertEquals {
   WebDriver driver;
	
	@Test
	public void testCae1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");	
	//equals	 
		 String actualResult=driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		 String expectResult="Facebook helps you connect and share with the people in your life.";
	 
	     Assert.assertEquals(actualResult, expectResult);
	     System.out.println("Equal assertion passed");
	
	//  False 
	     Assert.assertFalse(driver.findElement(By.xpath("//h2[@class='_8eso']")).isSelected());
	     System.out.println("False assertion verified");
	     
	 //True
	     Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='_8eso']")).isDisplayed());
	     System.out.println("True assertion verified");
	     System.out.println("hello hit");
	     System.out.println("ok added");
	}
}
