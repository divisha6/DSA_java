import java.math.*;

public class Prob367 {
    public boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        if(Math.floor(sqrt)==sqrt) return true;
        return false;
    }
}
