import java.util.*;

public class Prob2284 {
    public String largestWordCount(String[] messages, String[] senders) {
        String  ans = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<senders.length; i++){
            String[] words = messages[i].split("\\s+");
            map.put(senders[i], words.length + map.getOrDefault(senders[i],0));
        }

        int max =0;
        for (String name : map.keySet()) {
            int words = map.get(name);
            if (words > max) {
                max = words;
                ans = name; 
            } 
            else if (words == max) {
                // keep the name which is lexicographically greater
                int x = ans.compareTo(name);
                ans = (x > 0)? ans : name;
            }
        }
        return ans;
    }
}
