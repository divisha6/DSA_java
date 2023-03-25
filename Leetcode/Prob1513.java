public class Prob1513 {
    public int numSub(String s) {
        int count =0;
       int ans =0;

       for(int i=0; i<s.length(); i++){
           if(s.charAt(i) == '1'){
               count++;
               ans= (ans+ count)%1000000007;
           }
           else{
               count=0;
           }
       } 
       return ans;
    }
}
