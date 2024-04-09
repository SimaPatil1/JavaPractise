package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascritExecutor {
/*it is scripting langauge
 * JavascriptExecutor interface with executeScript() 
 * 
 * 
 */
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
        
		 //javaScriptExecutor
		 //typecasting
		 JavascriptExecutor js=(JavascriptExecutor) driver;
	     js.executeScript("document.getElementById('email').value='abc@gmail.com'");
	     js.executeScript("document.getElementById('pass').value='23'" );
	
	
	     //Scroll down using java script
	     Thread.sleep(2000);
	     js.executeScript("window.scrollBy(0,-350)");
	     Thread.sleep(2000);
	     js.executeScript("window.scrollBy(0,350)");
	
	}
}
