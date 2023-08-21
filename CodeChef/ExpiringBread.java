import java.util.Scanner;

public class ExpiringBread {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int loaves = sc.nextInt();
		    int eat = sc.nextInt();
		    int days = sc.nextInt();
		    int finish = eat*days;
		    if(finish>=loaves){
		        System.out.println("YES");
		    } else {
		        System.out.println("NO");
		    }
		}
        sc.close();
	}
}
