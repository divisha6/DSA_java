public class Prob75 {
    public void sortColors(int[] nums) {
        int[] ans = new int[nums.length];
        int insert=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                ans[insert]=0;
                insert++;
            }
        }
 
         for(int i=0; i<nums.length; i++){   
            if(nums[i]==1){
                ans[insert]=1;
                insert++;
            }
         }
            
         for(int i=0; i<nums.length; i++){
            if(nums[i]==2){
                ans[insert]=2;
                insert++;
            }
         }
 
         for(int i=0; i<nums.length; i++){
             nums[i]=ans[i];
         }
        
     }
}
