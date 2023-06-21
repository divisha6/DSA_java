import java.util.Scanner;

public class DonationRewards {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int N = sc.nextInt();
		    if(N<=3){
		        System.out.println("BRONZE");
		    } else if (N>3 && N<=6){
		        System.out.println("SILVER");
		    } else System.out.println("GOLD");
		}
		sc.close();
	}
}
