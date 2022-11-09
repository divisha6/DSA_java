import java.util.*;

class RotateArray1 {
    public static void main(String[] args) {
        int k=3;
        int[] nums= {1,2,3,4,5,6,7} ;
        System.out.println(rotate(nums, k));       }


    public static String rotate(int[] nums, int k) {

        int[] rot1= Arrays.copyOfRange(nums, nums.length-k , nums.length);
        int[] rot2= Arrays.copyOfRange(nums, 0, nums.length-k);
        
        int pos=0;
        
        int aLen = rot1.length;
        int bLen = rot2.length;
        int[] result = new int[aLen + bLen];
        
        for (int element : rot1) {
            result[pos] = element;
            pos++;
        }

        for (int element : rot2) {
            result[pos] = element;
            pos++;
        }
        
        return Arrays.toString(result);
    }
}