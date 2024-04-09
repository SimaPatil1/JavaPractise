package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class ReadingExcleFile {

	//we use apache poi jar file for reading excle file
	//API-apache poi
	//
	public static void main(String[] args) throws Exception {
	//specfiy the location of excel file
		File src=new File("C:\\Users\\TORK\\Desktop\\PDI-DATA.xlsx");
		
		//load file
		FileInputStream fis=new FileInputStream(src);
		
		//load workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//Load worksheet
		XSSFSheet sh=wb.getSheet("Sheet1");
	
		//print the loaded sheet name
		System.out.println(sh.getSheetName());
	
		//print  from excle sheet
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(2).getStringCellValue());
	
		//print float/double from e
		System.out.println(sh.getRow(1).getCell(0).getNumericCellValue());
		
		//Print integer from excel sheet
		System.out.println((int)sh.getRow(1).getCell(0).getNumericCellValue());
	
		//print total number of rows- 1s way
		System.out.println("Total rows "+sh.getPhysicalNumberOfRows());
		
		//print -2nd way
		System.out.println("Total rows "+(sh.getLastRowNum()+1));
	
		//print total number of coumn- 1s way
	System.out.println("Total Number of column"+sh.getRow(1).getLastCellNum());
	
	
	 //print total number of columns - 2nd wau
	System.out.println("Total column :-" +sh.getRow(1).getPhysicalNumberOfCells());
	
	//real time implimentation
	 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com/");
	
	 //Entre username using excle file
	 String abc= sh.getRow(1).getCell(1).getStringCellValue();
	 driver.findElement(By.id("email")).sendKeys(abc);
	}

}
