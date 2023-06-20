import java.util.Scanner;

public class ChefDiet {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    int A[]= new int[N];
		    for(int i=0;i<N;i++){
		        A[i]= sc.nextInt();
		    }
		    int ct=0,ptn=0;
		    for(int j=0;j<N;j++){
		
		        if(A[j]+ptn >=K){
		            ct++;
		            ptn= Math.abs(K-(A[j]+ptn));
		        }
		        else{
		            int D = j + 1;
		            System.out.println("NO " + D);
		            break;
		        }
		    }
		    if(ct==N) System.out.println("YES");
		}
        sc.close();
    }
}
