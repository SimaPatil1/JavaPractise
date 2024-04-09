package array;

public class Array4 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //Defining multidimensional array
	int a[][]= {{1,2,3,},{5,45,32},{1,2,3,},{1,2,3,}};
	//1,2,3,4
	//5,45,32
	
	
	//total no of rowa
	int row=a.length;
		System.out.println("Total rows :"+row);
	
		//total no of column
		int column =a[0].length;  
	System.out.println("Total colums:"+column);
	
	//print all data in matrix form
	//outer loop
	for(int i=0;i<row;i++) {
		
		//inner loop
		for(int j=0; j<column; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	
	}

}
