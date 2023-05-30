import java.util.*;

public class Prob961{
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int key: map.keySet()){
            if(map.get(key)==n) return key;
        }

        return -1;
    }
}