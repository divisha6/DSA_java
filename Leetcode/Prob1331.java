import java.util.*;

public class Prob1331 {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = Arrays.copyOf(arr,arr.length);
        Arrays.sort(nums);
        int k=1;
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], k++);
            }
        }
        
        int[] result=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            result[i]=map.get(arr[i]);
        }

        return result;
    }
}
