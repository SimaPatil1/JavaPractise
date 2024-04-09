package Coding;

import java.util.Scanner;

public class BitwiseOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input=new Scanner(System.in);
     System.out.println("Showcasing bitwise OR operator");
	 System.out.println("Please entre first number :");
	 int first=input.nextInt();
	 System.out.println("Now entre senconf number :");
	 int second=input.nextInt();
	 
	 int result=first | second;
	 System.out.println(result);
	 
	}

}
