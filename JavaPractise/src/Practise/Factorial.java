package Practise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       System.out.println("Welcome to the factorial world");
       System.out.println("Please entre the number :");
       int num=input.nextInt();
       int f=factorialOf(num);
       System.out.println("Factorial of " + num + " is " +f);
	}
	public static int factorialOf(int num) {
		int fact=1;
		int n=num;
		for(int i=1;i<=num; i++) {
			fact=fact*i;
		}
		return fact;
	
	}

}
