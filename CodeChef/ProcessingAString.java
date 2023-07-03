import java.util.Scanner;

public class ProcessingAString {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            int ans = 0;
            for (char c : s.toCharArray()) {
                // char c = s.charAt(i);
                if (c >= '1' && c <= '9') {
                    ans += (int) Character.getNumericValue(c);
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
