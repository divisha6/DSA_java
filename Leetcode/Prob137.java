import java.util.*;

public class Prob137 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry set1 = (Map.Entry)iterator.next();
            if((int)set1.getValue()==1){
                return (int)set1.getKey();
            }
        }
        return -1;
    }
}
