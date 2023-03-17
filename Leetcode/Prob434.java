public class Prob434 {
    public int countSegments(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }

        String[] parts = s.split("\\s+");
        return parts.length;
    }
}
