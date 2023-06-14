public class CamelCase {
    public static int camelcase(String s) {
        // Write your code here
        int words=1;
        for(char c : s.toCharArray()){
            if(c>64 && c<91){
                words++;
            }
        }
        
        return words;
    
        }
}
