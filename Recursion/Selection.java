import java.util.*;

public class Selection {
    public static void main(String[] args) {
        int[] array = { 1, 4, 2, 3 };
        selection(array, array.length, 0, 0);
        System.out.println(Arrays.toString(array));
    }

    public static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }

        // here r is the number of passes and c is the index of the element that will
        // update with every iteration
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r - 1, 0, 0);

        }
        // swap the last element with the max element

    }
}
