import java.util.*;

public class Prob204 {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] prime = new boolean[n+1];
        int count=0;

        Arrays.fill(prime, true);
        prime[0]=false;
        prime[1]=false;
        // sieve of Erastothenes- true if the ith number is prime; else false;
        for(int i=2; i*i<=n; i++){
            for(int j=2*i; j<=n; j=j+i){
                prime[j]=false;
            }
        }

        for(int i=0; i<n; i++){
            if(prime[i]){
                count++;
            }
        }
        
        return count;
    }
}
