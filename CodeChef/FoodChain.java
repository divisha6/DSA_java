import java.util.Scanner;

public class FoodChain {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = food(a, b, 0);
            System.out.println(ans);
        }
        sc.close();
    }

    public static int food(int a, int b, int count) {
        int c = a / b;
        if (c == 0) {
            count++;
            return count;
        }

        count++;

        return food(c, b, count);
    }
}
