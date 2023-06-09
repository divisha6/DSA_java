import java.util.*;

public class Prob744 {
    public char nextGreatestLetter(char[] letters, char target) {
        
        for(int i=0; i<letters.length; i++){
            char c = letters[i];
            if(c-target>0) return c;
        }
        return letters[0];

        // ArrayList<Character> list = new ArrayList<>();
        // for(int i=0; i<letters.length; i++){
        //     list.add(letters[i]);
        // }

        // list.add(target);
        // Collections.sort(list);
        // if(list.get(list.size()-1)==target) return list.get(0);
        
        
        // return list.get(list.lastIndexOf(target)+1);
    }
}
