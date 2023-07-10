import java.util.Scanner;

public class CountingProblem {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] arr = new int[n];
            int one = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if ((arr[i] & 1) != 0)
                    one++;
            }

            if (((one & 1) != 0) || one == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

            // int S1=0;
            // for (int i =0;i<arr.length ;i++ )
            // if((arr[i]&1)!=0)S1++;

            // if ((S1&1)!=0||S1==0)
            // System.out.println( "no");
            // else System.out.println("yes");

            // }
        }
        sc.close();
    }
}
