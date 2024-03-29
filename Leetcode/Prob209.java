public class Prob209 {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int min = Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                sum -= nums[i];
                min = Math.min(j-i+1, min);
                i++;
            }
            j++;
        }

        if(min == Integer.MAX_VALUE){
            return 0;
        }

        return min;
    }
}
