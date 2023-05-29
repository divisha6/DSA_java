import java.util.*;

public class Prob914 {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length==1) return false;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<deck.length; i++){
            freq.put(deck[i], freq.getOrDefault(deck[i],0)+1);
        }

        int gcd=0;
        for(int v : freq.values()){
            gcd = gcd(gcd, v);
        }

        return gcd>1;
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
