import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeightedUniformStrings {
    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        // Write your code here
        // char-96
        char prev = '$';
        int weight = 0;
        List<String> ans = new ArrayList<>();
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == prev) {
                weight += curr - 96;
                list.add(weight);
            } else {
                prev = curr;
                weight = curr - 96;
                list.add(weight);
            }
        }

        for (int i = 0; i < queries.size(); i++) {
            if (list.contains(queries.get(i))) {
                ans.add("Yes");
            } else {
                ans.add("No");
            }
        }
        return ans;
    }
}
