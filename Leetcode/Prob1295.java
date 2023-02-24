public class Prob1295 {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++){
            // int num=;
            if(numberOfDigits(nums[i])%2!=0){
                continue;
            }
            else{
                ans++;
            }
        }
        return ans;
    }

    public int numberOfDigits(int n){
        int count =0;
        while (n>=1){
            n=n/10;
            count++;
        }
        return count;
    }
}
