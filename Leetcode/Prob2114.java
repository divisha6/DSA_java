public class Prob2114 {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(int i=0; i<sentences.length; i++){
            int temp=0;
            String str= sentences[i];
            String parts[] = str.split(" ");
            for(String part: parts) {
                temp++;
            }
            count= Math.max(count, temp);
        }
        return count;
    }
}
