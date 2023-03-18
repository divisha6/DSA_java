public class Prob2170 {
    public int countOperations(int nums1, int nums2) {
        int steps=0;
        while(nums1>0 && nums2>0){
            if(nums1>nums2){
                nums1 -= nums2;
                steps++;
            } else{
                nums2 -= nums1;
                steps++;
            }
        }
        return steps;
    }
}
