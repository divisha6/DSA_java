import java.util.*;
public class Prob2706 {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum= prices[0] + prices[1];
        if(sum>money) return money;

        return money-sum;
    }
}
