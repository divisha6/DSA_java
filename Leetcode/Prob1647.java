import java.util.*;

public class Prob1647 {
    public int minDeletions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int count=0;
        HashSet<Integer> set = new HashSet<>();
        for(char c : map.keySet()){
            int val = map.get(c);
            if(!set.contains(val)){
                set.add(val);
            }
            else{
                while(val>0 && set.contains(val)){
                count++;
                val--;
            }

            if(val>0) set.add(val);
            }
        }
        return count;
    }
}
