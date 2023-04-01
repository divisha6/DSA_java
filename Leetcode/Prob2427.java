import java.util.*;

public class Prob2427 {
    public int commonFactors(int a, int b) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=1; i<=a; i++){
            if(a%i==0) set.add(i);
        }

        int factors=0;
        for(int d : set){
            if(b%d==0) factors++;
        }
        return factors;
    }
}
