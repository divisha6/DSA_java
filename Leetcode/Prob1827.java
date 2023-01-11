public class Prob1827 {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i =0; i<nums.length -1 ; i++){
            if(nums[i]< nums[i+1]){
            }
            else if(nums[i]== nums[i+1]){
                nums[i+1]= nums[i+1]+1;
                count++;
            }
            else if(nums[i]> nums[i+1]){
                count = count + nums[i]- nums[i+1] +1;
                nums[i+1]= nums[i]+1;
            }
        }
        return count;
    }
}
