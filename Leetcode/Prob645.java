import java.util.*;

public class Prob645 {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int min= Integer.MAX_VALUE;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            max= Math.max(max, nums[i]);
            if(set.contains(nums[i])){
                ans[0]=nums[i];
            } else{
                set.add(nums[i]);
            }
        }

        for(int i=1; i<=max+1; i++){
            if(!set.contains(i)){
                ans[1]=i;
                return ans;
            }
        }
        return ans;
    }
}
