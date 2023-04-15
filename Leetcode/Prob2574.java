public class Prob2574 {
    public int[] leftRigthDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0]=0; right[right.length-1]=0;

        for(int i=1; i<nums.length; i++){
            left[i]= nums[i-1] + left[i-1];
        }

        for(int i=nums.length-2; i>=0; i--){
            right[i]= nums[i+1] + right[i+1];
        }

        int[] ans = new int[nums.length];
        for(int i=0; i<ans.length; i++){
            ans[i]=Math.abs(right[i]-left[i]);
        }

        return ans;
    }
}
