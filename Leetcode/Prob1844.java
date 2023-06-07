public class Prob1844 {
    public String replaceDigits(String s) {
        String ans = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                ans += s.charAt(i);
            } else{
                char c = (char)(s.charAt(i-1) + s.charAt(i) - '0');
                ans += c;
            }
        }
        return ans;
    }
}
