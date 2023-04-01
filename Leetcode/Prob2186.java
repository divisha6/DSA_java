import java.util.*;
public class Prob2186 {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<t.length(); i++){
            // char ch= t.charAt(i);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)-1);
        }

        int count=0;
        for(char key:map.keySet())
            if(map.get(key)!=0)
                count+=(Math.abs(map.get(key)));
        return count;
    }
}
