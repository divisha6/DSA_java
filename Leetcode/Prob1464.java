import java.util.*;

public class Prob1464 {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // return (nums[n-1]-1)*(nums[n-2]-1);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:nums){
            pq.offer(i);
        }

        return (pq.poll()-1)*(pq.poll()-1);
    }
}
