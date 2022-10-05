package Recursion;

public class PrintNum {
    public static void printNumbers(int n) {
        if (n==0) {
            return ; //base case 
        }
            System.out.println(n);
            printNumbers(n-1);
    }

    public static void main(String[] args) {
        int n= 7;
        printNumbers(n);
    }
}
