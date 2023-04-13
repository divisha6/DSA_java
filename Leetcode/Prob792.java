import java.util.*;

public class Prob792 {
    public int numMatchingSubseq(String s, String[] words) {
        int count=0;
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word,0)+1);
        }

        for(String key: map.keySet()){
            if(check(s, key)) count += map.get(key);
        }
        return count;
    }

    public boolean check(String s, String c){
        int i=0; int j=0;
        while(i<s.length() && j<c.length()){
            if(s.charAt(i)==c.charAt(j)){
                j++;
            } 

            if(j==c.length()) return true;

            i++;

        }
        return false;
    }
}
