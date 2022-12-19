import java.util.Arrays;

// how many ways in which you can climb n number of stairs if you can take either 1 or 2 steps at a time?

public class ClimbingStairs {
    public static void main(String[] args) {
        int n= 4;
        int[] waysArr= new int[n+1];
        Arrays.fill(waysArr, -1);
        System.out.println(countWays(n, waysArr));

    }
    public static int countWays(int n, int[] waysArr) {
        if(n==0 || n==1){
            return 1;
        }
        if (n<0){
            return 0;
        }

        if(waysArr[n] != -1){
            return waysArr[n];            
        }

        waysArr[n]= countWays(n-1, waysArr) + countWays(n-2, waysArr);
        
        return waysArr[n];
    }
}
