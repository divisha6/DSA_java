import java.util.*;

public class Prob2295 {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        
        for(int arr[]:operations){
            int idx=map.get(arr[0]);
            nums[idx]=arr[1];
            map.remove(arr[0]);
            map.put(arr[1],idx);
        }
        return nums;
    }
}
