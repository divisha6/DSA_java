package Sorting_Algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr){
        // run the loop n-1 times
        boolean swapped= true;
        for (int i = 0; i < arr.length; i++) {
            // for each step, it will scan only length-i elements
            for(int j= 1; j< arr.length-i; j++){
                // swap if the jth element is smaller than (j-1)th element
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                    swapped= false;
                }
            }
            if (swapped == false){
                break;
            }
        }
    }
}