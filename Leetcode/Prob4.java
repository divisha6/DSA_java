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

        // if length is odd
        if( p % 2 !=0 ){
            median = newArr [ p/2 +1];
        }

        // if length is even
        if(p % 2 ==0){
            median= (newArr[p/2] + newArr[p/2 - 1])/2.0;
        }

        return median ;
    }
}
