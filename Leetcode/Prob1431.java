import java.util.*;
import java.math.*;

public class Prob1431{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i=0; i<candies.length ; i++){
            max = Math.max(candies[i], max);
        }

        ArrayList<Boolean> ans = new ArrayList<>();
        for(int i =0; i<candies.length ; i++){
            if(candies[i]+extraCandies >= max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}