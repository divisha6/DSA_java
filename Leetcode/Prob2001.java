import java.util.*;

public class Prob2001 {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Long> map = new HashMap<>();
        for(int i=0; i<rectangles.length; i++){
            double ratio =rectangles[i][0]/(rectangles[i][1]/1.0);
            long defaultO=0L;
            map.put(ratio, map.getOrDefault(ratio,defaultO)+1);
        }

        long points=0;
        for(long k : map.values()){
            if (k > 1) {
            points += k * (k - 1) / 2;
           }
        }
        return points;
    }
}
