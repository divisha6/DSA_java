import java.util.Scanner;

public class ZOOZ {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		int c = 0;
		while(c<t){
		    int N = sc.nextInt();
		    String sub = "";
		    String insert= "";
		  //  even N
		    if(N%2==0){
		        sub = "100";
		        if(N==4) System.out.println("1001");
		        else{
		            insert= "00";
		            for(int i=4; i<N; i+=2){
		                sub += insert;
		            }
		            System.out.println(sub + '1');
		        }
		    }
		  //  odd length
		  else{
		      sub = "010";
		      if(N==3) System.out.println("010");
		      else{
		          insert = "10";
		          for(int i=4; i<N; i+=2){
		              sub += insert;
		          }
		          System.out.println(sub);
		      }
		  }
		  c++;
		}
        sc.close();
	}
}
