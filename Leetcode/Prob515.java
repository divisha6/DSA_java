public class Prob515 {
    public boolean checkRecord(String s) {
        int a=0;
        int l=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='A') {
                a++;
                l=0;
            }

            if(c=='P'){
                l=0;
            }

            if(c=='L') l++;

            if(l==3 || a>=2){
                return false;
            }
        }
        return true;
    }
}
