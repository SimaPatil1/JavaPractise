package Coding;

public class SecondHighestNumber {
	public static void main (String[] args) {
		int arr[]= {26,23,78,82,56,98,73};
	//	int arr[]= {23,82,12,24,53,121,23} ;
		int n=arr.length;
		int highest=0;
		int secondhighest=0;

		for (int i=0;i<n;i++)
		{
			if(arr[i]>highest)
			{
			secondhighest=highest;
			highest=arr[i];
			}
			if(arr[i]<highest && arr[i]>secondhighest)
			{
				secondhighest=arr[i];
			}

		}
		        System.out.println("Second Highest Number"+secondhighest);
	}
}
	
		
		
		
		
		
		
		
		
		
		
	
	
	

//	public static void main(String[] args) {
//		int arr[]= {12,35,24,25,86,27};
//     	int n=arr.length;
//
//		Arrays.sort(arr);
//		System.out.println("Second highest number is"+arr[n-2]);

//	}}

//		int highest=0;
//		int secondhighest=0;
//
//		for(int i=0;i<n;i++)
//		{
//			if(arr[i]>highest)
//			{
//				secondhighest=highest;
//			    highest=arr[i];
//			}
//		if(arr[i]<highest && arr[i]>secondhighest)
//		{
//			secondhighest=arr[i];
//		}
//		}
//
//		System.out.println("Second highest number is:"+secondhighest);
//	}
//
//}









		








//int arr[]= {};
//int n= arr.length;
//
//Arrays.sort(arr);
//
//System.out.println("SecondHighestNumber"+ arr[n-1]);
//
















