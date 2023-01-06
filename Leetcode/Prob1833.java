import java.util.*;

public class Prob1833 {
    public static void main(String[] args) {
        
    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        for(int i=0; i<costs.length; i++){
            if(costs[i] <= coins){
                count++;
                coins = coins- costs[i];
            }
        }
        return count;
    }
}
