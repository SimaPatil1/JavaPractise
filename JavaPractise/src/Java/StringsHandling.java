package Java;

public class StringsHandling {
	// Java program to check fixed point
	// in an array using linear search

		static int linearSearch(int arr[], int n)
		{
			int i;
			for (i = 0; i < n; i++) {
				if (arr[i] == 2)
					return i;
			}

			/* If no fixed point present
			then return -1 */
			return -1;
		}
		// main function
		public static void main(String args[])
		{
			int arr[] = {15,2,45,12,7};
			int n = arr.length;
			System.out.println("Fixed Point is "
							+ linearSearch(arr, n));
		}
	}














