package Oops;

public class Inheritance4 extends Inheritance3 {

	
	public void multiply(int x, int y) {
		z=x*y;
		System.out.println("multiplication :"+z);	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int x=20, y=10;
  
  Inheritance4 t=new Inheritance4();
  t.add(x, y);
  t.substract(30, 10);
  t.multiply(10, 3);
	}

}
