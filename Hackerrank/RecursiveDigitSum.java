public class RecursiveDigitSum {
     public static int superDigit(String n, int k) {
    // Write your code here
    if (n.length() == 1) {
        return Integer.parseInt(n);
    }

    long sum = 0;
    for (int i = 0; i < n.length(); i++) {
        int digit = Character.getNumericValue(n.charAt(i));
        sum += digit;
    }

    sum *= k;
    return superDigit(String.valueOf(sum), 1);
    }
}
