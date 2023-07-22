package Coding_Ninjas;

public class LeftRotate1 {
    static int[] rotateArray(int[] a, int n) {
        // Write your code here.
        int first = a[0];
        for(int i=1; i<n; i++){
            a[i-1] = a[i];
        }

        a[n-1] = first;
        return a;

    }
}
