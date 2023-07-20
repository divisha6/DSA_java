public class Prob1758 {
    public int minOperations(String s) {

        // if string starts from 0 then all even indices should have a 0 and
        // all odd indices should be 1 
        // else increment count;

        int count0=0;
        for(int i=0; i<s.length(); i++){
            if((i%2==0 && s.charAt(i)=='1') || (i%2==1 && s.charAt(i)=='0')){
                count0++;
            }
        }

        return Math.min(count0, s.length()-count0);
    }
}
