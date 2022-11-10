public class Reverse {

    public static void main(String[] args) {
        reverse2(7843);
        System.out.println(x);
    }

    // FIRST WAY
    public static void reverse(int n) {

        if (n % 10 == 0) {
            return;
        }
        System.out.print(n % 10);

        reverse(n / 10);

    }

    // SECOND WAY
    static int x = 0;

    public static void reverse2(int n) {
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        x = x * 10 + rem;

        reverse2(n / 10);

    }

}


//hello!