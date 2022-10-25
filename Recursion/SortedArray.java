public class SortedArray {
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,81,81};
        System.out.println(sorted (array, 0));
    }

    public static boolean sorted (int[] arr, int i) {
        if (i==arr.length-1){
            return true ;
        }

        return (arr[i] < arr[i+1]) && sorted(arr, i+1);
}
}
