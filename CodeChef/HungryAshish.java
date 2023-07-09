import java.util.Scanner;

public class HungryAshish {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int X = sc.nextInt(); // what he has
            int Y = sc.nextInt(); // pizza
            int Z = sc.nextInt(); // burger
            if (X >= Y) {
                System.out.println("PIZZA");
            } else if (X >= Z) {
                System.out.println("BURGER");
            } else {
                System.out.println("NOTHING");
            }
        }
        sc.close();
    }
}
