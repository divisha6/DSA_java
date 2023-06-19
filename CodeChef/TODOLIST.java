import java.util.Scanner;

public class TODOLIST {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int n = sc.nextInt();
		    sc.nextLine();
		    int count = 0;
		    for(int i=0; i<n; i++){
		        int diff = sc.nextInt();
		        if(diff>=1000) count++;
		    }
		    System.out.println(count);
		}
        sc.close();
	}
}
