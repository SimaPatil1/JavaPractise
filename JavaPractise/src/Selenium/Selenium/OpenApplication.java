package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenApplication {

   public static void main(String[] args) throws Exception {
		//we should set the property of chrome driver(property, path of chrome driver) 
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
   //we are setting the property of chrome browser and passing chrome driver path
		//without system explicitly you dont need to download chrome driver again and again
		//WebDriverManager.chromedriver().setup();
        
		
		//lunching chrome browser instance
		WebDriver driver=new ChromeDriver();
       //WebDriver is componenet/interface and its only have abstract method 
        // so there is no such type of body less
        //Then why we create object of chromedriver class
        //If you wish to launch the application of chrome browser
       //Whatever method declare the here(webdriver-interface)all the method implemention/defination present inside the chromedriver class 
        
        
		//open url using get method
        driver.get("https://www.facebook.com/");
        
		//WebDriverManager.edgedriver().setup();
//     	WebDriver driver1=new EdgeDriver();
//		driver1.get("https://www.facebook.com/");
	   //explicitly pass the wait
        Thread.sleep(2000);
        
        
        driver.manage().window().maximize();
	//delete all cookies
        driver.manage().deleteAllCookies();
        
        //open url using navigate() method
   Thread.sleep(2000);
   driver.navigate().to("https://www.google.com/");
   driver.navigate().refresh();
   Thread.sleep(2000);
   driver.navigate().back();
   
   Thread.sleep(2000);
   driver.navigate().forward();
   
   //fetch current URL
   Thread.sleep(2000);
   System.out.println(driver.getCurrentUrl());
   
   //get title
   Thread.sleep(2000);
   System.out.println(driver.getTitle());
   
   //close browser
   driver.close();
   
   }

}



/*  //tagName[@attributeName='attributeValue']
 *   //tagName[contains(@attributeName,'attributeValue')]
 *   //tagname[text()='Exact text']
 *   //tagName[contains(text(),'')]
 * 
 * 
 * 
 * 
 */

