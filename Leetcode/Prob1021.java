public class Prob1021 {
    public String removeOuterParentheses(String s) {
        if(s.length()==0) return "";

        StringBuilder str= new StringBuilder();
        int open =0;
        int close=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                open++;
                if(open>1){
                str.append('(');
            } 
            }            
            else{
                close++;
                if(close==open){
                    open=close=0;
                }
                else{
                    str.append(')');
                }
            }
        }
        return str.toString();
    }
}
