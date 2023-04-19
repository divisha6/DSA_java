import java.util.*;

public class Prob1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        if(s1.equals(s2)) return true;
        if(s1.length() != s2.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)) {
            map.put(s1.charAt(i), s2.charAt(i));
            count++;
            }
        }

        if(map.size()>2) return false;
        if(map.size()==0) return true;

        Set<Character> key = new HashSet<>(map.keySet());
        Set<Character> val = new HashSet<>(map.values());

        return count==2 && key.equals(val);
    }
}
