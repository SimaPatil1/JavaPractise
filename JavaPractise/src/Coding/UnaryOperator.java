package Coding;

public class UnaryOperator {
//- converts a positive value to a negative x=-y
	public static void main(String args[]) {
		int x=5;
		int y=-x;
		int z=-y;
		System.out.println(y);
		System.out.println(z);
			
		//pre increment x=++y - increment the value by1 and then use it in our statement
		//pre decrement x=--y decrement the value by 1 and then use it in our statement
//		 int a=5;
//		 ++a;
//		 
//		 System.out.println(a);
//		 
//		 int b=9;
//		 --b;
//		 System.out.println(b);
//		 
		 //post increment - user current value in the statement and then increment it by 1
         //post decrement- use current value in the statement and then decrement it by1
	    
		int c=20;
		
		System.out.println(c++);
	    System.out.println(c);
	    
	    int d=10;
	    System.out.println(++d); //11
	    System.out.println(--d);//10
	    System.out.println(d--);//10
	    System.out.println(d);//9
	    
	}
}
