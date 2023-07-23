package Coding_Ninjas;

import java.util.HashMap;

public class LongestSubarraySumWithk {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        HashMap<Long, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0L, 0);

        int max = 0;
        long prefix = 0L;
        for(int i=0; i<a.length; i++){
            prefix += a[i];
            if(prefixMap.containsKey(prefix-k)){
                max = Math.max(max, (i+1)-prefixMap.get(prefix-k));
            }

            if(!prefixMap.containsKey(prefix)){
                prefixMap.put(prefix, i+1);
            }
        }
        return max;
    }
}
