import java.util.*;

public class Prob389 {
    public char findTheDifference(String s, String t) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<t.length(); i++){
            char ch= t.charAt(i);
            list.add(ch);
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(list.contains(ch)){
                list.remove(list.indexOf(ch));
            }
        }
        return list.get(0);
    }
}
