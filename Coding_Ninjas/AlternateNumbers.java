package Coding_Ninjas;

import java.util.ArrayList;

public class AlternateNumbers {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(a[i]<0){
                neg.add(a[i]);
            } else{
                pos.add(a[i]);
            }
        }

        int n=0; int p=0; 
        for(int i=0; i<a.length; i++){
            if(i%2==0){
                a[i] = pos.get(p);
                p++;
            } else{
                a[i] = neg.get(n);
                n++;
            }
        }
        return a;
    }
}
