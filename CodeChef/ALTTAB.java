import java.util.*;

public class ALTTAB {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		Stack<String> st = new Stack<>();
		HashSet<String> set = new HashSet<>();
		while(T-->0){
		    String prog = sc.nextLine();
		    st.push(prog);
		}
		
		while(!st.isEmpty()){
		    String curr = st.peek();
		    if(!set.contains(curr)){
		        set.add(curr);
		        System.out.print(curr.charAt(curr.length()-2));
		        System.out.print(curr.charAt(curr.length()-1));
		    }
		    st.pop();
		}
		sc.close();
	}
}
