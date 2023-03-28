import java.util.*;

public class Prob884 {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] s3 = s1.split(" ");
        String[] s4 = s2.split(" ");
        HashSet<String> set = new HashSet<>();
        HashSet<String> extras = new HashSet<>();

        for(int i=0; i<s3.length; i++){
            if(set.contains(s3[i]) || extras.contains(s3[i])){
                set.remove(s3[i]);
            } else{
                set.add(s3[i]);
                extras.add(s3[i]);
            }
        }

        for(int i=0; i<s4.length; i++){
            if(!set.contains(s4[i]) && !extras.contains(s4[i])){
                set.add(s4[i]);
                extras.add(s4[i]);
            } else {
                set.remove(s4[i]);
            }
        }
        String[] ans = new String[set.size()];
        int k=0;
        for(String val : set){
            ans[k]=val;
            k++;
        }
        return ans;
    }
}
