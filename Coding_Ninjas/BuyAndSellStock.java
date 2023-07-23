package Coding_Ninjas;

public class BuyAndSellStock {
    public static int bestTimeToBuyAndSellStock(int[] prices) {
        // Write your code here.
        int profit = 0;
        int maxpr = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int curr = prices[i];
            if (curr < min) {
                min = curr;
            }

            profit = curr - min;
            maxpr = Math.max(maxpr, profit);
        }
        return maxpr;
    }
}
