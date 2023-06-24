import java.util.Scanner;

public class URCALC {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        String c = s.next();

        if (c.equals("+")) {
            System.out.println(a + b);
        } else if (c.equals("-")) {
            System.out.println(a - b);
        } else if (c.equals("/")) {
            System.out.println(1.0 * a / b);
        } else if (c.equals("*")) {
            System.out.println(a * b);

        }
        s.close();
    }
}
