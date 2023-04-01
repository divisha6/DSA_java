import java.util.*;

public class Prob1347 {
    public int minSteps(String s, String t) {
        if (s.length() != t.length()) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        int count=0;

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)&& map.get(ch)>0){
                map.put(ch, map.get(ch)-1);
            } else {
                count++;
            }
        }
        return count;
    }
}
