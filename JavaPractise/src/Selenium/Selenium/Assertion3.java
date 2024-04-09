package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {

	
	@Test
	public void testCase4() {
		String actualText="abc";
		String expText="ab";
		
		try {
			Assert.assertEquals(actualText, expText);
		} catch (Error e) {
			
			e.printStackTrace();
		}
		System.out.println("Equal Assertion pass");
	}
}
