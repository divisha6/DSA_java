import java.util.*;
public class Prob414 {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(!list.contains(nums[i])) list.add(nums[i]);
        }

        Collections.sort(list);
        if(list.size()<3) return list.get(list.size()-1);

        return list.get(list.size()-3); 
    }
}
