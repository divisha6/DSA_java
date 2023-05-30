public class Prob2710 {
    public String removeTrailingZeros(String num) {
        String ans = "";
        boolean non_zero=false;
        for(int i=num.length()-1; i>=0; i--){
            char c = num.charAt(i);
            if(c=='0' && non_zero==true){
                ans = c + ans;
            } else if(c!='0'){
                non_zero=true;
                ans = c + ans;
            } else{
                continue;
            }
        }
        return ans;
    }
}
