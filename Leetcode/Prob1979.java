import java.util.*;
public class Prob1979 {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length-1]);
    }

    public int gcd(int e, int z){
        if (e==0){
            return z;
        }
        else {
            return gcd(z%e, e);
        }
    }
}
