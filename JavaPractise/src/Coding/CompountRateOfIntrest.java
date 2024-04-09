package Coding;

import java.util.Scanner;

public class CompountRateOfIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //CI= P(1+r/100)^n
		//principle, rate of interest,n- no of years
		Scanner input= new Scanner(System.in);
		System.out.println("Welcome to the compount interest calculator");
		System.out.print("Please entre the principle amount in rp ");
		int principle=input.nextInt();
		
		System.out.print("Now tell the rate of interest");
		float rate=input.nextFloat();
		
		System.out.print("Please entre no of years");
		float years=input.nextFloat();
		
		double CI=principle* Math.pow(1 +rate / 100, years);
		
		System.out.println("Compount interet is: "+CI);
	}

}
