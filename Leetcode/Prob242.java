import java.util.*;

public class Prob242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<t.length() ; i++){
            list.add(t.charAt(i));
        }

        for(int i=0; i<s.length() ; i++){
            if(list.contains(s.charAt(i))){
                list.remove(list.lastIndexOf(s.charAt(i)));
            }
            else{
                return false;
            }
        }
        return true;
    }
}
