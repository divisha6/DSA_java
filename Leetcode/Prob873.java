import java.util.*;

public class Prob873 {
    public int lenLongestFibSubseq(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            set.add(i);
        }
        int count=0;
        int max=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int a = arr[i];
                int b = arr[j];
                int c = a + b;
                if(set.contains(c))count=2;
                    while(set.contains(c)){
                        count++;
                        a = b;
                        b = c;
                        c = a + b;
                    }
                
                max = Math.max(max, count);
                
            }
        }
        return max;
    }
}
