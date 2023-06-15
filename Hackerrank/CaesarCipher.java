public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        // Write your code here
        String ans = "";
        String small = "abcdefghijklmnopqrstuvwxyz";
        String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(char c : s.toCharArray()){
            if(c<91 && c>64){
                // Caps
                char t = caps.charAt((caps.indexOf(c)+k)%26);
                ans += t;        
            }
            else if(c<123 && c>96){
                // Small
                char t = small.charAt((small.indexOf(c)+k)%26);
                ans += t;        
            }
            else{
                ans += c;
            }
        }
        
        return ans;
        }
}
