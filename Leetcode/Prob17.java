import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Prob17 {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> ans = new ArrayList<>();
        if(digits.length()==0) return ans;
        ans.add("");
        for(int i=0; i<digits.length(); i++){
            String d = map.get(digits.charAt(i));
            ans = combine(d,ans);
        }

        return ans;

    }

    public List<String> combine(String d, List<String> list){
        List<String> ans = new ArrayList<>();
        for(int i=0; i<d.length(); i++){
            char c = d.charAt(i);
            for(String s : list){
                ans.add(s+c);
            }
        }
        return ans;
    }
}
