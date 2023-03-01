public class Prob485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max =0;
        for(int i =0; i<nums.length ; i++){
            if(nums[i]==1){
                count++;
                max= Math.max(count, max);
            }
            else if(nums[i]==0){
                count=0;
                // continue;
            }
        }
        return max;
    }
}
