package Coding;

import java.util.Scanner;

public class BitwiseComplimentNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input= new Scanner(System.in);
    System.out.println("Showcasing the bitwiseCompliment/not operator\n");
	System.out.println("Please enter first number");
	int first=input.nextInt();
	
	 
	int result=~first;
	System.out.println(result);
	
	
	}

}
