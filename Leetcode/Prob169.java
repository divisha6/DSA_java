import java.util.*;
public class Prob169 {
    public int majorityElement(int[] nums) {
        // SOLUTION 1 - more efficient 
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        // SOLUTION 2 - less efficient 
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && map.get(nums[i]).intValue()>nums.length/2){
                return nums[i];
            }
        }
        return -3;
    }
}
