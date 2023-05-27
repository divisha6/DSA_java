import java.util.*;

public class Prob2506 {
    public int similarPairs(String[] words) {
        int count=0;
        ArrayList<HashSet<Character>> list = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            String w = words[i];
            HashSet<Character> set = new HashSet<>();
            for(char c:w.toCharArray()){
                set.add(c);
            }
            list.add(set);
        }

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i).equals(list.get(j))){
                    count++;
                }
            }
        }

        return count;
    }
}
