public class Prob1446 {
    public int maxPower(String s) {
        char ch = s.charAt(0);
        int temp=1;
        int max=1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==ch){
                temp++;
            } else{
                ch = s.charAt(i);
                max = Math.max(temp, max);
                temp=1;
            }
        }
        
        max = Math.max(temp, max);
        return max;
    }
}
