public class Prob1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        int count=0;
        ans[0]=nums[0];
        for(int i=0; i<n ; i++){
            ans[count]=nums[i];
            ans[count+1]=nums[i+n];
            count=count+2;
        }
        return ans;
    }
}
