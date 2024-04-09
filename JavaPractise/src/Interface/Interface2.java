package Interface;

public class Interface2 implements Interface1 {

	public void a() {
		System.out.println();
	}
	
	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Interface2 i2=new Interface2();
		i2.a();
	    i2.c();
	}
	

}
