package break_statement;

public class BreakStatement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i=1;  //local variable
       
       //do while loop
       do {
    	 if(i==3) {
    		 break;
    	 }
    	 System.out.println(i);
    	 i++;
       } while(i<=3);
        
	}

}
