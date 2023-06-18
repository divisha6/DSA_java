import java.util.HashSet;
import java.util.Scanner;

public class HappyString {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		HashSet<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    String s = sc.nextLine();
		    int maxVow = 0;
		    int vow = 0;
		    for(int i=0; i<s.length(); i++){
		        char c = s.charAt(i);
		        if(set.contains(c)){
		            vow++;
		            maxVow = Math.max(vow, maxVow);
		        } else{
		            vow=0;
		        }
		    }
		    if(maxVow>2) System.out.println("Happy");
		    else System.out.println("Sad");
		}
		
		sc.close();
	}
}
