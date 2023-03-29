public class Prob1529 {
    public int minFlips(String target) {
        String s= "";
        int parts=0;
        for(int i=0; i<target.length(); i++){
            s=s+"0";
        }

        for(int i=1; i<target.length(); i++){
            if((target.charAt(i)=='1' && target.charAt(i-1)=='0') ||
                    target.charAt(i)=='0' && target.charAt(i-1)=='1') {
                        parts++;
                    }
        }

        if(s.equals(target)) return 0;
        if(target.charAt(0)=='0') return parts;
        return parts+1;
    }
}
