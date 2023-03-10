public class Prob2006 {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int diff = Math.abs(nums[j]-nums[i]);
                if(diff==k){
                    count++;
                }
            }
        }
        return count;
    }
}
