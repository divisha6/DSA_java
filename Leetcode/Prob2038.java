public class Prob2038 {
    public boolean winnerOfGame(String colors) {
        int countA=0; 
        int countB=0; 
        for(int i=1; i<colors.length()-1; i++){
            if(colors.charAt(i)=='A' && colors.charAt(i+1)=='A' && colors.charAt(i-1)=='A'){
                countA++;
            }
            if(colors.charAt(i)=='B' && colors.charAt(i+1)=='B' && colors.charAt(i-1)=='B'){
                countB++;
            }
        }
        if(countA==countB) return false;
        if(countA>countB) return true;

        return false;
    }
}
