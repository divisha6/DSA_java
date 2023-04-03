import java.util.*;

public class Prob575 {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<candyType.length; i++){
            set.add(candyType[i]);
        }

        int allowed = candyType.length/2;
        return Math.min(allowed, set.size());
    }
}
