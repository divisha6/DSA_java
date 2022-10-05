public class ArrayMaxVal {
    public static void main(String[] args) {
        int[] arr= {1,2,3,3,123,234,456,876};
        System.out.println(findMax(arr));
    }

        static int findMax(int[] arr){
        int maxVal= arr[0];
        for (int i = 0; i <= arr.length  ; i++) {
            if (arr[i]> maxVal) {
                maxVal=arr[i];
            }
        }

        return maxVal;
    }
}
