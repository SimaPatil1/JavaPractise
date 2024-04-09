package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
/*WebDriver is directed to 
 * wait until a certain condition 
 * occurs before proceeding with 
 * executing the code.
 * By default polling time of explicit wait 500 miliseconds
 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	     //Crete object of chromeDriver class
	     //webdriver is interface- so it contain only abstract method
		//in chromeDriver class has defination 	
		
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
	   //enterUserName
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("patilsima08@gmail.com");
       //fetch input box attribute value
		System.out.println(driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value"));
	 //get height of input box\
		System.out.println(driver.findElement(By.id("email")).getSize().getHeight());	
		//get width of input box\
				System.out.println(driver.findElement(By.id("email")).getSize().getWidth());	
	
//Use Explicit wait to check password is visible
	WebDriverWait wt=new WebDriverWait(driver,30);
	wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("124");
	
	
	}

}
