package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandling {
/*In case of frame, inside DOM we can see iframe tag
 * 
 * 
 */
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://paytm.com/");
	     driver.findElement(By.xpath("//*[text()='Sign In']")).click();
	
	     //find the total number of frames present
	     int allFrames=driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames:-"+allFrames);
	 //go  inside each frame and check if the element is present
	    for(int i=0;i<allFrames; i++) {
	    	driver.switchTo().frame(i);
	    	Thread.sleep(2000);	
	    driver.findElement(By.xpath("//*[@target='blank']")).click();
	    }
	    
	}

}
