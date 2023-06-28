import java.util.*;

public class ABDiff {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int product = a*b;
		int sum = a+b;
		System.out.println(Math.abs(product-sum));
        sc.close();
	}
}
