package IB;

import java.util.Scanner;

public class Substrings {
    public static void printAllSubstrings(String str) {
        int n = str.length();
        for (int length = n; length >= 1; length--) {
            for (int start = 0; start < n - length + 1; start++) {
                int end = start + length;
                String substring = str.substring(start, end);
                System.out.println(substring);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("All substrings in decreasing order of size:");
        printAllSubstrings(inputString);
        scanner.close();
    }
}
