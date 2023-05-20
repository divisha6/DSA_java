public class Prob1456 {
    public int maxVowels(String s, int k) {
        long count=0;
        long curr=0;
        for(int i =0; i<k; i++){
            if(isVowel(s.charAt(i))) curr++;
        }
        count=curr;

        for(int i =k; i<s.length(); i++){

            if(isVowel(s.charAt(i-k))) curr--;
            if(isVowel(s.charAt(i))) curr++;

            count = Math.max(count, curr);
        }
        return (int) count;
    }

    public boolean isVowel(char a){
        if(a=='a' || a == 'e' || a=='i' || a=='o' || a=='u'){
            return true;
        }
        return false;
    }
}
