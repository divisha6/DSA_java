import java.util.*;

public class Prob1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int num=0;
        int count=0;
        if(ruleKey.equals("type")) num=0;
        if(ruleKey.equals("color")) num=1;
        if(ruleKey.equals("name")) num=2;

        for(int i=0; i<items.size(); i++){
            if(ruleValue.equals(items.get(i).get(num))){
                count++;
            }
        }
        return count;
    }
}
