import java.util.Scanner;

public class CANDY123 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        // thing to remember-
        // sum of n odd numbers is equal to n*2
        // sum of n even numbers is n(n+1)
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String ans = "";
            int maxLimak = sc.nextInt();
            int maxBob = sc.nextInt();
            for (int i = 1; i < maxBob + maxLimak; i++) {
                if (i * i > maxLimak) {
                    ans = "Bob";
                    break;
                }
                if (i * (i + 1) > maxBob) {
                    ans = "Limak";
                    break;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
