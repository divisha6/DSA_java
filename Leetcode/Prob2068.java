import java.util.*;
public class Prob2068 {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<word1.length(); i++){
            char c = word1.charAt(i);
            char d = word2.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
            map.put(d, map.getOrDefault(d,0)-1);
        }

        for(char key : map.keySet()){
            int val = map.get(key);
            if(val>3 || val<-3) return false;
        }
        return true;
    }
}
