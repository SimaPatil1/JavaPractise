package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakesScreenshot2OnFailure2 {
	TakeScreenShotOnFailure1 t1=new TakeScreenShotOnFailure1();
	
	@Test
	public void doLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	     t1.driver=new ChromeDriver();
		 t1.driver.manage().window().maximize();
		 t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 t1.driver.get("https://www.facebook.com/");	
	
		 Thread.sleep(2000);
		 t1.driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		 t1.driver.findElement(By.id("pass")).sendKeys("abc@gmail.com");
	//pass wrong id so that test case will fail
		 t1.driver.findElement(By.id("email_wrong")).sendKeys("abc@gmail.com");
	}
	
	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		t1.captureScreenshot(result2);
	}
	
}
