import java.util.Scanner;

public class GymkhanaElection {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int i = 0;
        while (i < T) {
            int N = sc.nextInt(); // nominated
            int M = sc.nextInt(); // voters
            i++;

            System.out.println((M / 2) + 1);
        }
    }
}
