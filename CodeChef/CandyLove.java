import java.util.*;

public class CandyLove {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int n = sc.nextInt();
		    sc.nextLine();
		    int candies =0;
		    while(n-->0){
		        int c = sc.nextInt();
		        candies += c;
		    }
		    if(candies%2==1){
		        System.out.println("YES");
		    } else{
		        System.out.println("NO");
		    }
		}
        sc.close();
	}
}
