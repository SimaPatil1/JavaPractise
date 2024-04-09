package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

//TakesScreenshot interface-is treaded as listener
//which will provide as execution status and test case name

public class TakeScreenShotOnFailure1 {
     WebDriver driver;
    //ITestResult will provide us the test case execution status and test ame

     public void captureScreenshot(ITestResult result) throws Exception {
    	 if(ITestResult.FAILURE==result.getStatus()) {
    
    //create ref of TakesScreenshot Interface and type casting		 
    	TakesScreenshot ts=(TakesScreenshot) driver; // Type casting of 2 interfaces
    //Use getScreenshotAs() method to capture the screenshot file	 
    	//getScreenshotAs() -method return type= FILE
    	 
    	File sourceFile=ts.getScreenshotAs(OutputType.FILE); 
    	 
    	//Copy the file to specific location
    	//. use for project location
    	File destFolder=new File("./screenshots" +result.getName()+".png");
    	FileUtils.copyFile(sourceFile, destFolder);
    	System.out.println(result.getName()+"method()screenshot captured");
    	 
    	 }
     }


}
