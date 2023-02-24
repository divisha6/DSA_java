public class Prob171 {
    public int titleToNumber(String columnTitle) {
        int count=0;
        int sum=0;
        for(int i=0; i<columnTitle.length(); i++){
            count = columnTitle.charAt(i)-'A'+1;
            sum= sum*26 + count;
        }
        return sum;
    }
}
