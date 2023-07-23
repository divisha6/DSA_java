package Coding_Ninjas;

public class KadanesAlgo {
    public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long sum = 0;
		long max = Integer.MIN_VALUE;
		if(n==1) return arr[0];

		for(int i=0; i<n; i++){
			sum+=arr[i];
			// max = Math.max(sum,max);
			if(sum<0) sum=0;
			if(sum>max) max = sum;
		}
		return max;
	}
}
