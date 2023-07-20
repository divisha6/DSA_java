// import java.util.*;
public class Prob6 {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }

        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int diff = 2*(numRows-1);
        int diagonal = diff ;
        int second ;
        int first ;
        for(int i=0; i<numRows; i++){
            first = i;
            while(first<n){
                ans.append(s.charAt(first));
                if(i!=0 && i!=numRows-1){
                    diagonal = diff-2*i;
                    second = first + diagonal;

                    if(second < n){
                        ans.append(s.charAt(second));
                    }
                }
                first += diff;
            }
        }
        return ans.toString();
    }
}
