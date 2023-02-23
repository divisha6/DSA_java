public class Prob1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        // HashMap<Integer, Integer> map = new HashMap<>();

        int count=0;
        for(int i=0; i<nums.length ; i++){
            int n = nums[i];
            for(int j=0; j<nums.length; j++){
                if(i==j){
                    continue;
                }
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i]=count;
            count=0;
        }
        return ans;
    }
}
