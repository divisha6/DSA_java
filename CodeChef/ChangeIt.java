import java.util.HashMap;
import java.util.Scanner;

public class ChangeIt {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            HashMap<Integer, Integer> map = new HashMap<>();
            int k = n;
            while (k-- > 0) {
                int i = sc.nextInt();
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            int max = 0;
            for (int key : map.keySet()) {
                int val = map.get(key);
                max = Math.max(max, val);
            }

            int moves = n - max;
            System.out.println(moves);
        }
        sc.close();
    }
}
