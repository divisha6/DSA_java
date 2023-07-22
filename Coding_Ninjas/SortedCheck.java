package Coding_Ninjas;

public class SortedCheck {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i=1; i<a.length; i++){
            if(a[i-1]>a[i]){
                return 0;
            } else{
                continue;
            }
        }
        return 1;
    }
}
