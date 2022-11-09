import java.util.Arrays;

public class MoveZeroes {
    static int count=0;

    public static void main(String[] args) {
        int[] nums= {0,1,3,0,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));;
    }

    public static void moveZeroes(int[] nums) {
        if(nums.length==1){
        return;
    }
        
        for (int i=0 ; i < nums.length; i++){
            if (nums[i]!=0){
                int temp= nums[i];
                nums[i]= nums[count];
                nums[count]= temp;
                count++;     
            }
            else{

            }
            
            
        }
    
}
}
