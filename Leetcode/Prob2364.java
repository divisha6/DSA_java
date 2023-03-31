import java.util.*;

public class Prob2364 {
    public long countBadPairs(int[] nums) {
        // Number of pairs with j - i != nums[j] - nums[i] will be equal to Total pairs in array (n * (n - 1) / 2 , n = array length) minus Number of pairs with j - i == nums[j] - nums[i].
        long all =0L;
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // map is the hashmap to store the frequency of the nums elements after we replace them witj nums[i]-i
        for(int i=0; i<nums.length; i++){
            nums[i]=nums[i]-i;
        }

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        long matches=0;
        for(int key: map.keySet()){
            if(map.get(key)>1){
                long fr = map.get(key);
                matches += ((fr-1L)*fr*1L)/2L;
                // gives total number of elements that match
            }
        }
        all = length*1L*(length-1L)/2L; // all the pairs
        return all-matches;
        // all pairs minus the pairs that match
    }
}
