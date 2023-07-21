package Sorting_Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {1,5,9,12,9,76,53,92,88};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
         for(int i = 0; i < arr.length; i++) {
            // find the biggest element in the given array and swap with the correct index
            int last= arr.length - i-1;
            int maxIndex= getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        // System.out.println(arr);
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max= start;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap (int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp; 
    }
}
