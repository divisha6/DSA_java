public class Prob189{
    public int[] rotate(int[] arr, int k) {
        int n= arr.length;
        k=k%n;
        int[] nums = new int[k];

        // saving nums after k
        int a=0;
        for(int i=n-k; i<n; i++){
            nums[a]=arr[i];
            a++;
        }
        

        int[] wow = new int[n-k];
        int j=0;
        for(int i=0; i<n-k; i++){
            wow[j]=arr[i];
            j++;
        }
        
        int m=0;
        for(int i=0; i<k; i++){
            arr[i]=nums[m];
            m++;
        }

        for(int i=0; i<n-k; i++){
            arr[m]=wow[i];
            m++;
        }

        return arr;
    }
}