public class Prob62 {
    public int uniquePaths1(int m, int n) {
        // USING DYNAMIC PROGRAMMING
        int[][] arr = new int[m][n];
        arr[m - 1][n - 1] = 1;
        for (int r = m - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                if (r + 1 < m) {
                    arr[r][c] += arr[r + 1][c];
                }

                if (c + 1 < n) {
                    arr[r][c] += arr[r][c + 1];
                }
            }
        }

        return arr[0][0];

    }

    public static int uniquePaths2(int m, int n) {
        // USING nCr FORMULA COMBINATION
        int N = m + n - 2;
        double res = 1;
        int r = m - 1;
        for (int i = 1; i <= r; i++) {
            res = res * (N - r + i) / i;
        }

        return (int) res;
    }
}
