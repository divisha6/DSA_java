public class Prob2348 {
    public long zeroFilledSubarray(int[] nums) {
        long sub=0;
        long cons =0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                cons++;
                sub += cons;
            } else {
                cons=0;
            }
        }
        return sub;
    }
}
