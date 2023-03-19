import java.util.*;

public class Prob2404 {
    public int mostFrequentEven(int[] nums) {
        int ans =-1;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
        }

        int max = 0;
        Iterator hmIterator = map.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            max = Math.max(max, (int)mapElement.getValue());
        }

        for(Map.Entry m : map.entrySet()){    
            if((int)m.getValue()==max){
                list.add((int)m.getKey());
            }    
        }
        Collections.sort(list);
        if(!list.isEmpty()) return ans = list.get(0);
        return ans;
    }
}
