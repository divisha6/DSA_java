package Loops;

public class Main {
    public static void main(String[] args) {
        pattern1(6);
    }

        static void pattern1(int n) {
            for (int row = 1; row <= n; row++) {
                for (int s = 0; s < n- row ; s++) {
                        System.out.print("  ");
                    }
                for (int col = row; col>=1; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= row; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();

            }
            
        }
    }

