public class Prob2216 {
    public int minDeletion(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(i<nums.length-1 && (i-count)%2==0 && nums[i]==nums[i+1]){
                count++;
            }
        }

        if((nums.length-count)%2!=0) count++;

        return count;
    }
}
