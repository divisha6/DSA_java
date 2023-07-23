public class Prob1614 {
    public int maxDepth(String s) {
        int open = 0; 
        int depth=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                open++;
            } else if(s.charAt(i)==')'){
                open--;
            }
                depth = Math.max(depth,open);
        }
        return depth;
    }
}
