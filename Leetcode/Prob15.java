import java.util.*;

public class Prob15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // List<List<Integer>> list = new ArrayList<>();
        HashSet<List<Integer>> list = new HashSet<>();
        for(int i=0; i<nums.length-2; i++){
            int p1=i+1;
            int p2= nums.length-1;
            while(p1<p2){
                int sum = nums[p1] + nums[p2] + nums[i];
                if(sum==0){
                    ArrayList<Integer> small= new ArrayList<>();
                    small.add(nums[p1]);
                    small.add(nums[p2]);
                    small.add(nums[i]);
                     list.add(small);
                    p1++;
                } else if(sum<0){
                    p1++;
                } else{
                    p2--;
                }
            }
        }
        return new ArrayList<>(list);
        // return list;
    }
}
