import java.util.*;

public class Prob881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats=0;
        // remember that boat can carry at the most 2 people
        int start=0;
        int end=people.length-1;
        while(start<=end){
            if(people[start] + people[end]<=limit){
                boats++;
                start++;
                end--;
            } else{
                boats++;
                end--;
            }
        }
        return boats;
    }
}
