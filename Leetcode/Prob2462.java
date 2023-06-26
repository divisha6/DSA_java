import java.util.*;

public class Prob2462 {
    public long totalCost(int[] costs, int k, int candidates) {
        long totalCost = 0L;
        int round=0;
        int l=0;
        int r = costs.length-1;
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        for(l=0; l<candidates; l++) left.add(costs[l]);
    for(r=costs.length-1; r>=costs.length-candidates && l<=r; r--) right.add(costs[r]);
        while(l<=r && round<k){
            if(left.peek()<=right.peek()){
                totalCost += left.poll();
                left.add(costs[l]);
                l++;
            }
            else{
                totalCost += right.poll();
                right.add(costs[r]);
                r--;
            }
            round++;
        }
        while(round<k){
            if(left.size()==0) totalCost += right.poll();
            else if(right.size()==0) totalCost += left.poll();
            else if(left.peek()<=right.peek()) totalCost += left.poll();
            else totalCost += right.poll();
            round++;
        }
        return totalCost;
    }
}
