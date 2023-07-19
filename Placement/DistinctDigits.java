import java.util.*;

public class DistinctDigits {
    public static void main(String[] args) {
        int m=11; int n=20;
        System.out.println(distinct(m,n));
    }

    public static int distinct(int m, int n){
        int dis=0; 
        for(int i=m ; i<n+1; i++){
            if(containsDistinct(i)) dis++;
        }
        return dis;
    }

    public static boolean containsDistinct(int i){
        HashSet<Integer> set = new HashSet<>();
        while(i>0){
            int d = i%10;
            if(set.contains(d)) return false;
            set.add(d);
            i = i/10;
        }
        return true;
    }
}
