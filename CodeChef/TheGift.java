import java.util.Scanner;

public class TheGift {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if((M+X)>=N){ System.out.println("YES");}
		else {System.out.println( "NO");}
        sc.close();
	}

}
