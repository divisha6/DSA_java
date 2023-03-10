public class Prob2177 {
    public long[] sumOfThree(long num) {
        long[] ans = new long[3];

        if(num%3 != 0){
            long[] arr ={};
            return arr;
        }

        long mid = num/3;
        ans[0]= mid-1;
        ans[1]=mid;
        ans[2]=mid+1;

        return ans;
    }
}
