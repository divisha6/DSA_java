import java.util.*;

public class Prob442{
    public List<Integer> findDuplicates(int[] nums) {
        // ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                if(!set.contains(nums[i])){
                    set.add(nums[i]);
                } else{
                    ans.add(nums[i]);
                }
            }
        return ans;
    }
}