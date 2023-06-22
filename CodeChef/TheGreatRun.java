import java.util.Scanner;

public class TheGreatRun {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int N = sc.nextInt(); //length of track
		    int K = sc.nextInt(); //good range
		    int[] arr = new int[N];
		    for(int i =0; i<N; i++){
		        arr[i]=sc.nextInt();
		    }
		    
		   int max=0;
		   
		    for(int k=0;k<N-K+1;k++){
		         int sum =0;
		        for(int n=k;n<k+K;n++){
		             sum = sum + arr[n];
		        }
		        if(sum>max){
		            max = sum;
		        }
		        
		    }
		    System.out.println(max);
		}
        sc.close();
	}
}
