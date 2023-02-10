public class Prob66 {
    public int[] plusOne(int[] digits) {
                int[] ans = new int[digits.length +1];
        
                if(digits.length ==0){
                    ans[0]=1;
                    return ans;
                }
                
        
                for(int i=digits.length -1; i>=0 ; i--){
                    if(digits[i]<9){
                        digits[i]++;
                        return digits;
                    }
                    digits[i]=0;
                }
                digits = new int[digits.length + 1];
                digits[0]=1;
                return digits;
            }
}
