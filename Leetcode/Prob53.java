import java.util.*;

public class Prob53 {
    public int maxSubArray(int[] nums) {
        // DP answer
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
        }
        Arrays.sort(dp);
        return dp[dp.length-1];

        // Kadane's algorithm
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            max = Math.max(sum, max);
            if(sum<0) sum=0;
        }
        return max;
    }
}
