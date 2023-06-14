public class SuperReducedString {
    public static String superReducedString(String s) {
        // Write your code here
        StringBuffer sb = new StringBuffer(s);
        char p = '&';
        int i = 0;
        while (i < sb.length()) {
            char c = sb.charAt(i);
            if (c == p) {
                sb.deleteCharAt(i);
                i--;
                sb.deleteCharAt(i);
                i--;
                p = '&';
                if (i < 0)
                    i = 0;
            } else {
                p = c;
                i++;
            }
        }

        String ans = sb.toString();
        if (sb.length() == 0)
            return "Empty String";

        return ans;
    }

}
