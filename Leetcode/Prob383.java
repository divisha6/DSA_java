import java.util.*;
public class Prob383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<magazine.length(); i++){
            list.add(magazine.charAt(i));
        }

        for(int i=0; i<ransomNote.length(); i++){
            if(list.contains(ransomNote.charAt(i))){
                list.remove(list.lastIndexOf(ransomNote.charAt(i)));
            } else {
                return false;
            }
        }
        return true;
    }
}
