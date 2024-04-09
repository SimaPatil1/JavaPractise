package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://jqueryui.com/draggable/");	
	
	//switching the frame
		 driver.switchTo().frame(0);
		 System.out.println("Switch to frame");
		 
		 WebElement drag=driver.findElement(By.id("draggable"));
		 
		 
		 Actions a= new Actions(driver);
	    a.dragAndDropBy(drag, 20, 10).build().perform();
	
	//drag and web Element and click and hold using coordinated
	Thread.sleep(2000);
	a.clickAndHold(drag).dragAndDropBy(drag, 20,10).build().perform();
	
	System.out.println("succesfully done");
	
	}

}
