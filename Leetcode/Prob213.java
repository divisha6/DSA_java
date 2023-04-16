public class Prob213 {
    public int rob(int[] nums) {
        // excluding 0th element and taking last element
        int op1 = solve(nums, 1, nums.length-1);
        // including 0th element and excluding last element
        int op2= solve(nums, 0, nums.length-2);
        return Math.max(op1, op2);
    }

    public int solve(int[] nums, int s, int e){
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[nums.length];
        dp[s]=nums[s];
        dp[s+1]=Math.max(nums[s+1], nums[s]);
        for(int i=s+2; i<=e; i++){
            int op1 = nums[i] + dp[i-2];
            int op2 = dp[i-1];
            dp[i]= Math.max(op1, op2);
        }    
        return dp[e];
    }
}
