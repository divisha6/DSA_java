import java.util.*;
public class Prob16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){
            int p1=i+1;
            int p2= nums.length-1;
            while(p1<p2){
                int sum = nums[p1] + nums[p2] + nums[i];
                if(sum==target){
                    return target;
                } else if(Math.abs(target-sum)<Math.abs(target-ans)){
                    ans = sum;
                } 
                
                if(sum<=target){
                    p1++;
                } else{
                    p2--;
                }
            }
        }
        return ans;
    }
}
