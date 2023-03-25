public class Prob1759 {
    public int countHomogenous(String s) {
        int count =1;
        char ch = s.charAt(0);
        int ans =1;
 
        for(int i=1; i<s.length(); i++){
            if(ch == s.charAt(i)){
                count++;
                ans=(ans+ count)%1000000007;
            }else{
                ch = s.charAt(i);
                count=1;
                 ans=(ans + count)%1000000007;
                 
            }
        } 
        return ans;
     }
}
