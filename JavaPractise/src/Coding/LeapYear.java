package Coding;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input=new Scanner(System.in);
	System.out.println("Calculate leap year");
    System.out.println("Please entre the year");
    int year=input.nextInt();
    
    if(year%4==0 && year%100!=0 || year%400==0 ) {
    	System.out.println(year+"is the leap year");
    }else {
    	System.out.println(year+"isn't leap year");
    }
	}

}
