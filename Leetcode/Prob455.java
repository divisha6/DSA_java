import java.util.*;

public class Prob455 {
    public int findContentChildren(int[] g, int[] s) {
        int content = 0;
        int j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i=0; i<g.length; i++){
            while(j<s.length){
                if(s[j]>=g[i]){
                    content++;
                    j++;
                    break;
                }
                j++;
            }
        }
        return content;
    }
}
