import java.util.*;

public class Battery_Health{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner a = new Scanner(System.in);
		int numberOfInputs = a.nextInt();
		int[] batteries = new int[numberOfInputs];
		
		for(int i=0; i<numberOfInputs; i++){
		    batteries[i]= a.nextInt();
		}
		
		for(int i=0; i<numberOfInputs; i++){
		    if(batteries[i]>=80){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		a.close();
	}
}