public class Prob1281 {
    public int subtractProductAndSum(int n) {
        int p = n;
        int product =1; 
        int sum=0;
        // finding product
        while(p>1){
            int d = p%10;
            p = p/10;
            product = product*d;
        }

        p=n;
        // finding sum
        while(p>0){
            int d = p%10;
            p = p/10;
            sum += d;
        }
        return product-sum;
    }
}
