package Selenium;

import org.testng.annotations.Test;

public class testNG3 {
	@Test(priority=-10)
	public void a() {
		System.out.println("Hello a method");
	}
	@Test(priority=2)
	public void b() {
		System.out.println("Hello b method");
	}
	@Test(priority=0)
	public void d() {
		System.out.println("Hello d method");
	}
	@Test
	public void c() {
		System.out.println("Hello c method");
	}

}
