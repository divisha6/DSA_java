import java.util.Scanner;

public class LongestCommonSubstring {

    public static String findLongestCommonSubstring(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0;
        int endIndex = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }

        return str1.substring(endIndex - maxLength, endIndex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first substring: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second substring: ");
        String str2 = scanner.nextLine();

        String longestCommonSubstring = findLongestCommonSubstring(str1, str2);
        if (longestCommonSubstring.isEmpty()) {
            System.out.println("No common substring found.");
        } else {
            System.out.println("Longest common substring: " + longestCommonSubstring);
        }
        scanner.close();
    }
}
