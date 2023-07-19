// Java program to check if a given
// array form AP, GP or HP
import java.util.*;
 
class ForcePoint{
  
// Returns true if arr[0..n-1]
// can form AP
static boolean checkIsAP(double arr[], int n)
{
    // Base Case
    if (n == 1)
        return true;
  
    // Sort array
    Arrays.sort(arr);
  
    // After sorting, difference
    // between consecutive elements
    // must be same.
    double d = arr[1] - arr[0];
  
    // Traverse the given array and
    // check if the difference
    // between ith element and (i-1)th
    // element is same or not
    for (int i = 2; i < n; i++) {
        if (arr[i] - arr[i - 1] != d) {
            return false;
        }
    }
  
    return true;
}
  
// Returns true if arr[0..n-1]
// can form GP
static boolean checkIsGP(double arr[], int n)
{
    // Base Case
    if (n == 1)
        return true;
  
    // Sort array
    Arrays.sort(arr);
  
    // After sorting, common ratio
    // between consecutive elements
    // must be same.
    double r = arr[1] / arr[0];
  
    // Traverse the given array and
    // check if the common ratio
    // between ith element and (i-1)th
    // element is same or not
    for (int i = 2; i < n; i++) {
        if (arr[i] / arr[i - 1] != r)
            return false;
    }
  
    return true;
}
  
// Returns true if arr[0..n-1]
// can form HP
static boolean checkIsHP(double arr[], int n)
{
    // Base Case
    if (n == 1) {
        return true;
    }
  
    double []rec = new double[n];
  
    // Find reciprocal of arr[]
    for (int i = 0; i < n; i++) {
        rec[i] = ((1 / arr[i]));
    }
  
    // After finding reciprocal, check if
    // the reciprocal is in A. P.
    // To check for A.P.
    if (checkIsAP(rec, n))
        return true;
    else
        return false;
}

public static void check(double[]arr){
    int n = arr.length;
    int flag = 0;
  
    // Function to check AP
    if (checkIsAP(arr, n)) {
        System.out.print("Yes, An AP can be formed"
             +"\n");
        flag = 1;
    }
  
    // Function to check GP
    if (checkIsGP(arr, n)) {
        System.out.print("Yes, A GP can be formed"
             +"\n");
        flag = 1;
    }
  
    // Function to check HP
    if (checkIsHP(arr, n)) {
        System.out.print("Yes, A HP can be formed"
             +"\n");
        flag = 1;
    }
  
    else if (flag == 0) {
        System.out.print("No");
    }
}
  
// Driver's Code
public static void main(String[] args)
{
    double arr[] = { 1.0 / 5.0, 1.0 / 10.0, 1.0 / 15.0, 1.0 / 20.0 };
    double arr1[] = { 5.0, 10.0, 15.0, 20.0 };
    double arr2[] = { 3.0, 9.0, 27.0, 81.0 };
    
    check(arr2);
    check(arr1);
    check(arr);
}
}