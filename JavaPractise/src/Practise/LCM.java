package Practise;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       System.out.println("Please entre first number :");
       int first=input.nextInt();
       System.out.println("Please entre second number :");
       int second=input.nextInt();
       int lcm= lcm(first, second);
       System.out.println("LCM of two number is :" +lcm);
       
	}
	public static int lcm(int first, int second) {
		int i=1;
		//while(i <=second)
		while(true) {
			int factor=first*i;
			if(factor%second==0) {
				return factor;
			}
			i++;
		}		
	}	
}
