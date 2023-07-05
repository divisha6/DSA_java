import java.util.Arrays;
import java.util.Scanner;

public class BestOfTwo {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int[] A = new int[3];
		    int[] B = new int[3];
		    for(int i =0; i<3; i++){
		        int a = sc.nextInt();
		        A[i]=a;
		    }
		    
		    for(int i =0; i<3; i++){
		        int b = sc.nextInt();
		        B[i]=b;
		    }
		    
		    Arrays.sort(A);
		    Arrays.sort(B);
		    int asum = A[1] + A[2];
		    int bsum = B[1] + B[2];
		    
		    if(asum > bsum){
		        System.out.println("Alice");
		    } else if(asum < bsum){
		        System.out.println("Bob");
		    } else {
		        System.out.println("Tie");
		    }
		}
        sc.close();
	}
}
