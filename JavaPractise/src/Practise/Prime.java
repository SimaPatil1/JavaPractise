package Practise;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input=new Scanner(System.in);
      System.out.println("Please entre the number :");
     int num=input.nextInt();
     boolean isPrime=isPrime(num);
     if(isPrime) {
    	 System.out.println("Your number is prime");
     }else {
    	 System.out.println("Your number is not prime");
     }
	}
    	 public static boolean isPrime(int num) {
    		 for(int i=2;i<num; i++) {
    			 if(num%i==0) {
    				 return false;
    			 }
    			 
    		 }
    		 return true;
    	 
     
	}


}
