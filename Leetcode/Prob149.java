public class Prob149 {
    public int maxPoints(int[][] points) {
        int n = points.length;
        int ans = 0;

        // two or less than 2 points are present
        if (n <= 2) {
            ans = n;
        }

        // assuming points i and j are collinear
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 2;
                // checking if there are more collinear points
                for (int k = j + 1; k < n; k++) {
                    int x = (points[j][0] - points[i][0]) * (points[k][1] - points[j][1]);
                    int y = (points[k][0] - points[j][0]) * (points[j][1] - points[i][1]);
                    if (x == y) {
                        temp++;
                    }
                    if (temp > ans) {
                        ans = temp;
                    }
                }
            }
        }
        return ans;
    }
}
