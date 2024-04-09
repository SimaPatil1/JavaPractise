package Java;

public class static6 {
 int x=10; //global variable
 static int y=5; //static variable
 
 public void a() {
	 int z=10;
	 System.out.println(z);
 }
 static int b=6; //static variable
 public static void b() {
	 int a=5; //local variable
	 System.out.println(a); //5
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  static6 v=new static6();
  System.out.println(v.x);//10
  System.out.println(y);//5
  v.a();//10
  System.out.println(b);//6
  b();//5
  
	}

}
