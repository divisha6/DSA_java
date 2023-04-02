import java.util.*;
public class Prob2554 {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum=0;
        Arrays.sort(banned);
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<banned.length; i++){
            set.add(banned[i]);
        }

        int count=0;
        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                if(sum+i<=maxSum){
                    sum+=i;
                    count++;
                } else{
                    return count;
                }
            }
        }
        return count;
    }
}
