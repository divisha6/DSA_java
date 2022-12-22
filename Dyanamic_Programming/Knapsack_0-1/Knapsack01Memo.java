public class Knapsack01Memo{
    public static void main(String[] args) {
        int val[]= {15,14,100,45,30};
        int wt[]= {2,5,1,3,4};
        int W=7;

        int[][] dp= new int[val.length+1][W+1];
        // Arrays.fill(dp, -1);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]= -1;
            }
        }
        System.out.println(knap(val, wt, W, val.length, dp));
    }

    public static int knap(int[] val, int[] wt, int W, int n, int[][] dp){
        if(W==0 || n==0){
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n-1] <= W){
            // inlcude
             int ans1= val[n-1] + knap(val, wt, W-wt[n-1], n-1, dp);
            // exclude
            int ans2= knap(val, wt, W, n-1, dp);
            return Math.max(ans1, ans2);
        }

        else{
            return knap(val, wt, W, n-1, dp);
        }
    }
}