import java.util.*;

public class Prob1047 {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && c==st.peek()){
                st.pop();
            } else{
                st.push(c);
            }
        }

        String ans = "";
        Iterator value = st.iterator();
        while (value.hasNext()) {
            ans = ans+value.next();
        }
        return ans;
    }
}
