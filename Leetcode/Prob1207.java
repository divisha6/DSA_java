import java.util.*;

public class Prob1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        HashSet<Integer> set = new HashSet<>();
        Iterator it = map.entrySet().iterator();
 
        while (it.hasNext()) {
            Map.Entry mapElement = (Map.Entry)it.next();
            set.add((int)mapElement.getValue());
        }
    return map.size()==set.size();
}
}
