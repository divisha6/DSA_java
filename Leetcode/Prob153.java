public class Prob153 {
    public int findMin(int[] nums) {
        int ans =-1;
        if(nums.length ==1){
            ans= nums[0];
        }
        
        for(int i=1; i<nums.length; i++){
            if(nums[0]>nums[nums.length-1]){
                if(nums[i] < nums[i-1]){
                ans= nums[i];
                }
            }
            else{
                ans=nums[0];
            }
        }
        return ans;
    }
}
