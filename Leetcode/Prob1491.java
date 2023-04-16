public class Prob1491 {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=0;
        double sum=0;
        for(int i=0; i<salary.length; i++){
            min = Math.min(salary[i], min);
            max = Math.max(salary[i], max);
            sum += salary[i];
        }

        sum = sum - min - max;
        double ans = sum/(salary.length-2);
        return ans;
    }
}
