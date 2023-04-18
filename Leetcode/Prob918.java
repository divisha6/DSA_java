public class Prob918 {
    public int maxSubarraySumCircular(int[] nums) {
        // modified Kadane's algorithm
        // min_res will store sum of smallest subarray
        int min_sum=0; int min_res=Integer.MAX_VALUE;
        // storing the sum of the biggest subarray
        int max_sum=0; int max_res=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            min_sum += nums[i];
            min_res= Math.min(min_sum, min_res);
            if(min_sum>0) min_sum=0;
            
            max_sum += nums[i];
            max_res= Math.max(max_sum, max_res);
            if(max_sum<0) max_sum=0;
        }

        if(sum==min_res) return max_res;
        // returning the max of: 
        // - whole sum minus the sum of smallest subarray
        // - the max sum of the maximum subarray
        return Math.max(sum-min_res, max_res);
    }
}
