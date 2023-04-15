import java.util.*;

public class Prob1051 {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            expected[i]=heights[i];
        }

        Arrays.sort(expected);
        int count=0;
        for(int i=0; i<expected.length; i++){
            if(heights[i]!=expected[i]) count++;
        }
        return count;
    }
}
