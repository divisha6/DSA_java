public class Prob1318 {
    public int minFlips(int a, int b, int c) {
        // return Math.abs(c-(a+b));
        int[] arr1 = decimalToBinary(a);
        int[] arr2 = decimalToBinary(b);
        int[] arr3 = decimalToBinary(c);
        int flips=0;

        for(int i=arr3.length-1; i>=0; i--){
            int sum = arr1[i] + arr2[i];
            if(sum!=0) sum=1;
            if(sum==arr3[i]){
                continue;
            } else {
                if(arr3[i]==0){
                    if(arr1[i]!=0 && arr2[i]!=0){
                        flips+=2;
                    } else if((arr1[i]==0 && arr2[i]!=0) || (arr2[i]==0 && arr1[i]!=0)){
                        flips++;
                    }
                } else{
                    flips++;
                }
            }
        }

        return flips;

    }

    public static int[] decimalToBinary(int num)
    {
        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;
 
        // Number should be positive
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }
        return binary;
    }
}
