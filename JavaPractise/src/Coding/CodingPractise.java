package Coding;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CodingPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]= {23,45,85,19,89,39};
	int min= arr[0];
	 for (int i=0;i<arr.length; i++)
	 {
		 if(arr[i]<min)
		 {
			 min=arr[i];
		 }
		 }
	 System.out.println(min);
	 }
}
	
	
