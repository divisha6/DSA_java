public class Prob189{
    public int[] rotate(int[] arr, int k) {
        int len = arr.length-1;
        k=k%(len+1);
        arr = rev(arr,0,len-k);
        arr=rev(arr,len-k+1,len);
        arr=rev(arr,0,len);
        return arr;
    }

   public int[] rev(int[] arr,int low,int hi)
    {
        while(low<hi)
        {
           int temp=arr[low];
           arr[low]=arr[hi];
           arr[hi]=temp;
           hi--;
           low++;
        }
        return arr;
}
}