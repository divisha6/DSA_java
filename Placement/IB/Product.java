package IB;
// Given an array of integers, calculate the product
// If product > 0 return 1
// Else if product < 0 return -1
// Else return 0


public class Product {
    public static void main(String[] args) {
        int[] arr1 = {1,2,-7,9,-2,-6}; //neg
        int[] arr2 = {1,2,0,9,-2,-6}; //zero
        int[] arr3 = {1,2,-7,9,-2,6}; //pos
        
        System.out.println(prod(arr1));
        System.out.println(prod(arr2));
        System.out.println(prod(arr3));
    }

    public static int prod(int[] arr){
        int neg =0 ;
        for(int i =0; i<arr.length; i++){
            if(arr[i]<0){
                neg++;
            } else if(arr[i]==0){
                return 0;
            }
        }

        if(neg %2 ==1) return -1;
        return 1;
    }
}
