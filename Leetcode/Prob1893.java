import java.util.*;

public class Prob1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer> set = new HashSet<>(); 
        for( int i = 0; i < ranges.length; i++){ 
          int[] arr = ranges[i];
          for(int j=arr[0]; j<=arr[1]; j++){
              set.add(j);
        }
        
        for(int i=left; i<=right; i++){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
}
}
