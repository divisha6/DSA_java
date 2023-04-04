import java.util.*;

public class Prob2148 {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max = nums[nums.length-1];
        int ans=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=min && nums[i]!=max){
                ans++;
            }
        }
        return ans;
    }
}
