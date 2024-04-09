package Practise;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       System.out.println("Welcome to the Fibonacci series");
       System.out.print("Please entre number upto which Fibonacci series print :");
	  int num=input.nextInt();
	  printFibonacci(num); 
	
	}
	public static void printFibonacci(int num) {
		if(num <0)return;
		System.out.println("0 ");
		if(num== 0)return;
		System.out.println("1 ");
		 int first =0, second=1;
		 while(first +second <=num) {
			 int third=first+second;
			 System.out.println(third+ " ");
			 first  =second;
			 second = third;
		 }
		}
	}


