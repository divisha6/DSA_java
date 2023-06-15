import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Gemstones {
    public static int gemstones(List<String> arr) {
    // Write your code here
    int gems=0;
    HashMap<Character, Integer> map = new HashMap<>();
    for(String s : arr){
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
            set.add(c);
        }
        set.clear();
    }
    
    for(char key : map.keySet()){
        if(map.get(key)==arr.size()) gems++;
    }
    return gems;
    }
}
