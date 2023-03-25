public class Prob503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i]= findGreat(i, nums);
        }
        return res;
    }

    public int findGreat(int index, int[] nums2){
        int ans = -1;
        int c = nums2[index];
        for(int j=index; j<nums2.length; j++){
                if(nums2[j]>c){
                    ans = nums2[j];
                    return ans;
                }
        }

        for(int i=0; i<index; i++){
            if(nums2[i]>c){
                ans = nums2[i];
                return ans;
            }
        }
        return -1;
    }
}
