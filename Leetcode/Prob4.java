import java.util.*;

public class Prob4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n= nums2.length;
        double median= 0;
        int[] newArr = new int[m+n];
        for(int i=0; i<m; i++){
            newArr[i]= nums1[i];
        }

        for(int i=0; i<n; i++){
            newArr[m+i] = nums2[i];
        }

       if (newArr.length==1 ) return newArr[0];

        int p = newArr.length;
        int mid= p/2;
        Arrays.sort(newArr);

        // if length is even
        if( p % 2 ==0 ){
            median = (newArr[mid]+newArr[mid-1])/2.0;
        }

        // if length is odd
        else{
            median = newArr[mid];
        }

        return median ;
    }
}
