import java.util.HashSet;
import java.util.Scanner;

public class ProgrammingLanguages {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		int i=0;
		while(i<T){
		   HashSet<Integer> zero = new HashSet<>(); 
		   int a = sc.nextInt();
		   int b = sc.nextInt();
		   zero.add(a); zero.add(b);
		   HashSet<Integer> one = new HashSet<>(); 
		   int a1 = sc.nextInt();
		   int b1 = sc.nextInt();
		   one.add(a1); one.add(b1);
		   HashSet<Integer> two = new HashSet<>(); 
		   int a2 = sc.nextInt();
		   int b2 = sc.nextInt();
		   two.add(a2); two.add(b2);
		   
		   if(zero.equals(one)) System.out.println(1);
		   else if(zero.equals(two)) System.out.println(2);
		   else System.out.println(0);
		   i++;
		}
        sc.close();
	}
}
