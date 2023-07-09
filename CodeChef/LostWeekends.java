import java.util.Scanner;

public class LostWeekends {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }

            int p = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                arr[i] = p * arr[i];
                sum += arr[i];
            }

            int hours = 24 * 5;
            if (sum <= hours) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}
