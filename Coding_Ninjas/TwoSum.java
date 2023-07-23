package Coding_Ninjas;

import java.util.HashSet;

public class TwoSum {
    public static String read(int n, int []book, int target){
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(book[i]);
        }


        for(int i=0; i<n; i++){
            int rem = target-book[i];
            if(set.contains(rem)){
                return "YES";
            }
        }

        return "NO";
    }
}
