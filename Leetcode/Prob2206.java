import java.util.*;

public class Prob2206{
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        boolean ans = true;
        for(int i=0; i<nums.length-1; i=i+2){
            if(i%2==0){
                if(nums[i]!=nums[i+1]){
                    ans=false;
                }
            }
        }
        return ans;
    }
}