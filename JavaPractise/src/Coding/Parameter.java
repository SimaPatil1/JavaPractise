package Coding;

public class Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=sumOfTwoNumber(10,11);//arguments
     int num1=sumOfTwoNumber(4,3);
     int num2=sumOfTwoNumber(-4,3);
     System.out.println(num);
     System.out.println(num1);
     System.out.println(num2);
      //System.out.println(sumOfTwoNumber(10,11));
	}
	                                 //parameter defination
	public static int sumOfTwoNumber(int first, int second) {
		System.out.println("First number is :" +first);
		System.out.println("Second number is :"+ second);
		
		int sum=first+second;
		return sum;
	}

}
