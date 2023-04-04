import java.util.*;

public class Prob2405 {
    public int partitionString(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(list.contains(s.charAt(i))){
                count++;
                list.clear();
            }
            list.add(s.charAt(i));
        }
        return count+1;
    }
}
