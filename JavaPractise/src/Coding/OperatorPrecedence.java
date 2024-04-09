package Coding;

import java.util.Scanner;

public class OperatorPrecedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //bitwise operator AND (&)
		Scanner input=new Scanner(System.in);
		System.out.println("Showcasing bitwise and operator");
		System.out.println("Please entre first number: ");
		int first=input.nextInt();
	    System.out.println("Now,entre second number: ");
	    int second=input.nextInt();
	    
	    int result= first & second;
	    System.out.println(result);
		
	
	
	}

}
