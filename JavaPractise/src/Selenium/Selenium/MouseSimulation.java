package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {
/*always deal with action
 */
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://www.flipkart.com/");
         Thread.sleep(2000);
		
     //Create Electronics web element ref    
         WebElement electro=driver.findElement(By.xpath("//*[text()='Electronics']"));
        //Mouce simulatior using action class
         
		Actions a=new Actions(driver);
	   a.moveToElement(electro).build().perform();
	
	   //keyboard operation
	   Thread.sleep(2000);
	   driver.navigate().refresh();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
	   System.out.println("ok");
	   
	   WebElement fash=driver.findElement(By.xpath("//*[text()='Fashion']"));
	    Thread.sleep(2000);
	    a.sendKeys(fash, Keys.ENTER).build().perform();
	  System.out.println("Fashion option clicked");
	
	//right click on webpage
	  Thread.sleep(2000);
	  a.contextClick().build().perform();
	
	
	}

}
