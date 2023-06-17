import java.util.Scanner;

public class ATMMachine {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		int i=0; 
		while(i<T){
		    String ans = "";
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    sc.nextLine();
		    for(int j=0; j<n; j++){
		        int req = sc.nextInt();
		        if(req>k) ans += '0';
		        else{
		            k -= req;
		            ans += '1';
		        }
		    }
		    System.out.println(ans);
		    i++;
		}
        sc.close();
	}
}
