import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        return predict(triangle, 0, 0, dp);
    }

    public int predict(List<List<Integer>> triangle, int i, int j, int[][] dp) {
        // i is the level here
        if (i == triangle.size() - 1)
            return triangle.get(i).get(j);
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int left = predict(triangle, i + 1, j, dp) + triangle.get(i).get(j);
        int right = predict(triangle, i + 1, j + 1, dp) + triangle.get(i).get(j);
        return dp[i][j] = Math.min(left, right);
    }
}