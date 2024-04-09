package Selenium;

import org.testng.SkipException;
import org.testng.annotations.Test;

//Skip test case
public class testNG4 {
   //@Test- 1st way
   public void a() {
	   System.out.println("a test method");
   }
   //2nd way - widely used in maket
    @Test(enabled=false)
   public void b() {
	   System.out.println("b test method");
   }
    
    @Test(enabled= true)
    public void c() {
 	   System.out.println("c test method");
    }
    //Multiple time
    @Test(invocationCount= 2)
    public void d() {
 	   System.out.println("d test method");
    }
    //3rd way
    //Invocation=0 means no execution
    @Test(invocationCount= 0)
    public void e() {
 	   System.out.println("e test method");
    }
    //conditional skipping
    @Test
    public void f() {
    	System.out.println("F test method");
    	throw new SkipException("Skippng f test method");
    }
}
