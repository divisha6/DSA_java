public class Prob1493 {
        public int longestSubarray(int[] nums) {
            int ans=0;
            int prev=0;
            int curr=0;
            for(int i=0; i<nums.length; i++){
                if(nums[i]==1){
                    curr++;
                }
                else{
                    ans = Math.max(ans, curr+prev);
                    prev = curr;
                    curr=0;
                }
            }
            ans = Math.max(prev+curr, ans);
    
            if(ans == nums.length){
                ans--;
            }
    
            return ans;
        }
}
