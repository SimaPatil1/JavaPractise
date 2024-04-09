package ExceptionHandling;

public class EH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
		int a=5/0; //ArithmaticException
    }
    catch(ArithmeticException a) {
	   //see the error message
    	a.printStackTrace();//give the complete exception info
    	 
      System.out.println(a);//only exception info
    }catch(NullPointerException n) {
    	System.out.println(n);
    }catch(ArrayIndexOutOfBoundsException b) {
    	System.out.println(b);
    }
    catch (Exception e) {
    	System.out.println(e);
    }
	
    System.out.println("Exception Handled");
	}

}
