package Practise;

import java.util.Scanner;

public class MultiplicationTable  {
     //2=2*1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
		 System.out.println("Welcome to the multiplication table");
		 System.out.println("Please entre number :");
		 int num=input.nextInt();
		 printMultipleNumber(num);
	}
	public static int printMultipleNumber(int num) {
		int i=1;
	   while(i<=10) {
		   System.out.println(num+"*"+i+"="+(num*i));
		   i++;
		   
		   
	   }
	   return num;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		title();
//		multiplication();
//
//	}
//	public static int multiplication() {
//		 Scanner input= new Scanner(System.in);
//		 System.out.println("Please entre the number");
//		 int num=input.nextInt();
//		 
//		 for(int i=1;i<=10; i++) {
//			 int table=num*i;
//			 System.out.println(num +"*"+i +"="+ table);
//			 
//		    
//		 }
//		return num;
//	
//	}
//	
//	public static void title() {
//		System.out.println("Welcome to Multiplication Table ");
//	}
//
//}
