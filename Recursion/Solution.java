public class Solution {
    public static void main(String[] args) {
        System.out.println(makeGood("abBAcC"));
    }

    public static String makeGood(String s1) {
        return str2(s1);
    }

    public static String str2(String s) {
        String newStr = "";
        int i = 0;
        while (s.length() >= 0) {
            if (s.charAt(i) == s.charAt(i + 1) + 32) {
                newStr = s.substring(0, i) + s.substring(i + 2, s.length());
                i++;
            }
        }
        return str2(newStr);
    }
}
