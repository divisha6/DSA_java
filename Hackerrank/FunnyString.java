public class FunnyString {
    public static String funnyString(String s) {
        // Write your code here
        if (s.length() < 3)
            return "Funny";
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            int forward = Math.abs(s.charAt(i) - s.charAt(i + 1));
            i++;
            int backward = Math.abs(s.charAt(j) - s.charAt(j - 1));
            j--;
            if (forward == backward)
                continue;
            else
                return "Not Funny";
        }

        return "Funny";

    }
}
