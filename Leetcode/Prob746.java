public class Prob746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] steps = new int[cost.length+1];
        steps[1]=cost[0];
        for(int i=2; i<steps.length; i++){
            int op1= cost[i-1]+steps[i-1];
            int op2= cost[i-1]+steps[i-2];
            steps[i]=Math.min(op1, op2);
        }

        int n = steps.length;
        return Math.min(steps[n-1], steps[n-2]);
    }
}
