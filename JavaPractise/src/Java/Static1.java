package Java;

public class Static1 {
      int x=100;
      String s="tork";
      static int y=9;
      //static method
      public static void method() {
    	  String x="hello";
    	  System.out.println(x);
      }
      //non static method
      public void method2() {
    	  int i=100;   //local variable
       System.out.println(i);
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub"Unable to find chargers Please try again".
    //non static global variable
		Static1 t=new Static1();
		
		System.out.println(t.x);//100
		System.out.println(t.s);//
		//static variable
		System.out.println(y); //9
		
		//static method
		method();
		Static1.method(); //100
		
		//non static method
		t.method2();//100
	}

}
