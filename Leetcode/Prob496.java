import java.util.*;
public class Prob496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums2.length; i++){
            list.add(nums2[i]);
        }

        for(int i=0; i<nums1.length; i++){
            int idx= list.indexOf(nums1[i]);
            ans.add(findGreat(idx, nums2));
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }

    public int findGreat(int index, int[] nums2){
        int c = nums2[index];
        for(int j=index; j<nums2.length; j++){
                if(nums2[j]>c){
                    return nums2[j];
                }
            }
        return -1;
    }
}
