public class Prob1822 {
    public int arraySign(int[] nums) {
        int ans =1;

        int product = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) ans=0;
            if(nums[i]<0) ans = ans*-1;
        }
        return ans;
    }
}
