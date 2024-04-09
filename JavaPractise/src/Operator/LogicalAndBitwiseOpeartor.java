package Operator;

public class LogicalAndBitwiseOpeartor {
 //logical (&&) does not check second condition if first condition is false.
 //bitwise(&)-always checks the both conditions whether first condition is true or false
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=10;  //local variable
       int b=10; //local variable
       int c=20; //local variable
       //logical operator
       
       System.out.println(a++>b&&a++ >c); //false
	   System.out.println(a);//11
       //bitwise operator
       System.out.println(a<b & a++<c); //false
	   System.out.println(a);//12
	}

}
