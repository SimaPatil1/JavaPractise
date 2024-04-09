package Coding;

import java.util.Scanner;

public class Shorthand {
 public static void main(String args[]) {
	 int a= 5;
	 Scanner input=new Scanner(System.in);
	 
	 int x1=input.nextInt();
	 a+=x1;  //a+=x1  means a=a+x1
	    //a-=x2
	 System.out.println("Please added x1 :"+a);
	 
	 int x2=input.nextInt();
	 a-=x2;
	 System.out.println("Please added x2:"+a);
	 
	 int x3=input.nextInt();
	 a*=x3;
	 System.out.println("Please added x3:"+a);
 }
}
