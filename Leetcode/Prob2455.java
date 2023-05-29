public class Prob2455 {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            if(n%2==0 && n%3==0){
                sum += n;
                count++;
            }
        }
        if(count==0) return 0;
        return (int)(sum/count);
    }
}
