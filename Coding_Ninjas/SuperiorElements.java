package Coding_Ninjas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperiorElements {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();
        int max = a[a.length-1];
        list.add(max);
        for(int i=a.length-2; i>=0; i--){
            if(a[i] > max){
                list.add(a[i]);
                max = a[i];
            }
        }
        Collections.sort(list);
        return list;
    }
}
