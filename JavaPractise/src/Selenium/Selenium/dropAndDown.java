package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropAndDown {
//Mostly dropdown will have tagname as 'select'
//dropdown value will have tag'option'
	
/*Method available in select class
 * getFirstSelectedOption()-gives text of current selected option in the dropdown
 * selectByVisibleText("April")-select the dropdown value using visible text
 * selectByValue("4")
 * selectByIndex(6)
 * getOptions()-total dropdown value in the dropdown
 * 
 */
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		     //Crete object of chromeDriver class
		     //webdriver is interface- so it contain only abstract method
			//in chromeDriver class has defination 	
			
		     WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.facebook.com/");
		     
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		     Thread.sleep(2000);
			
		     //1st way
	       List<WebElement> birthMonth=driver.findElements(By.xpath("//select[@id='month']/option"));
	     System.out.println("Total Dropdown Values:-"+birthMonth.size());
	     birthMonth.get(8).click();
	
	     //2nd way
	     WebElement bm=driver.findElement(By.xpath("//select[@id='month']"));
	     Select month=new Select(bm);             
	     Thread.sleep(2000);
	     month.selectByVisibleText("Apr");
	     Thread.sleep(2000);
	     month.selectByValue("12");
	    Thread.sleep(2000);
	    month.selectByIndex(7);
	   
	    System.out.println(month.getFirstSelectedOption().getText());
	    
//	List<WebElement> selectedOptions=month.getAllSelectedOptions();
//	
//	for(WebElement option: selectedOptions) {
//		System.out.println(option.getText());
//
//	}
	
//	List<WebElement> selectedOptions = month.getAllSelectedOptions();
//	for (WebElement option : selectedOptions) {
//	    System.out.println(option.getText());
//	}

	    
	    //3rd way 
	List<WebElement> dropdown=month.getOptions();
	for(int i=0; i<dropdown.size(); i++) {
		if(dropdown.get(i).getText().equalsIgnoreCase("Sep")) {
	     dropdown.get(i).click();
		}
		}
		
		List<WebElement> dropdown2=month.getOptions();
		for(WebElement option: dropdown2) {
			if(option.getText().equalsIgnoreCase("dec")) {
				option.click();
			}
		}
		
		//4th way
		bm.sendKeys("Jun");
		
		//5th way
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
		
		
		//check if dropdown support muti selection
		System.out.println(month.isMultiple());//false
		month.selectByVisibleText("Apr");
		month.selectByValue("12");//dec
		month.selectByIndex(7);
		
		//deselected the multi selected value from dropdown
	   month.deselectByIndex(3);
	   month.deselectByValue("3");
	   month.deselectByVisibleText("Apr");
	   month.deselectAll();
	
	
	   driver.manage().timeout().implicitlywait(10,SECOND);
	}
	
	
	}


