public class Prob258 {
    public int addDigits(int num) {
        int sum = num/10 + num%10;
        if(sum <=9){
            return sum;
        }

        return addDigits(sum);
    }
}
