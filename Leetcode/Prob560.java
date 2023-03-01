public class Prob560 {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;

        for(int j=0; j<nums.length; j++)
        {
            sum=0;
            for(int i=j; i<nums.length; i++){
            sum+=nums[i];
            if(sum==k){
                count++;
            } 
        }
        
        }
        return count;
    }
}
