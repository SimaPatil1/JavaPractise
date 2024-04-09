package Practise;

public class reverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       String str=Integer.toString(num);
       int str2=str.length();
       StringBuilder str1=new StringBuilder(str);
       str1.reverse();
       
       String reveresed=str1.toString();
       
       System.out.println(str1);
       
//       System.out.println(str2);
//       if(str.equals(reveresed)) {
//    	   System.out.println("is palidrome");
//    	   
//       }else {
//    	   System.out.println("Your number is not palidromer");
//       }
	}

}
