public class Prob683 {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        for(int i=1; i<binary.length(); i++){
            if(binary.charAt(i-1)==binary.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
