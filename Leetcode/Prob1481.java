import java.util.*;

public class Prob1481 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int value: map.values()){
            list.add(value);
        }

        Collections.sort(list);

        while(k>0){
            if(k<list.get(0)) break;
            k-=list.get(0);
            list.remove(0);
        }
        return list.size();
    }
}
