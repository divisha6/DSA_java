import java.util.Scanner;

public class Wordle{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		int c = 0;
		while(c<t){
		    String S = sc.nextLine();
		    String T = sc.nextLine();
		    String ans = "";
		    for(int i=0; i<S.length(); i++){
		        if(S.charAt(i)==T.charAt(i)){
		            ans += 'G';
		        } else{
		            ans += 'B';
		        }
		    }
		    System.out.println(ans);
		    c++;
		}
        sc.close();
	}
}