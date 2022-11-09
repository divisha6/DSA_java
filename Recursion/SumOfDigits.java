public class SumOfDigits {
    public static void main(String[] args) {
        // System.out.println(sum(95));
        System.out.println(product(1295));
    }

    public static int sum(int n) {

        if (n%10 ==0){
            return 0;
        }
        return ((n % 10) + sum(n /10));
    }

    public static int product(int n) {
        if (n%10 ==0){
            return 1;
        }
        return ((n % 10) * product(n /10));
    }
}
