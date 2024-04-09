package Coding;

import java.util.Scanner;

public class GradesBased {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input=new Scanner(System.in);
     System.out.println("Welcome to calculate Grade based");
	 System.out.print("Entre grade in %");
     int grade=input.nextInt();
    
	 
     if(grade>=90) {
    	 System.out.print("Grade is A");
     }else if(grade>=75) {
    	 System.out.println("Grade is B");
     }else if(grade>=60) {
    	 System.out.println("Grade is C");
     }else if(grade>=30) {
    	 System.out.println("Grade is D");
     }else if(grade<30) {
    	 System.out.println("Grade is F");
     }
     
     
	
	}

}
