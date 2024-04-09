package Java;

public class Static5 {
    static int z=5;
    int y=1;
     //static method
    public static void a() {
    	z=10;
    	System.out.println(z);
    }
    //non static method
     public void b() {
    z=15;
    System.out.println(z);//15
    a();//10
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      a();//10
      Static5 c=new Static5();
      c.b();
      
	}

}
