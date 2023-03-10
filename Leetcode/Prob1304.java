public class Prob1304 {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n==1 || n==0){
            return ans;
        }

        if(n%2==1){
            ans[n/2+1]=0;
        }       

        int i=0;
        int j=n-1;
        int count =1;
        while(i!=n/2){
            ans[i]=count;
            ans[j]= count*-1;
            i++;
            j--;
            count++;
        }

        return ans;
    }
}


// for commit and streak only
