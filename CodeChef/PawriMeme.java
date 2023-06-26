import java.util.Scanner;

public class PawriMeme {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    String s = sc.nextLine();
		    s = s.replace("party", "pawri");
		    System.out.println(s);
		}
        sc.close();
	}
}
