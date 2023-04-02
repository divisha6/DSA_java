import java.util.*;

public class Prob2300 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        Arrays.sort(potions);
        int[] pairs = new int[n];
        for(int i=0; i<n; i++){
            int spell = spells[i];
            int left =0; int right = potions.length-1;
            while(left<=right){
                int mid = left + (right - left)/2;
                long product = (long)spell * potions[mid];
                if(product>=success){
                    right = mid - 1;
                } else{
                    left = mid+1;
                }
            }
            pairs[i]=m-left;
        }
        return pairs;
    }
}
