import java.util.*;

public class Prob1046 {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        if(n==1) return stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<n; i++){
            pq.offer(stones[i]);
        }
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            int diff = Math.max(a,b)-Math.min(a,b);
            if(diff>0){
                pq.offer(diff);
            }
        }

        if(pq.isEmpty()) return 0;
        return pq.poll();
    }
}
