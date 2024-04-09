package ExceptionHandling;

public class EH3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String x="Tork";
    //number format exception
    try {
		int i= Integer.parseInt(x);
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("Exception Handle");
	}

}
