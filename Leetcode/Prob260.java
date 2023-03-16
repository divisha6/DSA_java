import java.util.*;

public class Prob260{
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            } else{
                set.add(nums[i]);
            }
        }
        Object[] obj = set.toArray();
        int[] ans = new int[obj.length];
        for(int i=0; i<obj.length; i++){
            ans[i]= (int)obj[i];
        }

        return ans;
    }
}