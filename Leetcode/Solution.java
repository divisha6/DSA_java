import java.util.Arrays;


class Solution {

    public static void main(String[] args) {
       System.out.println( maximum69Number(9669));
    }

    public static int maximum69Number (int num) {
        String s=Integer.toString(num);
        char[] nums= s.toCharArray();
        int result =0 ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==6){
                nums[i]=9;
                String res= Arrays.toString(nums);
                result= Integer.valueOf(res);
            }
        }
        return result;
    }

}