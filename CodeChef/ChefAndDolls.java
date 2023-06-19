import java.util.ArrayList;
import java.util.Scanner;

public class ChefAndDolls {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int n = sc.nextInt();
		    ArrayList<Integer> list = new ArrayList<>();
		    while(n-->0){
		        sc.nextLine();
		        int doll = sc.nextInt();
		        
		        if(list.contains(doll)) list.remove(list.indexOf(doll));
		        else list.add(doll);
		    }
		    System.out.println(list.get(0));
		}
        sc.close();
	}
}
