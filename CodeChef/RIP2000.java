import java.util.Scanner;

public class RIP2000 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int money = N * 2000;
        int fiv = money / 500;
        System.out.println(fiv);
        sc.close();
    }
}
