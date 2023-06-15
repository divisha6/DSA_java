public class MarsExploration {
    public static int marsExploration(String s) {
    // Write your code here
    int count=0;
    for(int i=0; i<s.length(); i++){
        char c = s.charAt(i);
        if((i+1)%3 == 1 && c!='S') count++;
        if((i+1)%3 == 2 && c!='O') count++;
        if((i+1)%3 == 0 && c!='S') count++;
        
    }
        return count;
    }
}
