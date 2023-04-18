public class Prob1768 {
    public String mergeAlternately(String word1, String word2) {
        int one =0;
        int two =0;
        String ans = "";
        while(one < word1.length() && two < word2.length()){
            char o = word1.charAt(one);
            char t = word2.charAt(two);
            ans = ans + o;
            ans = ans + t;
            one++;
            two++;
        }

        if(one < word1.length()){
            while(one<word1.length()){
                ans += word1.charAt(one);
                one++;
            }
        } else if (two< word2.length()){
            while(two<word2.length()){
                ans += word2.charAt(two);
                two++;
            }
        }

        return ans;
    }
}
