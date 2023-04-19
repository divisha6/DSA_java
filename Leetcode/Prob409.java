import java.util.*;
public class Prob409 {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        int len =0; int sum=0;
        for(char c: map.keySet()){
            int val = map.get(c);
            if(val>=2){
                int d = val/2;
                len += (d*2);
            }
            sum += val;
        }

        if(sum>len) len++;
        return len;
    }
}
