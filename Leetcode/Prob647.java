public class Prob647 {
    public int countSubstrings(String s) {
        int count=s.length();
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length();j++){
                if(isPalindrome(s,i,j)) count++;
            }
        }
        return count;
    }

    public boolean isPalindrome(String s, int left, int right)
    {
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}