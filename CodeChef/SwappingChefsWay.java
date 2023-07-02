import java.util.Scanner;

public class SwappingChefsWay {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            for (int i = 0; i < N / 2; i++) {
                char c = s.charAt(i);
                char b = s.charAt(s.length() - i - 1);
                if (c > b) {
                    s = swap(s, i);
                }
            }

            boolean isPossible = true;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) < s.charAt(i - 1)) {
                    isPossible = false;
                }
            }
            if (isPossible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static String swap(String s, int i) {
        StringBuffer sb = new StringBuffer(s);
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(sb.length() - 1 - i));
        sb.setCharAt(sb.length() - 1 - i, temp);
        return sb.toString();
    }
}
