package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion2 {

	@Test
	public void testCase2() {
	String actualText="ab";
	String expText= "ab";
	int a=10;
	int b=20;
	//equals assertion
	
	Assert.assertEquals(actualText, expText,"Actual and Expected are not matching");
     System.out.println("Equal Assertion Pass");
	
	//False Assertion
     Assert.assertFalse(a>b, "Assertion false is not satisfying");
	System.out.println("False Assertion Pass");
	
	//True Assertion
    Assert.assertTrue(a<b, "Assertion true is not satisfying");
	System.out.println("True Assertion Pass");
	
	//Assertion failed, execution will stop here
	//further line of code will not execute
	
	}
	
	@Test
	public void testcase3() {
		//Assertion is written in testcase2 () method
		//Scope of assertion will be limited to testCase2() method onlu
	}
	
	
}
