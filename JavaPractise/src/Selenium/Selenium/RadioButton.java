package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButton {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome browser and path of chrome driver
     System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
     //Crete object of chromeDriver class
     //webdriver is interface- so it contain only abstract method
	//in chromeDriver class has defination 	
	
     WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
     
     
     driver.get("https://www.facebook.com/");
     Thread.sleep(2000);
    
     //By is class and xpath is method
     //1st way- radio button handle
     driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@value='1']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@value='2']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@value='-1']")).click();
	
	//2nd way
     //when more than one web element you have handle that time list
	List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
     System.out.println("Total radio Buttons:"+radios.size());
     System.out.println(radios.get(0).isSelected());
     System.out.println(radios.get(1).isEnabled());
     System.out.println(radios.get(2).isDisplayed());
	
	Thread.sleep(2000);
	radios.get(1).click();//male
	Thread.sleep(2000);
	System.out.println(radios.get(2).isSelected());//false
	radios.get(0).click();//female
	
	System.out.println(radios.get(1).isSelected()); //false
	radios.get(2).click();
	
	//3rd way
	List<WebElement> radios1=driver.findElements(By.xpath("//label[@class='_58mt']"));
	System.out.println(radios1.size());
	radios1.get(0).click();
	System.out.println(radios1.get(0).isSelected());
	System.out.println(radios1.get(0).getText());
	String expResults="Female";
	for(int i=0; i<radios1.size();i++) {
		if(radios1.get(i).getText().equalsIgnoreCase(expResults)) {
			radios1.get(i).click();
		  System.out.println(expResults+ "clicked");
		  break;
		}
	}
	
	
	
	}

}
