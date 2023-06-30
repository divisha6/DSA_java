import java.util.Scanner;

public class EqualCardGame {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int n = sc.nextInt();
		    int req = 52 % n;
		    System.out.println(req);
		}
        sc.close();
	}
}
