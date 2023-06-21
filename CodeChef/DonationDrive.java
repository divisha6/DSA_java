import java.util.*;
public class DonationDrive {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    System.out.println(N-K);
		}
		sc.close();
	}
}
