import java.util.Scanner;

public class CodeChefStreak{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //testcases
		int i=0;
		while(i<T){
    		int N = sc.nextInt(); //number of days
    		int om =0;
    		int addy =0;
    		int maxOm=0;
    		int maxAddy=0;
    		
    		for(int j=0; j<N; j++){
    		    int sumSolved = sc.nextInt();
    		    if(sumSolved!=0) om++;
    		    if(sumSolved==0) om=0;
    		    maxOm = Math.max(maxOm, om);
    		}
    		
    		for(int j=0; j<N; j++){
    		    int sumSolved = sc.nextInt();
    		    if(sumSolved!=0) addy++;
    		    if(sumSolved==0) addy=0;
    		    maxAddy = Math.max(maxAddy, addy);
    		}
    		
    		if(maxOm > maxAddy) System.out.println("OM");
    		else if(maxOm < maxAddy) System.out.println("ADDY");
    		else System.out.println("DRAW");
    		
    		i++;
		}

        sc.close();
	}
}