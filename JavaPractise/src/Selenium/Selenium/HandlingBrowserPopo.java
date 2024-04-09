package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingBrowserPopo {
//Unique alphanumeric id- getWindowHandles();
//	set for unique -does not allowed any duplication list allowed
//In case of list we use loop
	//in case of set we iterator-treated as loop concept it self
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/browser-windows");	
		 driver.findElement(By.xpath("//*[@id='tabButton']")).click();
       
//step-1-Tab handling
		 Thread.sleep(2000);
		//get the total no of open tab/windows
		 //set does not allowed duplicate byt list allowed
		 Set<String> allWindowsID=driver.getWindowHandles();
	     System.out.println(allWindowsID);
	
	     Iterator<String> abc=allWindowsID.iterator();
	     String win1=abc.next();
	     String win2=abc.next();
	
	     //print the title of current window
	     driver.switchTo().window(win1);
	     System.out.println("present Window ID:-"+win1);//alphanumarix
	     System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	
	     
	     //print the current url of child tab
	     Thread.sleep(2000);
	     driver.switchTo().window(win2);
	     Thread.sleep(2000);
	     System.out.println("Child window id" +win2);
	     System.out.println(driver.getCurrentUrl());
         driver.close();
	     
	//step2-window/pop handling
	     Thread.sleep(2000);
	     driver.switchTo().window(win1);
	     Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id='windowButton']")).click();
	
	  //print the title of child window
	      Set<String> allWindowID2=driver.getWindowHandles();
	     System.out.println(allWindowID2);
	     Iterator<String> abc1=allWindowsID.iterator();
	     String win3=abc1.next();
	     String win4=abc1.next();
	     Thread.sleep(2000);

	     System.out.println("child Window ID :-"+win4);
	     System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     Thread.sleep(2000);
	     System.out.println("Window popup and tab handled");
	}

}
