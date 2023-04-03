import java.util.*;

public class Prob2150 {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int key: map.keySet()){
            int value = map.get(key);
            if(value==1){
                if(!map.containsKey(key+1) && !map.containsKey(key-1)){
                    list.add(key);
                }
            }
        }
        return list;
    }
}
