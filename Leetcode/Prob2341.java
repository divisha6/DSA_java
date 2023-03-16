import java.util.*;

public class Prob2341 {
    public int[] numberOfPairs(int[] nums) {
        int[] arr = new int[2];
        int pairs=0;
        int leftover=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
                pairs++;
            } else{
                set.add(nums[i]);
            }
        }
        arr[0]=pairs;
        arr[1]=set.size();
        return arr;
    }
}
