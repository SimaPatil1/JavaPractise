package Operator;

public class RelationalOperator {
 //less than (x<y)
	//greater than (x>y)
	//less than or equal to (x<=y)
	//greater than or equal to(x>=y)
	//equal(x=y)
	//Not equal (x!=y)
	//if(condition){
	//   executable code} 
    // else{
	// executable code}
	
	public static void main(String[] aisonrgs) {
		// TODO Auto-generated method stub
       int a=300; //local variable
       int b=300;
       //number comparison
       if(a !=b) {
    	   System.out.println("a is not equal to b");
       } else {
    	   System.out.println("a is equal to b");
       }
       String p="HELLO";
       String q="hello";
       
       //String comparison- java is case sensitive
       if(p==q) {
    	   System.out.println("p and q are equal for first way");
       }else {
    	   System.out.println("p and q are not equal for first way");
       }
       //string comparision -2nd way- case sensitive
	  //p is reference of string this is variable name
       //String is pre definded class in java, so it gives all string class method
       // this method also case sensitive
       if(p.equals(q)) {
    	   System.out.println("p and q are equal for second way");
       }else {
    	   System.out.println("p is not equal to q 2nd way");
       }
       // String comparison -3rd way- Not case sensitive
       if(p.equalsIgnoreCase(q)) {
    	   System.out.println("p and q are equal for 3rd way");
       }else {
    	   System.out.println("p is not equal to q 3rd way");
       }
	
	}

}
