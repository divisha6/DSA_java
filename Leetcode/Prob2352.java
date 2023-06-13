import java.util.*;

public class Prob2352 {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> row = new HashMap<>();
        HashMap<String, Integer> col = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringBuilder r = new StringBuilder();
            StringBuilder c = new StringBuilder();

            for (int j = 0; j < n; j++) {
                r.append(grid[i][j]).append(' ');
                c.append(grid[j][i]).append(' ');
            }

            row.put(r.toString(), row.getOrDefault(r.toString(), 0) + 1);
            col.put(c.toString(), col.getOrDefault(c.toString(), 0) + 1);
        }

        int count=0;
        for(String s : row.keySet()){
            if(col.containsKey(s)){
                count += row.get(s) * col.get(s);
            }
        }

        return count;
    }
}
