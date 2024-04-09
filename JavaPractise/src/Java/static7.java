package Java;

public class static7 {
	String a;  //global variable
	int b; //global variable
	static int c=4; //static variable
	
	//static method
	public static void a() {
		System.out.println("Hello Static");
	}
	public static void main(String[] args) {
		static7 s7= new static7();
		s7.a="Selenium";
		s7.b=1;
		c=2;
		a();
		
		System.out.println(s7.a);
		System.out.println(s7.b);
		System.out.println(c);
		System.out.println(s7.a+" "+s7.b+" "+c);
	   
		int j=5;
		j=j; //variable initolization with same variable
	System.out.println(j);
	
	}

}
