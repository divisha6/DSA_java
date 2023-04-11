import java.util.*;
public class Prob844 {
    public boolean backspaceCompare(String s, String t) {
        String ans1 = answer(s);
        String ans2 = answer(t);
        return ans1.equals(ans2);
    }

    public String answer(String s){
        Stack<Character> st= new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
                if(!st.isEmpty() && c=='#'){
                    st.pop();
                } else if(st.isEmpty() && c=='#'){
                    continue;
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
