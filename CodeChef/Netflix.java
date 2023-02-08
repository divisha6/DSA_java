import java.util.*;

public class Netflix {
    public static void main (String[] args) throws java.lang.Exception
	{
		int m, n, i, j;   
        Scanner sc=new Scanner(System.in);   
           
        //taking row as input  
        m = sc.nextInt();
         
        int array[][] = new int[m][4];   
          
        //loop for row  
        for (i = 0; i < m; i++){
            for (j = 0; j < 4; j++){
                array[i][j] = sc.nextInt();    
            }     
        }  
        
        for (i = 0; i < m; i++){   
            if(array[i][0]+array[i][1]>=array[i][3] || 
                array[i][2] + array[i][1]>=array[i][3] ||
                    array[i][0] + array[i][2]>=array[i][3]){
                        System.out.println("YES");
                    }
            else {
                System.out.println("NO");
            }
	    }
    }
}
