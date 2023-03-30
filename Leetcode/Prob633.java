public class Prob633 {
    public boolean judgeSquareSum(int c) {
        if(c==0) return true;
        for(int i=0; i<c; i++){
            double sq1= Math.pow(i,2);
            if(sq1>c) break;
            int sq2= c- (int)sq1;
            if(isSquareRoot(sq2)) return true;
        }
        return false;
    }

    public boolean isSquareRoot(int num){
        double sqrt = Math.sqrt(num);
        if(Math.floor(sqrt)==sqrt) return true;
        return false;
    }
}
