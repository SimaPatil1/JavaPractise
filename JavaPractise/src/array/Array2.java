package array;

public class Array2 {
/*Index: An index refers to the 
	position of an element within an 
	array. In most programming languages, 
	including Java, array indices start
	from 0. So, the first element of an array
	has an index of 0, the second element has an 
	index of 1, and so on. The index is used to 
	access or modify individual elements of the array.

Length: The length of an array refers to
 the total number of elements that the array 
 can hold. It represents the size or capacity of the array. In Java, you can obtain the length of an array using the length property. The length of an array is fixed upon its creation and cannot be changed during the lifetime of the array.
*/	
public static void main(String[] args) {
		// TODO Auto-generated method stub
       int b[]= {1,2,3,4,5};//defining array
	   String a[]= {"hi", "hello"};
	   Object c[]= {"toek", 2.4,3<1, 'c'};
	//length is the property of array
	System.out.println(a.length);//2
	System.out.println(b.length);//5
	System.out.println(c.length);//4
	
	System.out.println(a[4]);//error


}

}
