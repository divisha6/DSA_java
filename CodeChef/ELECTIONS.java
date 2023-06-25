import java.util.Scanner;

public class ELECTIONS {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    int over50 = 0;
		    String winner = "";
		    if(A>50) {over50++; winner="A";}
		    if(B>50) {over50++; winner="B";}
		    if(C>50) {over50++; winner="C";}
		    
		    if(over50==1) System.out.println(winner);
		    else System.out.println("NOTA");
		}
        sc.close();
	}
}
