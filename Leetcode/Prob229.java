import java.util.*;

public class Prob229 {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        // Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        Iterator hmIterator = map.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            if((int)mapElement.getValue()>n){
                list.add((int)mapElement.getKey());
            }
        }
        return list;
    }
}
