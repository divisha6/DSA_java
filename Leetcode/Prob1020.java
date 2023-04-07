public class Prob1020{
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0; i<m; i++){
            dfs(grid, i, 0);
            dfs(grid, i, n-1);
        }

        for(int i=0; i<n; i++){
            dfs(grid, 0, i);
            dfs(grid, m-1, i);
        }

        for(int i=1; i<grid.length; i++){
            for(int j=1; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!=1){
            return ;
        }

        grid[i][j]=-1;
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
}