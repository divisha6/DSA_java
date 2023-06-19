public class Prob1732 {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length+1];
        alt[0]=0;
        int max = 0;
        for(int i=1; i<alt.length; i++){
            alt[i]=gain[i-1] + alt[i-1];
            max = Math.max(alt[i], max);
        }

        return max;

    }
}
