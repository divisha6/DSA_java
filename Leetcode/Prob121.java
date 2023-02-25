public class Prob121 {
    public int maxProfit(int[] prices) {
        int profit=0;
        int profitRN=0;
        int min=Integer.MAX_VALUE;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min=prices[i];
            }
            profitRN = prices[i]-min;
            profit = Math.max(profit, profitRN);
        }

        return profit;
    }
}
