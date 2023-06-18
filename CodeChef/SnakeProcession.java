import java.util.Scanner;

public class SnakeProcession {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		sc.nextLine();
		while(R-->0){
		    // int len = sc.nextInt();
		    sc.nextLine();
		    String s = sc.nextLine();
		    s = s.replace(".", "");
		    s = s.replace("HT", "");
		    
		    if(s.trim().length()==0) System.out.println("Valid");
		    else System.out.println("Invalid");
		    
		}
		sc.close();
	}
}
