package TestNG1;

public class testNG1 {

	@Test
	public void a2() {
		System.out.println("Hello a2 method");
	}
	@BeforeTest
	public void b() {
		System.out.println("Hello b method");
	}
	@BeforeSuite
	
	public void c() {
		System.out.println("Hello c method");
	}
	@AfterMethod
	public void d() {
		System.out.println("Hello d method");
	}
}
