package Coding;

import java.util.Scanner;

public class Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greet();
		int first= readNumber()+1+1;
		int second= readNumber();
		
        int result=first+second;
        
        System.out.println(result);
        
	}
	 public static int readNumber() {
		 Scanner input=new Scanner(System.in);
	        System.out.print("Please entre the number :");
	        int number=input.nextInt();
	        return number;
	 }
	
	public static String greet() {
		System.out.println("Welcome to the calculator");
		return "greet";
	}

}
