import java.util.Scanner;

public class BellsOfPilgrimage {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();
            int P = sc.nextInt();
            int mana = P;
            if (K <= X) {
                mana += K * 10;
            }

            if (K > X) {
                mana += X * 10 + (K - X) * 5;
            }

            if (K == N) {
                mana += 20;
            }
            System.out.println(mana);
        }
        sc.close();
    }
}
