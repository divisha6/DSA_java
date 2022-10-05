package Sorting_Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {90, 56, 45, 34, 23, 12, 11, 7, -1, -5};
        int target= 45;
        int ans= binarySearch(arr, target);
        System.out.println(ans);
    }

    //return the index
    static int binarySearch (int[] arr, int target){
        int start= 0;
        int end= arr.length -1;

        while (start <= end){
            //return middle element
            int mid= start + (end-start)/ 2;

        if (target < arr[mid]){
            start= mid + 1;
        }
        else if (target > arr[mid]){
            end= mid -1;
                }
        else {
            return mid;
        }
    }
    //this means element doesnt exist
    return -1;
}}

