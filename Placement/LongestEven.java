package Placement;

public class LongestEven {
    public static void main(String[] args) {
        String test= "hey";
        System.out.println(even(test));
    }

    public static String even(String s){
        String[] arr = s.split(" ");
        long length=0;
        String ans="00";
        for(int i=0; i<arr.length; i++){
            long len = arr[i].length();
            if(len%2==0 && len>length){
                length=len;
                ans = arr[i];
            }
        }
        return ans;
    }
}
