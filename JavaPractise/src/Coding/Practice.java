package Coding;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s= "sjdshdk@13%*@6 c";
     int count=0;
     
     for(int i=0; i<s.length(); i++) 
     {
    	if(!Character.isLetterOrDigit(s.charAt(i))&& !Character.isWhitespace(s.charAt(i))) {
    		count++;
    	     
     }
    
     }
     if(count==0)
     {
    	 System.out.println("No special character present ");
     }
     else 
     {
    	 System.out.println("Special character is"+count );
     }
     
	}

}
