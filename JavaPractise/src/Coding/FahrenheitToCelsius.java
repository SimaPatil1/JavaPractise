package Coding;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //C=(F-32)*5/9
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to covert fahrenheit to celsius");
		System.out.print("Entre temprature in Fahrenheit ");
		
		float F=input.nextFloat();
		
		Float C=(F-32)*5/9;
		
		System.out.println(F + " degrees Fahrenheit is equal to " + C + " degrees Celsius.");
	}

}
