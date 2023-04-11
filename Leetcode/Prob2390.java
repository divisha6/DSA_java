import java.util.*;

public class Prob2390{
    public String removeStars(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c!='*'){
                st.push(c);
            } else{
                st.pop();
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