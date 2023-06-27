import java.util.Scanner;

public class OddPairs {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    long n = sc.nextLong();
		    long pairs = n * n / 2;
		    System.out.println(pairs);
		}
		sc.close();
	}
}
