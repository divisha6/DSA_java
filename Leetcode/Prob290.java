import java.util.*;
public class Prob290 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> map = new HashMap<>();
        s = s.trim();
        String[] str = s.split(" ");

        if(pattern.length() != str.length){
            return false;
        }
        String comp="";
        for(int i=0; i<str.length; i++){
            if( !map.containsKey(str[i]) && !map.containsValue(pattern.charAt(i))){
                map.put(str[i], pattern.charAt(i));
            } 
            comp += map.get(str[i]);
        }
        return comp.equals(pattern);
    }
}
