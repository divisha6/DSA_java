public class Prob714 {
    public int maxProfit(int[] prices, int fee) {
        int buy = Integer.MIN_VALUE;
        int sell = 0;
        for(int i=0; i<prices.length; i++){
            int price = prices[i];
            buy = Math.max(buy, sell-price);
            sell = Math.max(sell, buy+price-fee);
        }
       return sell;
   }
}
