public class Prob1328 {
    public String breakPalindrome(String s) {
        if(s.length() == 1){
            return "";
        }
        
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(s.length()%2!=0){
                if(i == arr.length/2){
                    continue;
                }
            }

            if(arr[i]!='a'){
                arr[i]='a';
                if(!isPalindrome(arr)) break;
            }

            if(i == s.length()-1 && arr[i]=='a'){
                arr[i]='b';
            }
        }

        String ans = "";
        for(int i=0; i<arr.length; i++){
            ans += arr[i];
        }

        return ans;
    }

    public boolean isPalindrome(char[] arr){
        int i=0; int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}
