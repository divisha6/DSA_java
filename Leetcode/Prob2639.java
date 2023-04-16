public class Prob2639 {
    public int[] findColumnWidth(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[] ans = new int[grid[0].length];
        for(int i=0;i<n;i++)
        {
            int max=0;
            for(int j=0;j<m;j++)
            {
                max=Math.max(max,String.valueOf(grid[j][i]).length());
            }
            ans[i]=max;
        }
        return ans; 
    }
}
