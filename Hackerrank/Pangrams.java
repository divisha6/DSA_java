import java.util.Arrays;

public class Pangrams {
    public static String pangrams(String s) {
    // Write your code here
    // char-65
    String su = s.toUpperCase();
    boolean[] arr = new boolean[26];
    Arrays.fill(arr, false);
    for(int i=0; i<s.length(); i++){
        if(su.charAt(i)!=' '){
            int idx = su.charAt(i)-65;
            arr[idx]=true;
        } else{
            continue;
        }
    }
        
    for(boolean ans : arr){
        if(ans==false) return "not pangram";
    }
    
    return "pangram";
    
    }
}
