import java.util.HashMap;
import java.util.Scanner;

public class TransfusionChain {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    HashMap<String, Integer> map = new HashMap<>();
		    // int n = sc.nextInt();
		    sc.nextLine();
		    String donors = sc.nextLine();
		    String[] don = donors.split(" ");
		    for(int i=0; i<don.length; i++){
		        map.put(don[i], map.getOrDefault(don[i],0)+1);
		    }
		    
		  //  1 chain O -> A -> AB
		  int one = map.getOrDefault("O",0) + map.getOrDefault("A",0) + map.getOrDefault("AB",0);
		    
		  //  2 chain O -> B -> AB
		  int two = map.getOrDefault("O",0) + map.getOrDefault("B",0) + map.getOrDefault("AB",0);
		  
		  //3 chain O -> AB
		  int three = map.getOrDefault("O",0)+ map.getOrDefault("AB",0);
		  
		  int high = Math.max(one, Math.max(two, three));
		  System.out.println(high);
		}
		sc.close();
	}
}
