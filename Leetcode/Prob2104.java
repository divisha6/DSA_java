public class Prob2104 {
    public long subArrayRanges(int[] nums) {
        long ans =0;
        for(int i=0; i<nums.length; i++){
            int min = nums[i];
            int max = nums[i];
            for(int j=i+1; j<nums.length; j++){
                    min = Math.min(min, nums[j]);
                    max = Math.max(max, nums[j]);
                    ans += Math.abs(max-min);
                }
            }
        return ans;
    }
}
