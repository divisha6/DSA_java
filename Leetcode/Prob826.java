public class Prob826 {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[] dp = new int[100001];
        for(int i=0; i<difficulty.length; i++){
            dp[difficulty[i]]=Math.max(profit[i], dp[difficulty[i]]);
        }

        for(int i=0; i<dp.length; i++){
            if(i>0) dp[i]=Math.max(dp[i-1], dp[i]);
        }

        int sum=0;
        for(int w : worker){
            sum += dp[w];
        }

        return sum;
    }
}
