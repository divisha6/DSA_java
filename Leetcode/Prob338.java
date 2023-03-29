public class Prob338 {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
            ans[i]=countOne(i);
        }
        return ans;
    }

    public int countOne(int num){
        int count=0;
        int[] binary = new int[35];
        int id = 0;
 
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }

        for(int i=0; i<binary.length; i++){
            if(binary[i]==1) count++;
        }
        return count;
    }
}
