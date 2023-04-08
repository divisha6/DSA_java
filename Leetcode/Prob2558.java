import java.util.*;

public class Prob2558 {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Comparator.reverseOrder());
        long ans =0;
        for(int i:gifts){
            pq.offer((long)i);
            ans+= (long)i;
        }

        while(k>0 && !pq.isEmpty()){
            long val = pq.poll();
            ans -= val;
            pq.offer((long)Math.floor(Math.sqrt(val)));
            ans+= (long)Math.floor(Math.sqrt(val));
            k--;
        }
        return ans;
    }
}
