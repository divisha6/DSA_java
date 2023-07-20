package IB;

import java.util.Arrays;

// Write a function solution that, given an array A of N integers, 
// returns the largest integer K > 0 such that both values K and -K(the opposite number) 
// exist in array A. If there is no such integer, the function should return 0.
public class ReturnK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0,-5,-6,-1};
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,0,12, -5,-6,-1, -12, -15, 14};
        System.out.println(findNum(arr));
        System.out.println(findNum(arr1));
        System.out.println(findNum(arr2));
    }

    public static int findNum(int[] arr){
        Arrays.sort(arr);
        int i= 0;
        int j=arr.length-1;
        while(i<j){
            if(arr[j]>Math.abs(arr[i])){
                j--;
            } else if(arr[j]==arr[i]*-1){
                return arr[j];
            } else if(Math.abs(arr[i])>arr[j]){
                i++;
            }
        }
        return 0;
    }
}
