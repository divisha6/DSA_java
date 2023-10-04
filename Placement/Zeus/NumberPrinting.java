package Zeus;

public class NumberPrinting {
    public static void printNumbers(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(number);
            number *= 10;
        }
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        
        System.out.println("Output for n=3:");
        printNumbers(n1);

        System.out.println("\nOutput for n=5:");
        printNumbers(n2);
    }
}
