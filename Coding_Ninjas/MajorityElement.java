package Coding_Ninjas;

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int []v) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<v.length; i++){
            map.put(v[i], map.getOrDefault(v[i],0)+1);
        }

        int c = v.length/2;
        for(int key: map.keySet()){
            if(map.get(key)>=c){
                return key;
            }
        }
        return 0;
    }
}
