public class Prob387 {
    public int firstUniqChar(String s) {
        int ans =-1;
        for(int i=s.length()-1; i>=0; i--){

            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                ans = i;
            }
        }
        return ans;
    }
}
