package Practise;

import java.util.Scanner;

public class SumOfDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       System.out.println("Welcome to the calculator");
       System.out.println("Please entre number");
       int num=input.nextInt();
       int sum= sumOfDigitNumber(num);
       System.out.println(sum);
     
	}
	public static int sumOfDigitNumber(int num) {
		int sum=0;
	
		while(num>0) {
			sum=sum+num%10; // sum +=num%10;
			num=num/10;   //num /=10;
		}
		return sum;
	}

}
