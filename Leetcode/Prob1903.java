public class Prob1903 {
    public String largestOddNumber(String num) {
        if(num.charAt(num.length()-1)%2==1){
            return num;
        }
        String ans = new String();
        for(int i=num.length()-1; i>=0; i--){
            if(num.charAt(i)%2==1){
                ans = num.substring(0,i+1);
                return ans;
            }
        }
        return "";
    }
}
