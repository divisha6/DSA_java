public class Prob1859 {
    public String sortSentence(String s) {
        if(s.length()==1) return s.substring(0,s.length()-1);
        
        String[] arr = s.split(" ");
        String[] v = new String[arr.length];
        for(int i=0; i<arr.length; i++){
            char c = arr[i].charAt(arr[i].length()-1);
            int n = c - '0';
            String rem = arr[i].substring(0, arr[i].length()-1);
            v[n-1]=rem;
        }

        String ans = "";
        for(int i=0; i<v.length; i++){
            ans += v[i] + " ";
        }

        return ans.trim();
    }
}
