package Zeus;

public class NumberGenerator {
    public static void generateNumbers(int n, int x) {
        int count = 0;
        int number = x  + 2;
        
        while (count < n) {
            System.out.print(number + " ");
            number += 2;
            count++;
        }
    }

    public static void main(String[] args) {
        int n1 = 10;
        int x1 = 4;
        int n2 = 4;
        int x2 = 1;

        System.out.println("Output for n=10, x=4:");
        generateNumbers(n1, x1);

        System.out.println("\nOutput for n=4, x=1:");
        generateNumbers(n2, x2);
    }
}

