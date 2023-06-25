import java.util.Scanner;

public class CuttingRecipes {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    int val=0;
		    for(int i=0; i<n; i++){
		        arr[i]=sc.nextInt();
		        if(i>0){
		            if(i==1){
		                val = gcd(arr[1], arr[0]);
		            } else{
		                val= gcd(arr[i], val);
		            }
		        }
		    }
		    
		    for(int i=0; i<n; i++){
		        System.out.print(arr[i]/val + " ");
		    }
		    
		    System.out.println();
		}
        sc.close();
	}
	
	public static int gcd(int e, int z){
        if (e==0){
            return z;
        }
        else {
            return gcd(z%e, e);
        }
    }
}
