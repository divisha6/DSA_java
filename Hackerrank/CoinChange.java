package Hackerrank;
import java.util.*;

public class CoinChange {
    public static long getWays(int n, List<Long> c) {
        // Write your code here
        long[] dp = new long[n+1];
        dp[0]=1;
        for(long coin: c){
            for(long i=coin; i<n+1; i++){
                dp[(int)i] += dp[(int)(i-coin)];
            }
        }
        
        return dp[dp.length-1];
    
        }
}
