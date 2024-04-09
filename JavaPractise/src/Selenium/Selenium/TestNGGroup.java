package Selenium;

import org.testng.annotations.Test;

public class TestNGGroup {

	  @Test(groups = {"sanity"})
	    public void test1() {
	        // Test logic
		  System.out.println("Sanity");
	    }

	    @Test(groups = {"regression"})
	    public void test2() {
	        System.out.println("regression");
	    }

	    @Test(groups = {"sanity", "regression"})
	    public void test3() {
	        System.out.println("sanity + regression");
	    }
	}
	
}
