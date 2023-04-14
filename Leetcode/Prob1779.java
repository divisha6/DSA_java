import java.util.*;

public class Prob1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i = 0; i < points.length; i++){
            if(points[i][0]==x || points[i][1]==y){
                int sum = Math.abs(points[i][0]-x) + Math.abs(points[i][1]-y);
                pq.add(new int[] {i,sum});
            }

            if(points[i][0]==x && points[i][1]==y) return i;
        }

        if(pq.size()>0) return pq.poll()[0];
        return -1;
    }
}
