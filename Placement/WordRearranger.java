import java.util.Arrays;

public class WordRearranger {
    public static String rearrange(String word) {
        char[] charArray = word.toCharArray(); 
        Arrays.sort(charArray); 
        return new String(charArray); 
    }
    
    public static void main(String[] args) {
        String word = "Divisha";
        String rearrangedWord = rearrange(word);
        System.out.println(rearrangedWord);
    }
}
