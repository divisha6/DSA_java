// package Hackerrank;
import java.util.*;

public class Candies {
    public static long candies(int n, List<Integer> arr) {
        // Write your code here
        long sum=0;
        int[] ans = new int[arr.size()];
        ans[0]=1;
        Arrays.fill(ans,1);
        for(int i=1; i<arr.size(); i++){
            if(arr.get(i)>arr.get(i-1)){
                ans[i]= ans[i-1]+1;
            }
        }
        
        for(int i=arr.size()-2; i>=0; i--){
            if(arr.get(i)>arr.get(i+1)){
                ans[i]=Math.max(ans[i+1]+1, ans[i]);
            }
        }
        
        for(int i:ans){
            sum += i;
        }
            
            return sum;
        }
}
