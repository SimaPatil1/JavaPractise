package Coding;
import java.util.Scanner;
public class DifferentAgeGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input=new Scanner(System.in);
   System.out.println("Please tell me your age :");
	int age=input.nextInt();
	
	if(age>=60) {
		System.out.println("is a senior citizen");
	}else if(age>=20) {
		System.out.println("Is an adult");
	}else if(age>=13) {
		System.out.println("is teena");
		
	}else {
		System.out.println("is child");
	}
	
	
	
	}

}
