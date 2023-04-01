public class Prob1016 {
    public boolean queryString(String s, int n) {
        if(s.length()==1 && s.charAt(0)=='1') return true;

        for(int i=0; i<=n; i++){
            String binary = Integer.toBinaryString(i);
            if(!s.contains(binary)) return false;
        }
        return true;
    }
}
