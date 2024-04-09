package Coding;

public class StringComparison {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}


//	public static void main(String[] args) {
//		
//		int arr[]= {32,35,67,80,19,94,88};
//		int n=arr.length;
//		int highest=0;
//		int secondhighest=0;
//		
//		for(int i=0;i<n;i++) 
//		{
//			if(arr[i]>highest)
//			{
//				secondhighest=highest;
//				highest=arr[i];
//				
//			}
//		if(arr[i]<highest && arr[i]>secondhighest)
//		{
//			secondhighest=arr[i];
//		}
//		}
//			
//	    //System.out.println("Secondhighest number is:" +secondhighest);
//		
//	}
//	
//	}

