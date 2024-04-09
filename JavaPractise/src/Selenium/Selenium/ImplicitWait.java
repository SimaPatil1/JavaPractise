package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
/*Selenium WebDriver to wait 
 * for a certain measure of 
 * time before throwing an exception. 
 * Once this time is set, 
 * WebDriver will wait for the 
 * element before the exception 
 * occurs.
 * 
 */
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
	   //Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff works");
	//Handle autosuggestion
		 List<WebElement> allSuggestions=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	
	 for(int i=0; i<allSuggestions.size();i++) {
		 if(allSuggestions.get(i).getText().equalsIgnoreCase("How stuff works quiz")) {
			 allSuggestions.get(i).click();
			break;
		 }
	 }
	}

}
