public class Prob1929 {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        for(int i=0; i<nums.length ; i++){
                arr[i+nums.length]=arr[i]=nums[i];
                
            }
        return arr;
    }
}
