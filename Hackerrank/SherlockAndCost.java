import java.util.List;

public class SherlockAndCost{
    public static int cost(List<Integer> B) {
        // Write your code here
        int sum1=0 ; int sum2=0;
        for(int i=1; i<B.size(); i++){
            int one = Math.abs(B.get(i)-1);
            int two = Math.abs(B.get(i-1)-1);
            int prev1= sum1;
            int prev2 = sum2;
            sum1 = prev2 + two;
            sum2 = Math.max((prev1 + one),(prev2 + Math.abs(B.get(i)-B.get(i-1))));
            // int max = Math.max(one, two);
            // ans += max;
        }
            return Math.max(sum1, sum2);
        }
}