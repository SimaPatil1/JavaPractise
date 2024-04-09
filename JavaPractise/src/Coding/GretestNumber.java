package Coding;

import java.util.Scanner;

public class GretestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input=new Scanner(System.in);
     System.out.println("Find the greatest number");
	 System.out.print("Please entre first number :");
	 int firstNo=input.nextInt();
	 System.out.print("Please entre second number :");
	 int secondNo=input.nextInt();
      System.out.print("Please entre third number :");
     int thirdNo=input.nextInt();
	 if(firstNo>=secondNo && firstNo>=thirdNo) {
		 System.out.print("Greatest number is "+firstNo);
		 
	 }else if(secondNo>=thirdNo) {
		 System.out.println("Greatest number is :"+secondNo);
	 }else {
		 System.out.println("Greatest number is :"+thirdNo);
	 }
		
	
	}

}
