package Coding;

import java.util.Scanner;

public class LeftShift {
//<< double the number  number *2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    
    System.out.println("Welcome to showcase LeftShift operator\n");
	System.out.println("Please entre your number :");
    int num=input.nextInt();
    
    int result= num<<4;
    System.out.println(result);
	
	}

}
