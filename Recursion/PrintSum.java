// package Recursion;

public class PrintSum {
    public static int calcFactorial(int n) {
        if (n==1 || n ==0) {
            return 1 ;
        }

        int fact_nm1= calcFactorial(n-1);
        int fact_n= n * fact_nm1;
        return fact_n;
    }
    
    public static void main(String[] args) {
        int ans = calcFactorial(5);
        System.out.println(ans);
    }
    


    public static void printSum(int i, int n, int sum) {
        if (i==n){
            sum= sum+i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        printSum(i+1, n, sum);
    }

    
}
