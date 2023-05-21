package Placement;
import java.util.*;

public class BalancedOrnot {
    public static int[] solve(String[] expression, int[] maxnumberOfreplacements) {
        int[] ans = new int[expression.length];
        for (int i = 0; i < expression.length; i++) {
            Stack<Character> st = new Stack<>();
            int count = 0;
            String x = expression[i];
            for (int j = 0; j < x.length(); j++) {
                char c = x.charAt(j);
                if (c == '<') {
                    st.push(c);
                } else {
                    if (!st.empty()) {
                        st.pop();
                    } else {
                        count++;
                    }
                }
            }
            if (!st.empty()) {
                ans[i] = 0;
            } else if (count <= maxnumberOfreplacements[i]) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] expression = {"<<>>", "<>", "<><>", ">>", "<<>", "><><"};
        int[] maxReplacements = {0,1,2,2,2,2};
        System.out.println(solve(expression, maxReplacements).toString());
    }
}