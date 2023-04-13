import java.util.*;

public class Prob946{
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int p=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<pushed.length; i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek()==popped[p]){
                st.pop();
                p++;
            }
        }

        return st.isEmpty();
    }
}