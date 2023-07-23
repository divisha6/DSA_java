package Coding_Ninjas;
public class SecondOrderElements {
    public static int secondSmallest(int a[], int n) {
        int smallest = a[0];
        int sSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < smallest) {
                sSmallest = smallest;
                smallest = a[i];
            } else if (a[i] > smallest && a[i] < sSmallest) {
                sSmallest = a[i];
            }
        }
        return sSmallest;
    }

    public static int secondLargest(int a[], int n) {
        int largest = a[0];
        int sLargest = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > largest) {
                sLargest = largest;
                largest = a[i];
            }
            else if (a[i] < largest && a[i] > sLargest) {
                sLargest = a[i];
            }
        }
        return sLargest;

    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        int res[] = new int[2];
        res[0] = secondLargest(a, n);
        res[1] = secondSmallest(a, n);

        return res;

    }
}