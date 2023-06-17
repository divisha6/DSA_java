import java.util.*;
public class EasyPronunciation {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		int i=0; 
		while(i<T){
		    // int n = sc.nextInt();
		    sc.nextLine();
		    String s = sc.nextLine();
		    System.out.println(easy(s));
		    i++;
		}
        sc.close();
	}
	
	public static String easy(String s){
	    HashSet<Character> vowel = new HashSet<>();
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		int con=0;
		int max = 0;
		    for(int j=0; j<s.length(); j++){
		        char c = s.charAt(j);
		        if(!vowel.contains(c)){
		            con++;
		            max = Math.max(con, max);
		        } else{
		            con=0;
		        }
		    }
		    if(max>=4) return "NO";
		    return "YES";
	}
}
