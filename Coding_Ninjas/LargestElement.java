package Coding_Ninjas;

public class LargestElement {
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max=0;
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
        
    }
    
}
