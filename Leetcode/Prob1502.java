import java.util.*;
public class Prob1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length<=2) return true;

        int diff= arr[1]-arr[0];
        for(int i=2; i<arr.length; i++){
            int c = arr[i]-arr[i-1];
            if(c!=diff) return false;
        } 

        return true;
    }
}
