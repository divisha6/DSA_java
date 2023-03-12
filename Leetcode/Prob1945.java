import java.util.*;

public class Prob1945 {
    public int getLucky(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=1; i<27; i++){
            map.put((char)(i+96), i);
        }   

        String num = new String();
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            num += map.get(ch);
        }

        // int n = Integer.valueOf(num);
        int sum = 0;
         while(k-- > 0){
            sum=0;
            for(char c: num.toCharArray()){
                sum += Integer.parseInt(c+"");
            }
            num = String.valueOf(sum);
        }
        return sum;
    }
}
