package Coding;

import java.util.Scanner;

public class AreaOfTrianlge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input= new Scanner(System.in);
      
      System.out.println("Calculate the area of triangle");
      System.out.print("Please entre triangle base in cms :");
      double B=input.nextDouble();
      System.out.print("Now please entre triangle height in cms :");
      double H=input.nextDouble();
      
      double area=(1.0/2*B*H);
      
      System.out.println("Area of your triangle is : "+area);
      
	}

}
