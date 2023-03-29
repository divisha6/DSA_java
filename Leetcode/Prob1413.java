import java.util.*;

public class Prob1413 {
    public int minStartValue(int[] nums) {
        int sum=0;
        for(int i=0; i<=nums.length-1; i++){
            sum += nums[i];
            nums[i]=sum;
        }

        Arrays.sort(nums);
        if(nums[0]>0) return 1;
        else return Math.abs(nums[0])+1;
    }
}
