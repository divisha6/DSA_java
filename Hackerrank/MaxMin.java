// package Hackerrank;
import java.util.*;

public class MaxMin {
    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here
            long min=Integer.MAX_VALUE;
            long diff=0;
            Collections.sort(arr);
            for(int i=0; i<arr.size()-k+1; i++){
                diff= arr.get(i+k-1)-arr.get(i);
                min = Math.min(min, diff);
            }
            return (int)min;
        }
}
