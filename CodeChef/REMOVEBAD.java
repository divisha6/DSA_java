import java.util.*;

public class REMOVEBAD {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int k = sc.nextInt();
		    sc.nextLine();
		    HashMap<Integer, Integer> map = new HashMap<>();
		    int n = k;
		    while(n-->0){
		        int i=sc.nextInt();
		        map.put(i, map.getOrDefault(i,0)+1);
		    }
		    int max =0;
		    for(int key : map.keySet()){
		        int val = map.get(key);
		        max = Math.max(max,val);
		    }
		    
		    int moves = k - max;
		    System.out.println(moves);
		}
        sc.close();
	}
}
