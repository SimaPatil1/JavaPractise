package Coding;

import java.util.Scanner;

public class SimpleRateIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//simple rate of interest=(p*r*n)/100
     Scanner input=new Scanner(System.in);
     System.out.println("Welcome to calculate simple rate of interest");
     System.out.println("Please entre principle amount :");
     int principle=input.nextInt();
     System.out.println("Please Rate of intrest :");
     double rate=input.nextDouble();
     
     System.out.println("Please entre no of years :");
     int years=input.nextInt();
     
     double intrest=(principle*rate*years)/100;
     
     System.out.println("Your simple rate of interest :" +intrest);
	}

}
