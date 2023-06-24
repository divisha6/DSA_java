import java.util.Scanner;

public class SortTheString {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int n = sc.nextInt();
		    sc.nextLine();
		    String s = sc.nextLine();
		    int moves=0;
		    for(int i=1; i<n; i++){
		        if(s.charAt(i)=='0' && s.charAt(i-1)=='1'){
		            moves++;
		        }
		    }
		  //  if(s.charAt(s.length()-1)=='1') moves--;
		    System.out.println(moves);
		}
        sc.close();
	}
}
