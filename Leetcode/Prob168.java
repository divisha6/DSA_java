public class Prob168 {
    public String convertToTitle(int num) {
        String ans ="";
        while(num>0){
            num--;
            ans = (char)('A'+(num%26)) + ans;
            num /= 26;
        }
        return ans;
    }
}
