import java.util.ArrayList;
import java.util.Scanner;

public class TABLET {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int N = sc.nextInt();
		    int B = sc.nextInt();
		    sc.nextLine();
		    int max = 0;
		    ArrayList<Integer> list = new ArrayList<>();
		    for(int i=0; i<N; i++){
		        int w = sc.nextInt();
		        int h = sc.nextInt();
		        int p = sc.nextInt();
		        if(p<=B){
		            int area = w * h;
		            list.add(area);
		            max = Math.max(max, area);
		        }
		    }
		    if(!list.isEmpty())System.out.println(max);
		    else System.out.println("no tablet");
		}
		sc.close();
	}
}
