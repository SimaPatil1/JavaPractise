package Practise;

import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         Scanner input= new Scanner(System.in);
//    		System.out.println("Please entre number");
// 	        int num=input.nextInt();
		int num=5;
 	        int sum=sumOfOddNumber(num);
 	        System.out.println(sum);
    	}
	 public static int sumOfOddNumber(int num) {
		 int sum=0;
		 int i=1;
		 while(i<=num){
			 sum +=i;
			 i +=2;
		 }

		return sum;
	 }
    	 
     
	}


