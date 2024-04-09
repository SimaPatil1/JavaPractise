package Constructor;

public class TypeCastingNarrowing {
//conversion of one set of data into another type
//narrowing- manual casting
//widening-Auto casting

	 public static void main(String[] args) {
		double b=5.9;
		int a=(int)b;//manual casting
		System.out.println(b);//5.9
		System.out.println(a);//5
	 
		//string to interger conversion
		String s="10";
		int i=Integer.parseInt(s);
	    System.out.println(i);
	    
	    //integer to string conversion
	    int z=5;
	    String l=Integer.toString(z);
	    String t = String.valueOf(z);
	    System.out.println(t);
	    System.out.println(l);
	 }

}
