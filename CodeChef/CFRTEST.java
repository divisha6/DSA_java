import java.util.HashSet;
import java.util.Scanner;

public class CFRTEST {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int n = sc.nextInt();
		    HashSet<Integer> set = new HashSet<>();
		    while(n-->0){
		        int day = sc.nextInt();
		        set.add(day);
		    }
		    System.out.println(set.size());
		}
        sc.close();
	}
}
