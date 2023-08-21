import java.util.Scanner;

public class Monopoly {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    
		    int sum =0;
		    int max = Math.max(a,Math.max(b,Math.max(c,d)));
		    if(a==max){
		        sum = b + c + d;
		    }
		    
		    if(b==max){
		        sum = a + c + d;
		    }
		    
		    if(c==max){
		        sum = b + a + d;
		    }
		    
		    if(d==max){
		        sum = b + c + a;
		    }
		    
		    if(max>sum){
		        System.out.println("YES");
		    } else {
		        System.out.println("NO");
		    }
		    
		}
        sc.close();
	}
}
