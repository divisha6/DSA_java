import java.util.*;

public class Prob859 {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        char[] ga = goal.toCharArray();
        char[] sa = s.toCharArray();
        int l=0; int r=s.length()-1;

        if(s.equals(goal)){
            HashSet<Character> set = new HashSet<>();
            for(char c: sa){
                if(set.contains(c)) return true;
                set.add(c);
            }
            return false;
        }

        // unequal strings
        while(sa[l]==ga[l] && l<r){
            l++;
        }

        while(sa[r]==ga[r] && l<r){
            r--;
        }

        char temp = sa[l];
        sa[l] = sa[r];
        sa[r] = temp;

        if(sa[l]!=ga[l] || sa[r]!=ga[r]) return false;

        while(l<r){
            l++;
            r--;
            if(sa[l]!=ga[l] || sa[r]!=ga[r]) return false;
        }  

        return true;      
    }
}
