import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0; int bob=0;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<a.size(); i++){
            if(a.get(i)>b.get(i)){
                alice++;
            } else if(a.get(i)<b.get(i)){
                bob++;
            } else{
                continue;
            }
        }
        
        ans.add(alice);
        ans.add(bob);
        return ans;
    }
}
