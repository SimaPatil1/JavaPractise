package Coding;

public class Escape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Hello\"java\" nonn");
     System.out.println("Hello\'java\' nonn");
     System.out.println("Hello\\world\\ java");
     System.out.println("hello \ntork \nmotors");
     System.out.println("hello tork\tmotors");
     System.out.println("hello tork\bmotors");
     
     for(int i=1; i<=5; i++){
    	 
    	 for(int j=1; j<=i;j++) {
      
        System.out.print("*");
     }
    
    	 System.out.println(" ");
	}
   
	}
	
}
