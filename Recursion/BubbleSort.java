// REDO REDO REDO REDO
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] updated = { 1, 4, 8, 9, 2, 3, 5 };
        bubble(updated, updated.length -1 , 0);
        System.out.println(Arrays.toString(updated));
    }


    public static void bubble(int[] arr, int i, int j) {
        if (i == 0) {
            return;
        }

        // suppose i = 4 i.e. it is the 4th pass, j has to be less than 4. it can be 3.
        // because in the 4th pass, the 4th element will be at the sorted index.
        if (j < i) {
            // comparing the adjacent elements
            if (arr[j] > arr[j + 1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubble(arr, i, j + 1);
        }

        else {
            bubble(arr, i - 1, 0);
        }
    }
}
