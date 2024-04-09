package Coding;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Equality == checks value equality
		//Inequality != checks value inequality
		//order of relational operator is less then arithmetic operator
	  Scanner input=new Scanner(System.in);
	   //And (&)-All condition must be true
	   //or(||)-only one one condition must be true
	  //not(!)
	  //lower priority than Math and comparison
	  System.out.println("Welcome to ticket discount calculator");
	  System.out.println("Please entre your age : ");
	  int age=input.nextInt();
	  System.out.println("Are you a female?(true/false) : ");
	  boolean isFemale=input.nextBoolean();
	  if(age<5) {
		  System.out.println("You got 75% discount");
	  }else if(isFemale){
		  System.out.println("You got 50% discount");
	  }else if(age>60 && !isFemale){
		  System.out.println("You got 25 % discount");
	  }else {
		  System.out.println("You got no discount");
	  }
	   
	
	}

}
