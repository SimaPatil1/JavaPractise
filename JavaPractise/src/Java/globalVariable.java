package Java;

public class globalVariable {
   int b=10; //global variable
   static int c=5; //static variable
	
   public static void day() {
	   int e=15;
	   System.out.println(e); //15
   }
   
   public void f() {
	   int g=5;
	   System.out.println(g);
   }
   
   
   public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=6; //local variable
    
    //static member calling
    
    
    System.out.println(a); //6
    System.out.println(c);//5
    day();//15
    
    System.out.println(globalVariable.c); //5
    globalVariable.day();//15
    
    //Non static member calling
    
    globalVariable t=new globalVariable();
    //static variable
    System.out.println(t.b); //10
    //static method
    t.f();  //5
    
	}
	

}
