package Coding;

import java.util.Scanner;

public class BitwiseXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Bitwise XOR both same(1& 0 will be 0, otherwise 1) 
	//1010 (10)^ 1110(14)= 0100
		Scanner input=new Scanner(System.in);
		System.out.println("Showcasing bitwise XOR operator");
		System.out.println("Please entre first number");
	  int first=input.nextInt();
	  System.out.println("Now, entre second number :");
	  int second=input.nextInt();
	  
	  int result=first ^ second;
	  
	  System.out.println(result);
	
	}

}
