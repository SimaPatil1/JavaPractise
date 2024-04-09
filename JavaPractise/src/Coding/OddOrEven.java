package Coding;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input=new Scanner(System.in);
     System.out.println("Please entre Number");
     int number=input.nextInt();
     if(number%2==0) {
    	 System.out.println("Number is even");
     }else {
    	 System.out.println("Number is odd");
     }
     
	}

}
