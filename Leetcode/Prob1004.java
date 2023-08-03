public class Prob1004 {
    public int longestOnes(int[] nums, int k) {
        int size=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                k--;
            }
            if(k>=0) size++;

            else if(nums[i-size]==0){
                k++;
            }

        }

        return size;
    }
}
