import java.util.*;

public class Prob47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        recurPermute(0, nums, ans);
        List<List<Integer>> arrayList = new ArrayList<>();
        arrayList.addAll(ans);
        return arrayList;
    }

    private void recurPermute(int index, int[] nums, HashSet<List<Integer>> ans){
        Set<Integer> set = new HashSet<>();
        if(index==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                ds.add(nums[i]);
            }
            // if(!ans.contains(new ArrayList<>(ds)))
            // {ans.add(ds);}
            ans.add(new ArrayList<>(ds));
            return ;
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
