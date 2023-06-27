import java.util.Scanner;

public class ChefAndString {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    String s = sc.nextLine();
		    if(s.length()==0){
		        System.out.println("NO");
		    }
		    else{
		        char first = s.charAt(0);
		        char last = s.charAt(s.length()-1);
    		    StringBuffer left = new StringBuffer(s);
    		    StringBuffer right = new StringBuffer(s);
    		    left.deleteCharAt(0);
    		    left.append(first);
    		    right.deleteCharAt(right.length()-1);
    		    right.insert(0,last);
    		    
    		    if(left.toString().equals(right.toString())){
    		        System.out.println("YES");
    		    } else{
    		        System.out.println("NO");
    		    }
		    }
		}
		sc.close();
	}
}
