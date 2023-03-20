import java.util.*;

public class Prob80 {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
                list.add(nums[i]);
            } else{
                if((int)map.get(nums[i])<2){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
                list.add(nums[i]);
            }
            }
        }

        for(int i=0; i<list.size(); i++){
            nums[i]=(int)list.get(i);
        }
        return list.size();
    }
}
