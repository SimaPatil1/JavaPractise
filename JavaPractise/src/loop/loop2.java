package loop;
//for loop- we use it the number of iteration is fixed
//for each loop - we use it deal with array
//while loop- we use it if the number of iteration is not fixed
//do while loop-we use it if the number of iteration is fixed at least we want to execute body once. 

public class loop2 {
  Object c[]= {"selenium", 3>1, 10.5,'c',5};//global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object a[]= {"Java", 3>1, 10.5,'c',5};
		
    loop2 s=new loop2();
    //print an array using for each loop
    for(Object p:s.c) {
    	System.out.println(p);
    	
    }
		
		for(Object t:a) 
		{
			System.out.println(t);
		}
	}

}
