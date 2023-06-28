import java.util.Scanner;

public class BinaryStringCost {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    // int N = sc.nextInt();
		    int X = sc.nextInt(); //01
		    int Y = sc.nextInt(); //10
		    sc.nextLine();
		
		    String s = sc.nextLine();
		    if(s.contains("0")&&s.contains("1")){
		        System.out.println(Math.min(X,Y));
		    } else{
		        System.out.println(0);
		    }
		}
		sc.close();
	}
}
