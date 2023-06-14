// package Hackerrank;
import java.util.*;

public class GreedyFlorist {
    static int getMinimumCost(int k, int[] c) {
        int sum=0;
        int round=0;
        int var = k;
        Arrays.sort(c);
        for(int i=c.length-1; i>=0; i--){
                sum += (round+1)*c[i];
                var--;
                
            if(var==0){
                round++;
                var=k;
            }
        }
        return sum;
    }
}
