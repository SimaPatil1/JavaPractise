package Coding;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    System.out.println("Please entre number");
	int Number=input.nextInt();
	
	if(Number>0) {
		System.out.println("Number is positive");
	
	}else if(Number<0) {
		System.out.println("Number is Negative");
	}else if(Number==0) {
		System.out.println("Your number is zero");
		
	}
	}

}
