import java.util.*;

public class Prob973 {
    public int[][] kClosest(int[][] points, int k) {
        //Create a priority queue that compares the second element(distance^2) from small to large 
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i = 0; i < points.length; i++){
            int sum = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.add(new int[] {i,sum});
        }

        int[][] ans = new int[k][];
        for(int i=0; i<k; i++){
            ans[i]=points[pq.poll()[0]];
        }

        return ans;
    }
}
