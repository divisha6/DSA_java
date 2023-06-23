import java.util.Scanner;

public class TTENIS {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int chef =0 ; int opp=0;
		    String s = sc.nextLine();
		    for(int i =0; i<s.length(); i++){
		        char c = s.charAt(i);
		        if(c=='1') chef++;
		        else if(c=='0') opp++;
		    }
		    if(chef>opp) System.out.println("WIN");
		    else System.out.println("LOSE");
		}
		sc.close();
	}
}
