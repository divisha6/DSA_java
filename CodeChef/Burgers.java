import java.util.*;

public class Burgers {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    System.out.println(Math.min(a,b));
		}
	}
}
