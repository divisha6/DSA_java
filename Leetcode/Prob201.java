public class Prob201 {
    public int rangeBitwiseAnd(int left, int right) {
        while(right > left){
            right = right & right-1;
        }
        return right & left;
    }
}
