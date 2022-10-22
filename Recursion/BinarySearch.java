// Binary Search using recursion

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 6;
        System.out.println(binary(arr, target, 0, arr.length - 1));
    }

    public static int binary(int[] arr, int target, int s, int e) {
        // int s = 0;
        // int e = arr.length - 1;

        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (arr[m] > target) {
            return binary(arr, target, s, m - 1);
        }

        return binary(arr, target, m + 1, e);

    }
}
