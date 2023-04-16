import java.util.*;
public class Prob740 {
    public int deleteAndEarn(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==0) return 0;
        if(nums.length==2){
            if((nums[0]!=nums[1]+1) || (nums[0]!=nums[1]-1)){
                return nums[0]+nums[1];
            } else{
                return Math.max(nums[0],nums[1]);
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        // map to store the max of all elements
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+nums[i]);
        }

        int[] dp = new int[10001];
        dp[0]=map.getOrDefault(0,0);
        dp[1]=map.getOrDefault(1,0);
        for(int i=2; i<dp.length; i++){
            int op1 = dp[i-2] + map.getOrDefault(i,0);
            int op2= dp[i-1];
            dp[i]=Math.max(op1, op2);
        }

        return dp[dp.length-1];
    }
}
