import java.util.*;

public class Prob3 {
    public int lengthOfLongestSubstring(String s) {
        int total=0;
        int ans=0;
        // int ans=0;
        ArrayList<Character> arr = new  ArrayList<>();
        for(int i =0; i<s.length(); i++){
            if(arr.contains(s.charAt(i))){
                total = Math.max(total, ans);
                arr.subList(0, arr.lastIndexOf(s.charAt(i))+1).clear();
                ans= arr.size();
            }
            if(!arr.contains(s.charAt(i))){
                arr.add(s.charAt(i));
                ans++;
            }
        }
        return Math.max(total, ans);
    }
}
