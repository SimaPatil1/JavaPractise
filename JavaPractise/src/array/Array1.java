package array;

public class Array1 {
//Jave array 
//It is a collection of mutiple data, that has continuous memory location.
//array i index based , first element of the array is stored at 0 index.
	
	//code optimize
	//Max index= (total number of elements-1), because index start from 0
	//single dimension array
	//multi dimension array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Defining and array
		int a[]=new int[5];
		
	//printing lengrh of array
		System.out.println(a.length);
	//print default value of an int array
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//assigning value to an array
		 a= new int[]{3,2,14,13,1};
			//other way
			 a[0]=65;
			 a[1]=99;
			 a[2]=5;
			 a[3]=10;
			 a[4]=6;
			// a[5]=85;//java.lang.ArrayIndexOutOfBoundsException
	  System.out.println(a[2]);
	//print all array elemts
	  for (int i=0;i<a.length; i++) {
		  System.out.println(a[i]);
	  }
	
	}

}
