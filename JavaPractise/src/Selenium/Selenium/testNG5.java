package Selenium;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG5 {
	
	@Test
	public void a() {
		   System.out.println("a test method");
	   }
	   
	    @Test(invocationCount=2, priority=-1, enabled=false & true)
	   public void b() {
		   System.out.println("b test method");
	   }
	    
	    @Test(invocationCount= 2)
	    public void c() {
	 	   System.out.println("c test method");
	    }
	    //Multiple time
	    @BeforeMethod
	    public void d() {
	 	   System.out.println("d test method");
	    }
}
	    