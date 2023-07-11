import java.util.HashMap;
import java.util.Scanner;

public class Candies{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int n = sc.nextInt();
		    int len = 2*n;
		    sc.nextLine();
		    boolean isValid=true;
		    HashMap<Integer, Integer> map = new HashMap<>();
		    while(len-->0){
		        int c = sc.nextInt();
		        map.put(c, map.getOrDefault(c,0)+1);
		    }
		    for(int key : map.keySet()){
		        if(map.get(key)>2){
		            isValid = false;
		        }
		    }
		    if(isValid){
		        System.out.println("Yes");
		    } else System.out.println("No");
		}
        sc.close();
	}
}
