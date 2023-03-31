public class Prob1800 {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int max=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                sum+=nums[i];                
            } else{
                max= Math.max(max, sum);
                sum=nums[i];
            }
        }
        return Math.max(sum, max);
    }
}
