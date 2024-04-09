package ConditionalStatement;

public class Nested_If_Statement {
//A nested if statement in Java 
	//is when you have an if statement 
	//inside another if statement. 
	//This is often used when you need to check multiple 
	//conditions and execute different code blocks based 
	//on those conditions
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int age= 17; //local variable
      int weight =45; //local variable
      
      if(age>18) {// if this condition is true then it go inside block
    	  //outer if block
    	  if(weight>50) { //outer inner block
    		  if(weight==55) {
    			  System.out.println("eligible");
    		  }
    	  } else {
    		  System.out.println("not eligible");
    	  }
      } else {
    	  System.out.println("Age is not greter than 18");
      }
      
	}

}
