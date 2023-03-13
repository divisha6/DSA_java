import java.util.*;
// time complexity: O(n) 
import java.util.Comparator;

// very nice
// You are given n activities with their start and end times. Select the maximum
// number of activities that can be performed by a single person, assuming that
// a person can only work on a single activity at a time. Activities are sorted
// according to end time.

// start= [10,12,20]
// end = [20,25,30]

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        // these are sorted on the basis of end time

        // incase the end array is not sorted
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // sorting using lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity is always included because it ends the first
        maxAct = 1;
        int lastEnd = end[0];
        ans.add(0);
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activities " + maxAct);
        System.out.println("Activities selected are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.err.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
