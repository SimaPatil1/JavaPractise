package Operator;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=10; //local variable
      a +=3;  //a=a+3 //do not pass space between + and =
      System.out.println(a);//13
      
      a -=3;
      System.out.println(a);//10
      
      a -=5;
      System.out.println(a);//10-5=5
	  a *=3;
	  System.out.println(a);//15
	  
	  a/=2;
	  System.out.println(a);//7.5
	
	}

}
