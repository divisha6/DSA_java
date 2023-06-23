import java.util.HashMap;

public class Prob1027 {
    public int longestArithSeqLength(int[] nums) {
        if(nums.length<=2) return 2;
        int longest = 2;
        HashMap<Integer, Integer>[] dp = new HashMap[nums.length];
        for(int i=0; i<nums.length; i++){
            dp[i]=new HashMap<>();
            for(int j=0; j<i; j++){
                int diff = nums[i]-nums[j];
                dp[i].put(diff, dp[j].getOrDefault(diff,1)+1);
                longest = Math.max(longest, dp[i].get(diff));
            }
        }
        return longest;
    }
}
