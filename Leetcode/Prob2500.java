import java.util.Arrays;

public class Prob2500 {
    public int deleteGreatestValue(int[][] grid) {
        int ans = 0;
        for(int[] arr: grid){
            Arrays.sort(arr);
        }

        for(int i=0; i<grid[0].length; i++){
            int max =0;
            for(int[] arr : grid){
                max = Math.max(arr[i],max);
            }

            ans+= max;
        }
        return ans;
    }
}
