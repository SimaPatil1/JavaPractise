package ExceptionHandling;

public class EH5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //arithmetic exception
		
		try {
		int i= 10/0;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		System.out.println("Finally will execute always");
	}
      
	}

}
