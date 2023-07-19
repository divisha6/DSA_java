
public class GameWinner {
    public static void main(String[] args) {
        String colors= "wwwbbbbwwww";
        System.out.println(gameWinner(colors));;
    } 

    public static String gameWinner(String colors){
        int wCount=0;
        int bCount=0;
        for(int i=1; i<colors.length()-1; i++){
            if(colors.charAt(i-1)=='w' && 'w'== colors.charAt(i+1)){
                wCount++;
            }
            if(colors.charAt(i-1)=='b' && 'b'== colors.charAt(i+1)){
                bCount++;
            }
        }
        if(wCount<=bCount) return "BOB";
        return "WENDY";
    }
}
