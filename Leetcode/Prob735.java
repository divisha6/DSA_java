import java.util.*;

public class Prob735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            // if(!st.isEmpty()) int top = st.peek();
            int curr = asteroids[i];
            // push if positive
            if (curr <= 0) {
                // topmost element is negative and smaller than curr
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < (curr * -1)) {
                    st.pop();
                }

                // equal in size but opp sign
                if (!st.isEmpty() && st.peek() == curr * -1) {
                    st.pop();
                }

                // topmost larger
                else if (!st.isEmpty() && st.peek() >= -1 * curr) {
                    continue;
                }

                else {
                    st.push(curr);
                }
            }

            else {
                st.push(curr);
            }
        }

        int[] ans = new int[st.size()];
        int i = ans.length - 1;
        while (!st.isEmpty()) {
            ans[i] = st.pop();
            i--;
        }

        return ans;
    }
}
