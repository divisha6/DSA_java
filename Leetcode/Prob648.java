import java.util.*;

public class Prob648 {
    public String replaceWords(List<String> d, String sentence) {
        String[] words = sentence.split(" ");
        HashSet<String> dictionary = new HashSet<>(d);
        for(int i=0; i<words.length; i++){
            String word = words[i];
            String check = "";
            for(int j=0; j<word.length(); j++){
                check = word.substring(0,j+1);
                if(dictionary.contains(check)){
                    words[i]=check;
                    break;
                }
            }
        }

        String ans = "";
            for(int i=0; i<words.length; i++){
                ans += words[i];
                if(i!=words.length-1){
                    ans += " ";
                }
            }

        return ans;
    }
}
