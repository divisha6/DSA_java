public class Prob476 {
    public int findComplement(int num) {
        String bin = Integer.toBinaryString(num);
        String ans = "";
        for(int i=0; i<bin.length(); i++){
            if(bin.charAt(i)=='0'){
                ans = ans + "1";
            } else {
                ans += "0";
            }
        }
        int res = Integer.parseInt(ans,2);
        return res;
    }
}
