import java.util.*;

public class Prob71{
    public String simplifyPath(String s) {
        Stack<String> st = new Stack<>();
        String[] dir = s.split("/");
        for(int i=0; i<dir.length; i++){
            if(dir[i].isEmpty() || dir[i].equals(".")){
                continue;
            } else if(dir[i].equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            } else{
                st.push(dir[i]);
            }
        }

        return "/" + String.join("/", st); 
    }
}