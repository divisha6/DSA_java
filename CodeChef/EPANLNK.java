import java.math.BigInteger;
import java.util.Scanner;

public class EPANLNK {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    BigInteger n = new BigInteger(sc.next());
            BigInteger rem = n.mod(BigInteger.valueOf(20));
            System.out.println(rem);
		}
		sc.close();
	}
}
