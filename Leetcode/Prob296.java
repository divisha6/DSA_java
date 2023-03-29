public class Prob296 {
    public int countBinarySubstrings(String s) {
        int cur = 1, pre = 0, res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) cur++;
            // how many elements of same type 1 or 0
            else {
                res += Math.min(cur, pre);
                // out of the 2 pre and cur, the number of pairs formed witll be the minimum number of 2 element type 
                pre = cur;
                // making current type count as prev type count
                cur = 1;
                // make current as 1 because there is already one element of that type
            }
        }
        return res + Math.min(cur, pre);
    }
}
