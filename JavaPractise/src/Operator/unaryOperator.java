package Operator;

public class unaryOperator {

	//Java operator is used to perform operations
	//Types
	//1. Unary opeartor
	//2.Arithmatic operator
	//3. Assignament operator
	//4. Logical
	//5 Bitwise operator
	//6 relational operator
	
	//Unary operator- 4 different terminology
	//1 pre Increment and post increment- incrementing by 1
	//1 pre decrement and post decrement- decrementing by 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=1; //defining local variable  
	System.out.println(++a); //pre incre 2
	System.out.println(a++);  //post incremenr 2,3
	System.out.println(a);//3
	System.out.println(--a); //pre decre 2
	System.out.println(a--);  //post decremenr 2,1
	System.out.println(a++);  //1,2
	System.out.println(a); //2
	}

}
