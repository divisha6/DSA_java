import java.util.*;

public class Prob350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<nums1.length; i++){
            list.add(nums1[i]);
            }

            for(int i=0; i<nums2.length; i++){
            if(list.contains(nums2[i])){
                res.add(nums2[i]);
                list.remove(list.indexOf(nums2[i]));
            }
        }    
        return res.stream().mapToInt(i -> i).toArray();
    }
}
