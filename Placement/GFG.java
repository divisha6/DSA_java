package Placement;

public class GFG {
   

	// function compute sum all sub-array
	public static long SubArraySum(int arr[], int n)
	{
		long result = 0;

		// computing sum of subarray using formula
		for (int i = 0; i < n; i++)
			result += (arr[i] * (i + 1) * (n - i));

		// return all subarray sum
		return result;
	}

	/* Driver code */
	public static void main(String[] args)
	{
		int arr[] = { 1, 7,7,1,6,7,6,8,6,3,1,0,8 };
		int n = arr.length;
		System.out.println("Sum of SubArray "
						+ SubArraySum(arr, n));
	}
}
// This code is contributed by Arnav Kr. Mandal.

