import java.util.Scanner;

public class DIGARR {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    boolean five = false;
		    int n = sc.nextInt();
		    sc.nextLine();
		    String s = sc.nextLine();
		    for(int i=0; i<n; i++){
		        char c = s.charAt(i);
		        if(c=='0' || c=='5'){
		            five=true;
		        }
		    }
		    if(five) System.out.println("Yes");
		    else System.out.println("No");
		}
		sc.close();
	}
}
