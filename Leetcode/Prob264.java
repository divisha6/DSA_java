public class Prob264 {
    public int nthUglyNumber(int n) {
        int[] nums = new int[n];
        int i2=0; int i3=0; int i5=0;
        nums[0]=1;
        for(int i=1; i<n; i++){
            int min = Math.min(nums[i2]*2, Math.min(nums[i3]*3, nums[i5]*5));
            if(min==nums[i2]*2){
                nums[i]=min;
                i2++;
            }
            
            if(min==nums[i3]*3){
                nums[i]=min;
                i3++;
            }
            
            if(min==nums[i5]*5){
                nums[i]=min;
                i5++;
            }
        }
        return nums[n-1];
    }
}
