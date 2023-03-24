import java.util.*;

public class Prob46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0, nums, ans);
        return ans;
    }

    private void recurPermute(int index, int[] nums, List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index; i<nums.length; i++){
            swap(i, index, nums);
            recurPermute(index+1, nums, ans);
            swap(i, index, nums);
        }
    }

    private void swap(int a, int b, int[] nums){
        int t = nums[a];
        nums[a]= nums[b];
        nums[b]=t;
    }
}
