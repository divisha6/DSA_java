import java.util.HashSet;
import java.util.Scanner;

public class HEADBOB {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0){
            int N = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            HashSet<Character> set = new HashSet<>();
            for(int i=0; i<N ; i++){
                char c = s.charAt(i);
                set.add(c);
            }
            
            if(set.contains('I')){
                System.out.println("INDIAN");
            } else if(set.contains('Y')){
                System.out.println("NOT INDIAN");
            } else{
                System.out.println("NOT SURE");
            }
        }
        sc.close();
	}
}
