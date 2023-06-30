import java.util.Arrays;
import java.util.Scanner;

public class ChefAndEid {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            sc.nextLine();
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            for (int i = 1; i < n; i++) {
                min = Math.min(min, (arr[i] - arr[i - 1]));
            }
            System.out.println(min);
        }
        sc.close();
    }
}
