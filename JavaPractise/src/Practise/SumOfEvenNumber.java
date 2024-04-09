package Practise;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("Please entre the number :");
        int num=input.nextInt();
        int sum= sumOfEvenNumber(num);
        System.out.println(sum);
	}
	public static int sumOfEvenNumber(int num) {
		int sum=0;
		int i=2;
		while(i<=num) {
			sum +=i;
			i +=2;
			
		}
		return sum;
	}

}
