import java.util.*;

public class GoodNumbers{
    ArrayList<Integer> goodNumbers(int L, int R, int D) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i= L; i<R+1; i++){
            int sum=0; 
            int n=i;
            if(isValid(n, D)){
                list.add(n);
            }
        }
        return list;
    }
    
    static boolean isValid(int n, int d)
    {
        // Get last digit and initialize sum from right side
        int digit = n%10;
        int sum = digit;
 
        // If last digit is d, return
        if (digit == d)
        return false;
 
        // Traverse remaining digits
        n /= 10;
        while (n>0)
        {
            // Current digit
            digit = n%10;
     
            // If digit is d or digit is less than or
            // equal to sum of digits on right side
            if (digit == d || digit <= sum)
                return false;
 
            // Update sum and n
                else
                {
                    sum += digit;
                    n /= 10;
                }
        }
    return true;
    }
}