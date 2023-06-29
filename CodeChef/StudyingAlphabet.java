import java.util.*;

public class StudyingAlphabet {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String known = sc.nextLine();
		HashSet<Character> set = new HashSet<>();
		for(int i=0; i<known.length(); i++){
		    set.add(known.charAt(i));
		}
		
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    boolean canRead= true;
		    String s= sc.nextLine();
		    for(int i=0; i<s.length(); i++){
		        if(!set.contains(s.charAt(i))){
		            canRead=false;
		        }
		    }
		    if(canRead)System.out.println("Yes");
		    else System.out.println("No");
		}
        sc.close();
	}
}
