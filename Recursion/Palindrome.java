public class Palindrome {
    public static void main(String[] args) {
        int n = 1215;
        int temp = rev(n, 0);
        boolean palindrome= true;

        if (temp == n)
            System.out.println(palindrome);
        else
            System.out.println(!palindrome);
    }

    static int rev(int n, int temp) {
        // base case
        if (n == 0)
            return temp;

        // stores the reverse
        // of a number
        temp = (temp * 10) + (n % 10);

        return rev(n / 10, temp);
    }

}
