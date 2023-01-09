public class Prob69 {
    public int mySqrt(int x) {
        double ans = 0;
        if(x<0){
            x= x*-1;
        }
        ans= Math.sqrt(x);

        return (int)ans;
    }
}